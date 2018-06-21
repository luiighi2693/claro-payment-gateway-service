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

/**
 *
 * @author jrodriguez
 */
public class PaymentsProxyImpl implements PaymentsProxy{

	private static String endPoint = String.format("%s", AppProperties.getString(AppConstants.WSDL));

	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PaymentsProxyImpl.class.getName());

	private Transacta service = new Transacta();

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
	
}
