/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gateway.payments.proxy;

import com.gateway.payments.domain.ResponseCreditCardProcess;
import com.gateway.payments.domain.ResponseDebitCardProcess;

/**
 *
 * @author jrodriguez
 */
public interface PaymentsProxy {
    
    public ResponseCreditCardProcess processCreditCard(String merchantUser, String merchantPassword, String merchantEndPoint, String  cardNum, String  expDate, String  nameOnCard, String  amount, String  zip, 
    		String  street, String  cvNum, String extData) throws Exception;
    
    public ResponseDebitCardProcess processDebitCard(String  cardNum, String  expDate, String  nameOnCard, String  amount, String  zip, 
    		String  street, String extData) throws Exception;
    
}
