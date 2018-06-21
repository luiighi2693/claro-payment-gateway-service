/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gateway.payments.domain;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author jmercado
 */
public class ResponseCreditCardProcess implements Serializable{
    //Ejemplo {"responseCode":"0","message":"Approved","authCode":"138345","transactionId":"123456789012345"}
    
    private String responseCode;
    private String message;
    private String authCode;
    private String transactionId;
    private String hasError;

    public ResponseCreditCardProcess() {
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    
    public String getHasError() {
		return hasError;
	}

	public void setHasError(String hasError) {
		this.hasError = hasError;
	}

	public JSONObject generateJSONObject()throws JSONException{
    	
        JSONObject output = new JSONObject();
        
        output.put("responseCode", responseCode);
        output.put("message", message);
        output.put("authCode", authCode);
        output.put("transactionId", transactionId);
        output.put("hasError", hasError);
        
        return output;
    }
}
