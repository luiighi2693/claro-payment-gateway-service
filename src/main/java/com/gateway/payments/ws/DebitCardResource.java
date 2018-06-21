
package com.gateway.payments.ws;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Date;
import java.util.Properties;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.e4gslab.ebill.payment.gateway.model.Aplication;
import com.e4gslab.ebill.payment.gateway.model.AuthorizationIpApplication;
import com.e4gslab.ebill.payment.gateway.model.AuthorizationIpApplicationPK;
import com.e4gslab.ebill.payment.gateway.model.Merchant;
import com.e4gslab.ebill.payment.gateway.model.PaymentTransaction;
import com.gateway.payments.business.MerchantBO;
import com.gateway.payments.dao.AplicationDAO;
import com.gateway.payments.dao.AuthorizationApplicationDAO;
import com.gateway.payments.dao.PaymentTransactionDAO;
import com.gateway.payments.domain.ProcessDebitCardRequest;
import com.gateway.payments.domain.ResponseCreditCardProcess;
import com.gateway.payments.domain.ResponseDebitCardProcess;
import com.gateway.payments.proxy.PaymentsProxy;
import com.gateway.payments.proxy.PaymentsProxyImpl;
import com.gateway.payments.util.AES;
import com.gateway.payments.util.ErrorProperties;
import com.gateway.payments.util.GeneralError;
import com.gateway.payments.util.Generate;
import com.gateway.payments.util.InternalError;
import com.gateway.payments.util.MultiMerchantCheckoutPayment;
import com.google.gson.Gson;

/**
 * REST Web Service
 *
 * @author dthompson
 */
@Path("debitcard")
public class DebitCardResource {

	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger
			.getLogger(DebitCardResource.class.getName());

	@Context
	private UriInfo context;

	@Autowired(required = true)
	private AplicationDAO appDAO;

	@Autowired
	private PaymentTransactionDAO paymentDAO;

	@Autowired
	private AuthorizationApplicationDAO authorizationDAO;

	@Autowired
	private ErrorProperties errorProperties;

	@Autowired
	private MerchantBO merchantBO;

	@Autowired
	@Qualifier("configurationSoapMsg")
	private Properties soapMsg;

	/**
	 * Creates a new instance of GenericResource
	 */
	public DebitCardResource() {
	}

	@POST
	@Path("process")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response process(ProcessDebitCardRequest requestEncrypt, @Context HttpServletRequest request)
			throws JSONException {

		logger.info("Inicio del metodo processCreditCard");
		logger.info("IP que hace la llamada: " + request.getRemoteHost());
		logger.info("Puerto de la llamada: " + request.getRemotePort());

		ProcessDebitCardRequest decryptRequest = null;
		PaymentTransaction payment = null;
		Response responseEvaluateRequest = null;		

		Merchant merchant = null;
		MultiMerchantCheckoutPayment mmpay = null;
		
		ResponseDebitCardProcess response = new ResponseDebitCardProcess();
		response.setResponseCode("0000");
		response.setHasError("false");

		try {

			// search application
			Aplication app = appDAO.getAplication(requestEncrypt.getAplicationID());

			// get merchant list
			merchant = merchantBO.getDefaultMerchantByApplicationId(requestEncrypt.getAplicationID());

			if (app == null) {
				// application not found
				return Response.status(409)
						.entity("{\"Error\":\"Id de Aplicacion: " + requestEncrypt.getAplicationID() + " no existe\"}")
						.build();
			}

			// verify if the client have authorization
			if (!getAuthorization(request.getRemoteHost(), app.getAplicationId())) {

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError1"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError1"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			try {
				// decrypt request
				decryptRequest = decrypt(requestEncrypt, app);

			} catch (Exception e) {
				e.printStackTrace();

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError3"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError3"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			// validate
			responseEvaluateRequest = evaluateRequest(decryptRequest);

			if (responseEvaluateRequest != null) {
				return responseEvaluateRequest;
			}

			try {

				payment = createPaymentTransaction(decryptRequest, app, request.getRemoteHost(),
						BigInteger.valueOf(request.getRemotePort()));
				
				// set transaction id
				response.setTransactionId(payment.getIdPaymentTransaction());

			} catch (Exception e) {
				e.printStackTrace();

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError4"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError4"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			try {

				mmpay = new MultiMerchantCheckoutPayment();
				String mmpayResult = mmpay.makePayment(merchant.getUserName(), merchant.getPassword(),
						decryptRequest.getNameOnCard(), decryptRequest.getAccountNumber(), decryptRequest.getEmail(),
						decryptRequest.getAmount(), "Mi Claro Express", "", "", "", "", "", "", "", "VMXWSCTUZ", 
						decryptRequest.getLanguage(), "", "", "", "", "MCEXPRESS", decryptRequest.getPcrftransaID(),
						payment.getIdPaymentTransaction());

				// If there were no errors calling the web service
				if (mmpayResult != null && mmpayResult.indexOf("https://") >= 0) {
					
					// set transaction id
					response.setUrl(mmpayResult);
					
				} else {
					
					GeneralError generalError = new GeneralError();
					generalError.setCodError(errorProperties.getErrorCod().get("codError2"));
					generalError.setMsgError(errorProperties.getErrorDes().get("codError2"));

					return Response.status(409).entity(generalError.generateJSON().toString()).build();
					
				}

			} catch (Exception e) {

				e.printStackTrace();
				logger.error("Error al llamar al Servicio bancario");

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError2"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError2"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			// Se procede a generar el JSON final
			logger.info("Valor de la repuesta: " + response.toString());

			ResponseBuilder rb = Response.status(200);
			logger.info("Fin del metodo processDebitCard");
			return rb.entity(response.generateJSONObject().toString()).build();
			// return Response.status(200).entity(aux).build();

		} catch (Exception e) {

			InternalError error = new InternalError();
			error.setError(e);
			error.setStringError(e.toString());

			logger.info("errorId: " + error.getErrorId() + " " + e.toString());

			e.printStackTrace();
			logger.info("Fin del metodo processCreditCard");

			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(error.generateJSON().toString())
					.build();
		}
	}
	
	@POST
	@Path("sdk/process")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response processSdk(ProcessDebitCardRequest requestEncrypt, @Context HttpServletRequest request)
			throws JSONException {

		logger.info("Inicio del metodo processCreditCard");
		logger.info("IP que hace la llamada: " + request.getRemoteHost());
		logger.info("Puerto de la llamada: " + request.getRemotePort());

		ProcessDebitCardRequest decryptRequest = null;
		PaymentTransaction payment = null;
		Response responseEvaluateRequest = null;		

		Merchant merchant = null;
		MultiMerchantCheckoutPayment mmpay = null;
		
		ResponseDebitCardProcess response = new ResponseDebitCardProcess();
		response.setResponseCode("0000");
		response.setHasError("false");

		try {

			// search application
			Aplication app = appDAO.getAplication(requestEncrypt.getAplicationID());

			// get merchant list
			merchant = merchantBO.getDefaultMerchantByApplicationId(requestEncrypt.getAplicationID());

			if (app == null) {
				// application not found
				requestEncrypt.getAplicationID();

				return Response.status(409)
						.entity("{\"Error\":\"Id de Aplicacion: " + requestEncrypt.getAplicationID() + " no existe\"}")
						.build();
			}

			// verify if the client have authorization
			if (!getAuthorization(request.getRemoteHost(), app.getAplicationId())) {

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError1"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError1"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			try {
				// decrypt request
				decryptRequest = decrypt(requestEncrypt, app);

			} catch (Exception e) {
				e.printStackTrace();

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError3"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError3"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			// validate
			responseEvaluateRequest = evaluateRequest(decryptRequest);

			if (responseEvaluateRequest != null) {
				return responseEvaluateRequest;
			}

			try {

				payment = createPaymentTransaction(decryptRequest, app, request.getRemoteHost(),
						BigInteger.valueOf(request.getRemotePort()));
				
				// set transaction id
				response.setTransactionId(payment.getIdPaymentTransaction());

			} catch (Exception e) {
				e.printStackTrace();

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError4"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError4"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			try {
				
				response = makePaymentSoap(decryptRequest);				

				mmpay = new MultiMerchantCheckoutPayment();
				String mmpayResult = mmpay.makePayment(merchant.getUserName(), merchant.getPassword(),
						decryptRequest.getNameOnCard(), decryptRequest.getAccountNumber(), decryptRequest.getEmail(),
						decryptRequest.getAmount(), "Mi Claro Express", "", "", "", "", "", "", "", "VMXWSCTUZ", 
						decryptRequest.getLanguage(), "", "", "", "", "MCEXPRESS", decryptRequest.getPcrftransaID(),
						payment.getIdPaymentTransaction());

				// If there were no errors calling the web service
				if (mmpayResult != null && mmpayResult.indexOf("https://") >= 0) {
					
					// set transaction id
					response.setUrl(mmpayResult);
					
				} else {
					
					GeneralError generalError = new GeneralError();
					generalError.setCodError(errorProperties.getErrorCod().get("codError2"));
					generalError.setMsgError(errorProperties.getErrorDes().get("codError2"));

					return Response.status(409).entity(generalError.generateJSON().toString()).build();
					
				}

			} catch (Exception e) {

				e.printStackTrace();
				logger.error("Error al llamar al Servicio bancario");

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError2"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError2"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			// Se procede a generar el JSON final
			logger.info("Valor de la repuesta: " + response.toString());

			ResponseBuilder rb = Response.status(200);
			logger.info("Fin del metodo processDebitCard");
			return rb.entity(response.generateJSONObject().toString()).build();
			// return Response.status(200).entity(aux).build();

		} catch (Exception e) {

			InternalError error = new InternalError();
			error.setError(e);
			error.setStringError(e.toString());

			logger.info("errorId: " + error.getErrorId() + " " + e.toString());

			e.printStackTrace();
			logger.info("Fin del metodo processCreditCard");

			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(error.generateJSON().toString())
					.build();
		}
	}	

	public Response evaluateRequest(ProcessDebitCardRequest decryptRequest) throws Exception {
		logger.info("Evaluando el request de la peticion");

		if (decryptRequest.getNameOnCard().length() > 100) {
			logger.error("Nombre en la tarjeta es mayor a 100: " + decryptRequest.getNameOnCard());

			GeneralError generalError = new GeneralError();
			generalError.setCodError(errorProperties.getErrorCod().get("codError5"));
			generalError.setMsgError(errorProperties.getErrorDes().get("codError5"));

			return Response.status(409).entity(generalError.generateJSON().toString()).build();
		}
		return null;
	}

	public boolean getAuthorization(String IP, String appId) {
		// Se busca si la Aplicacion con la IP esta autorizada
		AuthorizationIpApplicationPK authorizationPK = new AuthorizationIpApplicationPK();
		authorizationPK.setApplicationId(appId);
		authorizationPK.setIpAuthorization("*");

		// Se busca si todas las IP tienen Autorizacion
		AuthorizationIpApplication authorizationIP = authorizationDAO.getAuthorization(authorizationPK);

		if (authorizationIP == null) {
			logger.info("No todas las IP tienen Autorizacion");
			authorizationPK.setIpAuthorization(IP);

			// Se ubica si esta IP tiene permiso
			authorizationIP = authorizationDAO.getAuthorization(authorizationPK);

			if (authorizationIP == null) {
				logger.info("No tiene Autorizacion la IP: " + IP);
				return false;

			} else {

				if (authorizationIP.getEnabled().equals("Y")) {
					logger.info("Tiene Autorizacion la IP: " + IP);
					return true;
				} else {
					logger.info("La autorizacion para todas las IP existe para esta deshabilitada");
					return false;
				}
			}

		} else {

			if (authorizationIP.getEnabled().equals("Y")) {

				logger.info("Cualquier IP puede llamar a este Servicio con este Id de Aplicacion: " + appId);
				return true;

			} else {

				logger.info("La Autorizacion para todas las IP esta deshabilitada");
				authorizationPK.setIpAuthorization(IP);

				// Se ubica si esta IP tiene Permiso
				authorizationIP = authorizationDAO.getAuthorization(authorizationPK);

				if (authorizationIP == null) {
					logger.info("No tiene Autorizacion la IP: " + IP);
					return false;

				} else {

					if (authorizationIP.getEnabled().equals("Y")) {
						logger.info("Tiene Autorizacion la IP: " + IP);
						return true;

					} else {
						logger.info("La autorizacion para la IP existe para esta deshabilitada");
						return false;

					}
				}
			}
		}
	}

	public static <T> T getObject(final String jsonString, final Class<T> objectClass) {
		Gson gson = new Gson();
		return gson.fromJson(jsonString, objectClass);
	}

	public String generateKeyTransactionId() {
		String transactionId = Generate.keyString(15);
		logger.info("Id generado #1: " + transactionId);

		for (int i = 0; true; i++) {

			if (!paymentDAO.existTransactionId(transactionId)) {
				return transactionId;

			} else {

				logger.info("El Id existe en la Base de Datos. Generando nuevo ID");
				transactionId = Generate.keyString(15);
				logger.info("Id generado #" + (i + 2) + ": " + transactionId);
			}
		}
	}

	// Generate transaction id
	public PaymentTransaction createPaymentTransaction(ProcessDebitCardRequest decryptRequest, Aplication app,
			String Ip, BigInteger puerto) {

		String transactionId = generateKeyTransactionId();

		PaymentTransaction payment = new PaymentTransaction();

		payment.setAplicationId(app);
		payment.setIdPaymentTransaction(transactionId);
		payment.setAmount(new BigDecimal(decryptRequest.getAmount()));
		payment.setCardNum(
				org.apache.commons.lang.StringUtils
						.leftPad(
								decryptRequest.getCardNum().substring(decryptRequest.getCardNum().length() - 4,
										decryptRequest.getCardNum().length()),
								decryptRequest.getCardNum().length(), '*'));
		payment.setNameOnCard(decryptRequest.getNameOnCard());
		payment.setStreet(decryptRequest.getStreet());
		payment.setZip(decryptRequest.getZip());
		payment.setIp(Ip);
		payment.setPuerto(puerto);
		payment.setCreateDate(new Date());
		payment.setPCRFTransaID(decryptRequest.getPcrftransaID());
		payment.setBan(decryptRequest.getAccountNumber());
		payment.setStatus("C");// CREATED creado

		logger.info("Creando registro de la Transaccion para: " + payment.toString());

		// insert the payment info
		paymentDAO.save(payment);
		return payment;
	}

	public ResponseDebitCardProcess makePaymentSoap(ProcessDebitCardRequest decryptRequest) throws Exception {
		logger.info("Llamando el Servicio SOAP: ");
		PaymentsProxy paymentsProxy = new PaymentsProxyImpl();

		String customerId = decryptRequest.getAccountNumber();
		String name = "";
		String city = "";
		String state = "";
		String country = "";

		String extData = "<RegisterNum></RegisterNum>" + "<Tax1>0000.00</Tax1>" + "<Tax2>0000.00</Tax2>"
				+ "<CustomerId>" + decryptRequest.getAccountNumber() + "</CustomerId>" + "<BillTo>" + "<CustomerId>"
				+ decryptRequest.getAccountNumber() + "</CustomerId>" + "<Name>" + name + "</Name>" + "<Address>"
				+ "<Street>" + decryptRequest.getStreet() + "</Street>" + "<City>" + city + "</City>" + "<State>"
				+ state + "</State>" + "<Zip>" + decryptRequest.getZip() + "</Zip>" + "<Country>" + country
				+ "</Country>" + "</Address>" + "</BillTo>";

//		ResponseDebitCardProcess response = paymentsProxy.processCreditCard(decryptRequest.getCardNum(),
//				decryptRequest.getExpDate(), decryptRequest.getNameOnCard(), decryptRequest.getAmount(),
//				decryptRequest.getZip(), decryptRequest.getStreet(), decryptRequest.getCvNum(), extData);
		
		return null;
	}

	public void updateTransactionWithPayment(PaymentTransaction payment, ResponseCreditCardProcess response)
			throws Exception {
		response.setTransactionId(payment.getIdPaymentTransaction());
		logger.info("Procediendo a Actualizar registro en La Base de Datos");
		payment = paymentDAO.updatePaymentWithResponse(payment, response);
	}

	public ProcessDebitCardRequest decrypt(ProcessDebitCardRequest requestEncrypt, Aplication app)
			throws IOException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException,
			GeneralSecurityException {

		logger.info("Aplicando desencriptacion para parametros de Entrada");

		ProcessDebitCardRequest requestDecrypt = new ProcessDebitCardRequest();

		AES aes = new AES();

		requestDecrypt.setAmount(aes.decrypt(requestEncrypt.getAmount(), app.getKeyEncrypt()));
		requestDecrypt.setCardNum(aes.decrypt(requestEncrypt.getCardNum(), app.getKeyEncrypt()));
		requestDecrypt.setCvNum(aes.decrypt(requestEncrypt.getCvNum(), app.getKeyEncrypt()));
		requestDecrypt.setExpDate(aes.decrypt(requestEncrypt.getExpDate(), app.getKeyEncrypt()));
		requestDecrypt.setNameOnCard(aes.decrypt(requestEncrypt.getNameOnCard(), app.getKeyEncrypt()));
		requestDecrypt.setStreet(aes.decrypt(requestEncrypt.getStreet(), app.getKeyEncrypt()));
		requestDecrypt.setZip(aes.decrypt(requestEncrypt.getZip(), app.getKeyEncrypt()));
		requestDecrypt.setPcrftransaID(aes.decrypt(requestEncrypt.getPcrftransaID(), app.getKeyEncrypt()));
		requestDecrypt.setAccountNumber(aes.decrypt(requestEncrypt.getAccountNumber(), app.getKeyEncrypt()));
		requestDecrypt.setEmail(aes.decrypt(requestEncrypt.getEmail(), app.getKeyEncrypt()));
		requestDecrypt.setLanguage(aes.decrypt(requestEncrypt.getLanguage(), app.getKeyEncrypt()));

		return requestDecrypt;

	}
}
