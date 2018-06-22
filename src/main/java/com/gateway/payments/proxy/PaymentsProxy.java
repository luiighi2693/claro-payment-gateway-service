/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gateway.payments.proxy;

import com.gateway.payments.domain.ResponseCreditCardProcess;
import com.gateway.payments.domain.ResponseDebitCardProcess;
import org.tempuri.cpsh2h.serviceh2h.SendTransactionsResponseSendTransactionsResult;

/**
 *
 * @author jrodriguez
 */
public interface PaymentsProxy {
    
    public ResponseCreditCardProcess processCreditCard(String merchantUser, String merchantPassword, String merchantEndPoint, String  cardNum, String  expDate, String  nameOnCard, String  amount, String  zip, 
    		String  street, String  cvNum, String extData) throws Exception;
    
    public ResponseDebitCardProcess processDebitCard(String  cardNum, String  expDate, String  nameOnCard, String  amount, String  zip, 
    		String  street, String extData) throws Exception;

    public SendTransactionsResponseSendTransactionsResult processCreditCardH2H(String userName, String passWord, String customerID, String customerName, String customerEmail,
                                                                               String telephone, String fax, String address1, String address2, String state, String city, String zipCode, String descriptionBuy, String operatorId,
                                                                               String channel, String tax1, String tax2, String tax3, String tax4, String merchantTransId, String amount, String paymentType, String securityCardCode,
                                                                               String expirationDate, String cardNumber, String bankRoutingNumber, String bankAccountNumber, String authorizationBit, String bankClientName,
                                                                               String filler1, String filler2, String filler3, String filler4, String note) throws Exception;
}
