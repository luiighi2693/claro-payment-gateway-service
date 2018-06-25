/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gateway.payments.ws;

import com.e4gslab.ebill.payment.gateway.model.*;
import com.gateway.payments.dao.AplicationDAO;
import com.gateway.payments.dao.AuthorizationApplicationDAO;
import com.gateway.payments.dao.PaymentTransactionDAO;
import com.gateway.payments.domain.ProcessCreditCardH2HRequest;
import com.gateway.payments.domain.ProcessCreditCardRequest;
import com.gateway.payments.domain.ResponseCreditCardProcess;
import com.gateway.payments.proxy.PaymentsProxy;
import com.gateway.payments.proxy.PaymentsProxyImpl;
import com.gateway.payments.util.*;
import com.gateway.payments.util.InternalError;
import com.gateway.payments.ws.serviceh2h.EvertecResponse;
import com.google.gson.Gson;
import org.apache.axis.message.MessageElement;
import org.apache.commons.lang.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.tempuri.cpsh2h.serviceh2h.SendTransactionsResponseSendTransactionsResult;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 * REST Web Service
 *
 * @author lrodriguez
 */
@Path("creditcardh2h")
public class CreditCardResourceH2H {

	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger
			.getLogger(CreditCardResourceH2H.class.getName());

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
	private ApplicationProperties appProperties;

	@Autowired
	@Qualifier("configurationSoapMsg")
	private Properties soapMsg;

	/**
	 * Creates a new instance of GenericResource
	 */
	public CreditCardResourceH2H() {
	}

	@POST
	@Path("process")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response process(ProcessCreditCardH2HRequest jsonRequestEncrypt, @Context HttpServletRequest request)
			throws JSONException {

		logger.info("Inicio del metodo processCreditCard");
		logger.info("IP que hace la llamada: " + request.getRemoteHost());
		logger.info("Puerto de la llamada: " + request.getRemotePort());

		logger.info("request " + jsonRequestEncrypt);

		Aplication app = null;
		Merchant merchant = new Merchant();

		try {

			// Se busca la Aplicacion
			app = appDAO.getAplication(jsonRequestEncrypt.getAplicationID());

			// get merchant list
			//merchant = merchantBO.getDefaultMerchantByApplicationId(jsonRequestEncrypt.getAplicationID());
			MerchantType merchantType = new MerchantType(appProperties.getAppCod().get("merchantTypeH2hCreditId"));
			merchantType.setName(appProperties.getAppCod().get("merchantTypeH2hCreditName"));
			merchantType.setEnabled(appProperties.getAppCod().get("merchantTypeH2hCreditEnabled"));

			merchant.setMerchantId(appProperties.getAppCod().get("merchantH2hCreditId"));
			merchant.setUserName(appProperties.getAppCod().get("merchantH2hCreditUsername"));
			merchant.setPassword(appProperties.getAppCod().get("merchantH2hCreditPassword"));
			merchant.setUrl(appProperties.getAppCod().get("merchantH2hCreditEndpoint"));
			merchant.setName(appProperties.getAppCod().get("merchantH2hCreditName"));
			merchant.setMerchantTypeId(appProperties.getAppCod().get("merchantH2hCreditTypeId"));
			merchant.setMerchantType(merchantType);

			if (app == null) {
				logger.info("Aplicacion No Encontrada con id: " + jsonRequestEncrypt.getAplicationID());

				jsonRequestEncrypt.getAplicationID();

				return Response.status(409).entity(
						"{\"Error\":\"Id de Aplicacion: " + jsonRequestEncrypt.getAplicationID() + " no existe\"}")
						.build();
			}

			String descripcion = app.getDescripcion();

			logger.info("Descripcion de la aplicacion " + jsonRequestEncrypt.getAplicationID() + ": " + descripcion);

			// Verificando si el Cliente tiene Autorizacion
			if (!getAuthorization(request.getRemoteHost(), app.getAplicationId())) {

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError1"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError1"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			ProcessCreditCardH2HRequest jsonRequest = jsonRequestEncrypt;

			/*try {

				jsonRequest = decrypt(jsonRequestEncrypt, app);

			} catch (Exception e) {
				e.printStackTrace();

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError3"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError3"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}*/

			Response responseEvaluateRequest = evaluateRequest(jsonRequest);

			if (responseEvaluateRequest != null) {
				return responseEvaluateRequest;
			}

			PaymentTransaction payment;

			try {
				payment = createPaymentTransaction(jsonRequest, app, request.getRemoteHost(),
						BigInteger.valueOf(request.getRemotePort()));
				logger.info("payment " + payment.toString());

			} catch (Exception e) {
				e.printStackTrace();

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError4"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError4"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			ResponseCreditCardProcess response;

			try {
				response = makePaymentSoap(merchant.getUserName(), merchant.getPassword(), merchant.getUrl(), merchant.getMerchantId(),jsonRequest);
				logger.info("responseSoap " + response.toString());
			} catch (Exception e) {
				e.printStackTrace();

				GeneralError generalError = new GeneralError();
				generalError.setCodError(errorProperties.getErrorCod().get("codError2"));
				generalError.setMsgError(errorProperties.getErrorDes().get("codError2"));

				return Response.status(409).entity(generalError.generateJSON().toString()).build();
			}

			try {

				updateTransactionWithPayment(payment, response);

			} catch (Exception e) {
				e.printStackTrace();

				JSONObject jsonResponse = response.generateJSONObject();
				ResponseBuilder rb = Response.status(206);

				return rb.entity(jsonResponse.toString()).build();
			}

			logger.info("Fin Llamanda el Servicio SOAP");

			// Se procede a convertir el formato del codigo y los mensajes del
			// Servicio Soap por los de esta aplicacion
			response.setMessage(soapMsg
					.getProperty(org.apache.commons.lang.StringUtils.leftPad(response.getResponseCode(), 4, '0')));
			response.setResponseCode(org.apache.commons.lang.StringUtils.leftPad(response.getResponseCode(), 4, '0'));

			// Se procede a generar el JSON final
			JSONObject jsonResponse = response.generateJSONObject();
			logger.info("Valor de la repuesta: " + jsonResponse.toString());

			ResponseBuilder rb = Response.status(200);
			logger.info("Fin del metodo processCreditCard");
			return rb.entity(jsonResponse.toString()).build();
			// return Response.status(200).entity(aux).build();

		} catch (Exception e) {

			InternalError error = new InternalError();
			error.setError(e);
			error.setStringError(e.toString());

			logger.info("errorId: " + error.getErrorId() + " " + e.toString());

			e.printStackTrace();
			logger.info("Fin del metodo processCreditCard");

			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(error.generateJSON().toString())
					.build();
		}
	}

	public Response evaluateRequest(ProcessCreditCardH2HRequest jsonRequest) throws Exception {
		logger.info("Evaluando el request de la peticion");

		if (jsonRequest.getCustomerName().length() > 100) {
			logger.error("Nombre en la tarjeta es mayor a 100: " + jsonRequest.getCustomerName());

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

	public PaymentTransaction createPaymentTransaction(ProcessCreditCardH2HRequest jsonRequest, Aplication app, String Ip,
													   BigInteger puerto) {

		logger.info("Generando ID de la Transaccion");

		String transactionId = generateKeyTransactionId();
		PaymentTransaction payment = new PaymentTransaction();
		payment.setAplicationId(app);
		payment.setIdPaymentTransaction(transactionId);
		payment.setAmount(new BigDecimal(jsonRequest.getAmount()));
		payment.setCardNum(org.apache.commons.lang.StringUtils.leftPad(jsonRequest.getCardNum()
						.substring(jsonRequest.getCardNum().length() - 4, jsonRequest.getCardNum().length()),
				jsonRequest.getCardNum().length(), '*'));
		payment.setNameOnCard(jsonRequest.getCustomerName());
		payment.setStreet(jsonRequest.getStreet());
		payment.setZip(jsonRequest.getZipCode());
		payment.setIp(Ip);
		payment.setPuerto(puerto);
		payment.setCreateDate(new Date());
		payment.setPCRFTransaID(jsonRequest.getPcrftransaID());
		payment.setBan(jsonRequest.getCustomerId());
		payment.setStatus("C");// CREATED creado

		paymentDAO.save(payment);
		return payment;
	}

	public ResponseCreditCardProcess makePaymentSoap(String merchantUser, String merchantPassword, String merchantEndPoint, String merchantTransId, ProcessCreditCardH2HRequest jsonRequest) throws Exception {

		PaymentsProxy paymentsProxy = new PaymentsProxyImpl();
		StringBuilder exDateNew = new StringBuilder();

		/*String customerId = jsonRequest.getAccountNumber();
		String city = "";
		String state = "";
		String country = "";*/

		/*String extData = "<RegisterNum></RegisterNum>" +
				"<Tax1>0000.00</Tax1>" +
				"<Tax2>0000.00</Tax2>" +
				"<CustomerEmail>noreplay@claropr.com</CustomerEmail>" +
				"<CustomerId>" + jsonRequest.getAccountNumber() + "</CustomerId>" +
				"<BillTo>" +
				"<CustomerId>" + jsonRequest.getAccountNumber() + "</CustomerId>" +
				"<Name>" + jsonRequest.getNameOnCard() + "</Name>" +
				"<Address>" +
				"<Street>" + jsonRequest.getStreet() + "</Street>" +
				"<City>" + city + "</City>" +
				"<State>" + state + "</State>" +
				"<Zip>" + jsonRequest.getZip() + "</Zip>" +
				"<Country>" + country + "</Country>" +
				"</Address>" +
				"</BillTo>";*/

		/*if (accountType != null && accountType.equals("PREPAGO")) {
			extData = extData + "<Description>PREPAGO</Description>";
		}*/

		/*logger.info("******************************");
		logger.info(extData);*/
		logger.info("******************************");

		((PaymentsProxyImpl) paymentsProxy).setEndPointWS(merchantEndPoint);
		SendTransactionsResponseSendTransactionsResult responseH2H = paymentsProxy.processCreditCardH2H(merchantUser, merchantPassword, jsonRequest.getCustomerId(),
				jsonRequest.getCustomerName(), jsonRequest.getCustomerEmail(), jsonRequest.getTelephone(), "", jsonRequest.getAddress1(), jsonRequest.getAddress2(),
				jsonRequest.getState(), jsonRequest.getCity(), jsonRequest.getZipCode(), jsonRequest.getDescriptionBuy(), "", "", "", "", "", "",
				merchantTransId, jsonRequest.getAmount(), jsonRequest.getPaymentType(), jsonRequest.getCvNum(), jsonRequest.getExpDate(), jsonRequest.getCardNum(),
				"", "","", "", "", "", "",
				"", ""
				);

		EvertecResponse responseH2HConverted = convertToObject(responseH2H.get_any()[1]);

		ResponseCreditCardProcess response = new ResponseCreditCardProcess();
		response.setResponseCode(responseH2HConverted.getStatusCode());
		response.setMessage(responseH2HConverted.getStatusDescription());
		response.setAuthCode(responseH2HConverted.getAuthorizationNumber());
//		ResponseCreditCardProcess response = paymentsProxy.processCreditCard(merchantUser, merchantPassword, merchantEndPoint, jsonRequest.getCardNum(),
//				jsonRequest.getExpDate(), jsonRequest.getNameOnCard(), jsonRequest.getAmount(), jsonRequest.getZip(),
//				jsonRequest.getStreet(), jsonRequest.getCvNum(), extData);

//		response.setResponseCode(response.getResponseCode());
		response.setHasError(response.getResponseCode().equals("0") ? "false" : "true");

		return response;
	}

	public void updateTransactionWithPayment(PaymentTransaction payment, ResponseCreditCardProcess response)
			throws Exception {
		response.setTransactionId(payment.getIdPaymentTransaction());
		logger.info("Procediendo a Actualizar registro en La Base de Datos");
		payment = paymentDAO.updatePaymentWithResponse(payment, response);
	}

	public ProcessCreditCardRequest decrypt(ProcessCreditCardRequest jsonRequestEncrypt, Aplication app)
			throws IOException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException,
			GeneralSecurityException {

		logger.info("Aplicando desencriptacion para parametros de Entrada");

		ProcessCreditCardRequest jsonRequestDecrypt = new ProcessCreditCardRequest();

		AES aes = new AES();

		jsonRequestDecrypt.setAmount(aes.decrypt(jsonRequestEncrypt.getAmount(), app.getKeyEncrypt()));

		jsonRequestDecrypt.setCardNum(aes.decrypt(jsonRequestEncrypt.getCardNum(), app.getKeyEncrypt()));

		jsonRequestDecrypt.setCvNum(aes.decrypt(jsonRequestEncrypt.getCvNum(), app.getKeyEncrypt()));

		jsonRequestDecrypt.setExpDate(aes.decrypt(jsonRequestEncrypt.getExpDate(), app.getKeyEncrypt()));

		jsonRequestDecrypt.setNameOnCard(aes.decrypt(jsonRequestEncrypt.getNameOnCard(), app.getKeyEncrypt()));

		jsonRequestDecrypt.setStreet(aes.decrypt(jsonRequestEncrypt.getStreet(), app.getKeyEncrypt()));

		jsonRequestDecrypt.setZip(aes.decrypt(jsonRequestEncrypt.getZip(), app.getKeyEncrypt()));

		jsonRequestDecrypt.setPcrftransaID(aes.decrypt(jsonRequestEncrypt.getPcrftransaID(), app.getKeyEncrypt()));

		jsonRequestDecrypt.setAccountNumber(aes.decrypt(jsonRequestEncrypt.getAccountNumber(), app.getKeyEncrypt()));

		return jsonRequestDecrypt;

	}

	public EvertecResponse convertToObject(MessageElement message) throws Exception {

		EvertecResponse response = new EvertecResponse();

		try{
			Iterator items = message.getChildElements();
			while(items.hasNext()){
				MessageElement m = (MessageElement) items.next();
				Iterator items2 = m.getChildElements();
				while(items2.hasNext()){
					MessageElement m2 = (MessageElement) items2.next();
					List list = m2.getChildren();
					for (Object object : list) {
						MessageElement o = (MessageElement) object;
						if(StringUtils.contains(o.getNodeName(), "StatusCode")){
							response.setStatusCode(o.getValue());
						}else if(StringUtils.contains(o.getNodeName(), "StatusDescription")){
							response.setStatusDescription(o.getValue());
						}else if(StringUtils.contains(o.getNodeName(), "ConfirmationNumber")){
							response.setConfirmationNumber(o.getValue());
						}else if(StringUtils.contains(o.getNodeName(), "AuthorizationNumber")){
							response.setAuthorizationNumber(o.getValue());
						}
					}
				}
			}

		}catch(Exception ex){
			logger.error("Error parseando el mensaje de Evertec TDC", ex);
//			TODO QUITAR throw new PaymentTransactionException("000", "error.payment.evertec.parser.mensaje", null);
		}

		logger.info("TDC Evertec response: {}", response);

		return response;
	}
}
