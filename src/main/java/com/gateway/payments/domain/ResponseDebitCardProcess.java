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
public class ResponseDebitCardProcess implements Serializable{
    //Ejemplo {"responseCode":"0","message":"Approved","authCode":"138345","transactionId":"123456789012345"}
    
    private String responseCode;
    private String message;
    private String url;
    private String hasError;

	private String transactionId;

    public ResponseDebitCardProcess() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        output.put("url", url);
        output.put("transactionId", transactionId);
        output.put("hasError", hasError);
        
        return output;
    }
}
