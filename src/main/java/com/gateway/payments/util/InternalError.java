/**
 * 
 */
package com.gateway.payments.util;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author jmercado
 *
 */
public class InternalError extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6488442258638350646L;
	
	private Exception error;
	private String errorId;
	private String stringError;
	public String getStringError() {
		return stringError;
	}
	public void setStringError(String stringError) {
		this.stringError = stringError;
	}
	public Exception getError() {
		return error;
	}
	public void setError(Exception error) {
		this.error = error;
	}
	public String getErrorId() {
		return errorId;
	}
	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}
	/**
	 * 
	 */
	public InternalError() {
		// TODO Auto-generated constructor stub
		errorId=Generate.keyString(20); 
	}
	
	public JSONObject generateJSON() throws JSONException{
		JSONObject jsonError=new JSONObject();
		jsonError.put("idError", errorId);
		jsonError.put("descriptionError", stringError);
		return jsonError;
	}
}
