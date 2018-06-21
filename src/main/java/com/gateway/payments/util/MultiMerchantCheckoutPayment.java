package com.gateway.payments.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.tempuri.WebMerchant.MerchantService.MerchantServiceLocator;
import org.tempuri.WebMerchant.MerchantService.MerchantServiceSoapStub;

import com.gateway.payments.properties.AppConstants;
import com.gateway.payments.properties.AppProperties;

public class MultiMerchantCheckoutPayment {

	static final String endPoint = AppProperties.getString(AppConstants.MERCHANT_MMPAY_ENDPOINT);

	protected static org.apache.log4j.Logger logger = org.apache.log4j.Logger
			.getLogger(MultiMerchantCheckoutPayment.class.getName());

	public String makePayment(String username, String password, String customerName, String customerID,
			String customerEmail, String total, String descriptionBuy, String taxAmount1, String address1,
			String address2, String city, String zipcode, String telephone, String fax, String ignoreValues,
			String language, String taxAmount2, String taxAmount3, String taxAmount4, String taxAmount5, String filler1,
			String filler2, String filler3) {

		MerchantServiceLocator locator = new MerchantServiceLocator();
		String makePayment = null;

		try {

			MerchantServiceSoapStub service = new MerchantServiceSoapStub(new URL(endPoint), locator);

			makePayment = service.makePayment(username, password, customerName, customerID, customerEmail, total,
					descriptionBuy, taxAmount1, address1, address2, city, zipcode, telephone, fax, ignoreValues,
					language, taxAmount2, taxAmount3, taxAmount4, taxAmount5, filler1, filler2, filler3);

		} catch (AxisFault e) {

			logger.error("Ha ocuurdo un erro consultando el WS " + endPoint + " Exception de tipo AxisFault ex: "
					+ e.toString());
		} catch (MalformedURLException e) {

			logger.error("Ha ocuurdo un erro consultando el WS " + endPoint
					+ " Exception de tipo MalformedURLException ex: " + e.toString());
		} catch (RemoteException e) {

			logger.error("Ha ocuurdo un erro consultando el WS " + endPoint + " Exception de tipo RemoteException ex: "
					+ e.toString());
		}

		return makePayment;

	}
	
}
