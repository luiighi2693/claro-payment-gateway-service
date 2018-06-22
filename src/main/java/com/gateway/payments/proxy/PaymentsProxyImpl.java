/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gateway.payments.proxy;

import javax.xml.ws.BindingProvider;

import com.gateway.payments.domain.ResponseCreditCardProcess;
import com.gateway.payments.domain.ResponseDebitCardProcess;
import com.gateway.payments.properties.AppConstants;
import com.gateway.payments.properties.AppProperties;
import com.tpisoft.smartpayments.Response;
import com.tpisoft.smartpayments.Transacta;
import com.tpisoft.smartpayments.TransactaSoap;
import org.tempuri.cpsh2h.serviceh2h.SendTransactionsResponseSendTransactionsResult;
import org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoapProxy;

/**
 *
 * @author jrodriguez
 */
public class PaymentsProxyImpl implements PaymentsProxy{

	private static String endPoint = String.format("%s", AppProperties.getString(AppConstants.WSDL));

	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PaymentsProxyImpl.class.getName());

	private Transacta service = new Transacta();

	private Serviceh2HSoapProxy proxyH2H = null;

	private String endPointWS;

	public void setEndPointWS(String endPointWS){
		proxyH2H = new Serviceh2HSoapProxy(endPointWS);
		this.endPointWS = endPointWS;
	}

	@Override
	public ResponseCreditCardProcess processCreditCard(String merchantUser, String merchantPassword, String merchantEndPoint, String  cardNum, String  expDate, String  nameOnCard, 
			String  amount, String  zip, String  street, String  cvNum, String extData) throws Exception {

		TransactaSoap port;
		Response response = null;
		ResponseCreditCardProcess responseCreditCardProcess;
		
		try {

			port = service.getTransactaSoap();
			
			((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, merchantEndPoint);
			
			response = port.processCreditCard(merchantUser, 
					merchantPassword, 
					AppProperties.getString(AppConstants.PROCESS_CREDICARD_TRANSTYPE), 
					cardNum, expDate, 
					"", nameOnCard, amount, "", "", zip, street, cvNum, extData);
			
			responseCreditCardProcess=new ResponseCreditCardProcess();
			responseCreditCardProcess.setResponseCode(Integer.toString(response.getResult()));
			responseCreditCardProcess.setMessage(response.getRespMSG());
			responseCreditCardProcess.setAuthCode(response.getAuthCode());
			
			logger.info("merchantUser " + merchantUser);
			logger.info("La respuesta del metodo processCreditCard es "+response.toString());		
			logger.info("responseCode: "+response.getHostCode());
			
			return responseCreditCardProcess;

		} catch (Exception e) {
			
			logger.error("Existe un error "+e.toString());
			logger.info("Fin del metodo processCreditCard");
			
			throw new Exception(e);
		}
	}
	
	@Override
	public ResponseDebitCardProcess processDebitCard(String  cardNum, String  expDate, String  nameOnCard, 
			String  amount, String  zip, String  street, String extData)throws Exception {
		
		
		
		return null;
	}

	@Override
	public SendTransactionsResponseSendTransactionsResult processCreditCardH2H(String userName, String passWord, String customerID, String customerName, String customerEmail,
																			   String telephone, String fax, String address1, String address2, String state, String city, String zipCode, String descriptionBuy, String operatorId,
																			   String channel, String tax1, String tax2, String tax3, String tax4, String merchantTransId, String amount, String paymentType, String securityCardCode,
																			   String expirationDate, String cardNumber, String bankRoutingNumber, String bankAccountNumber, String authorizationBit, String bankClientName,
																			   String filler1, String filler2, String filler3, String filler4, String note) throws Exception {
		return proxyH2H.sendTransactions(userName, passWord, customerID, customerName, customerEmail, telephone, fax, address1, address2, state, city, zipCode, descriptionBuy, operatorId, channel, tax1, tax2, tax3, tax4, merchantTransId, amount, paymentType, securityCardCode, expirationDate, cardNumber, bankRoutingNumber, bankAccountNumber, authorizationBit, bankClientName, filler1, filler2, filler3, filler4, note);
	}

}
