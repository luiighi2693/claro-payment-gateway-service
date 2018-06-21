/**
 * 
 */
package com.gateway.payments.util;

import java.net.URL;
import java.util.Iterator;

import org.apache.axis.message.MessageElement;
import org.json.JSONObject;
import org.tempuri.cpsh2h.serviceh2h.SendTransactionsResponseSendTransactionsResult;
import org.tempuri.cpsh2h.serviceh2h.Serviceh2HLocator;
import org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoapStub;

import com.gateway.payments.domain.TransactionH2HRequest;
import com.gateway.payments.domain.TransactionH2HResponse;
import com.gateway.payments.properties.AppConstants;
import com.gateway.payments.properties.AppProperties;

/**
 * @author jmercado
 *
 */
public class MerchantH2HUtil {

	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MerchantH2HUtil.class.getName());


	static final String endPoint = AppProperties.getString(AppConstants.MERCHANT_H2H_ENDPOINT);

	public MerchantH2HUtil() {
		super();
	}

	public TransactionH2HResponse sendTransactions(TransactionH2HRequest request){

		Serviceh2HLocator locator = new Serviceh2HLocator();		
		TransactionH2HResponse transactionH2HResponse = new TransactionH2HResponse();

		String statusCode = null;
		String statusDescription = null;
		String confirmationNumber = null;
		String authorizationNumber = null;
		
		try {

			logger.info(" MerchantH2HUtil = " + endPoint);

			Serviceh2HSoapStub service = new Serviceh2HSoapStub(new URL(endPoint), locator);
			
			// ********* Variables ************
			String fax = ""; // not used.
			String address2 = "";
			String operatorId = "0";
			String channel = "0";
			String tax1 = "";
			String tax2 = "";
			String tax3 = "";
			String tax4 = "";
			String bankAccountNumber = "";
			String authorizationBit = "";
			String bankClientName = "";
			String bankRoutingNumber = "";
			String filler1 = "";
			String filler2 = "";
			String filler3 = "";
			String filler4 = "";
			String note = "";
			String merchantTransId = "";

			String paymentType = request.getPaymentType();

			if(paymentType.equalsIgnoreCase("V") || paymentType.equalsIgnoreCase("M") || paymentType.equalsIgnoreCase("X")){

				SendTransactionsResponseSendTransactionsResult x = service.sendTransactions(AppProperties.getString(AppConstants.MERCHANT_H2H_USERNAME), 
						AppProperties.getString(AppConstants.MERCHANT_H2H_PASSWORD), request.getCustomerId(), 
						request.getCustomerName(), request.getEmail(), request.getCellphone(), fax, request.getAddress(), address2, request.getState(), 
						request.getCity(), request.getZipCode(), request.getDescriptionBuy(), operatorId, channel, tax1, tax2, tax3, tax4, 
						merchantTransId, request.getAmount(), paymentType, request.getSecurityCardCode(), request.getExpirationDate(), 
						request.getCardNumber(), bankRoutingNumber, bankAccountNumber, authorizationBit, bankClientName, filler1, filler2, filler3, filler4, note);

				MessageElement[] y = x.get_any();

				JSONObject jsonObj = new JSONObject(y[1]);

				Iterator it = y[1].getChildElements();
				while (it.hasNext()) {
					MessageElement me = (MessageElement) it.next();
					Iterator it2 = me.getChildElements();
					while (it2.hasNext()) {
						MessageElement me2 = (MessageElement) it2.next();

						Iterator it3 = me2.getChildElements();
						while (it3.hasNext()) {
							MessageElement me3 = (MessageElement) it3.next();

							if(me3.getName().equals("StatusCode")){
								
								JSONObject messageElementStatusCode = new JSONObject(me3);
								statusCode = messageElementStatusCode.getString("firstChild");
								
							}else if(me3.getName().equals("StatusDescription")){
								
								JSONObject messageElementStatusDescription = new JSONObject(me3);
								statusDescription = messageElementStatusDescription.getString("firstChild");
								
							}else if(me3.getName().equals("ConfirmationNumber")){
								
								if(statusCode.equals("0000")){
									
									JSONObject messageElementConfirmationNumber = new JSONObject(me3);
									confirmationNumber = messageElementConfirmationNumber.getString("firstChild");
								}
								
							}else if(me3.getName().equals("AuthorizationNumber")){
								
								if(statusCode.equals("0000")){
									
									JSONObject messageElementAuthorizationNumber = new JSONObject(me3);
									authorizationNumber = messageElementAuthorizationNumber.getString("firstChild");
								}
							}
						}
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		transactionH2HResponse.setStatusCode(statusCode);
		transactionH2HResponse.setStatusDescription(statusDescription);
		transactionH2HResponse.setConfirmationNumber(confirmationNumber);
		transactionH2HResponse.setAuthorizationNumber(authorizationNumber);
		
		return transactionH2HResponse;
	}
}
