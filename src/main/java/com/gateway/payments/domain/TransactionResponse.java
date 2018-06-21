/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gateway.payments.domain;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author jmercado
 */
public class TransactionResponse {

    private Boolean transactionExist;
    private String msg;
    private String PCRFTransaID;
    private String authCode;
    private String status;

    /**
     * Get the value of transactionExist
     *
     * @return the value of transactionExist
     */
    public Boolean isTransactionExist() {
    	
        return transactionExist;
    }

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getTransactionExist() {
		return transactionExist;
	}

	public String getPCRFTransaID() {
		return PCRFTransaID;
	}

	public void setPCRFTransaID(String pCRFTransaID) {
		this.PCRFTransaID = pCRFTransaID;
	}
	
	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    public JSONObject generateJSONObject() throws JSONException {
    	
        JSONObject output = new JSONObject();   
        output.put("transactionExist", transactionExist);
        output.put("msg", msg);
        output.put("PCRFTransaID", PCRFTransaID);
        output.put("authCode", authCode);
        output.put("status", status);
        
        return output;
    }	
    
    /**
     * Set the value of transactionExist
     *
     * @param transactionExist new value of transactionExist
     */
    public void setTransactionExist(Boolean transactionExist) {
    	
        this.transactionExist = transactionExist;
    }    
    
}
