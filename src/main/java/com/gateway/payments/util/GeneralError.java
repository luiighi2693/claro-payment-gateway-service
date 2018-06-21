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
public class GeneralError implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3774628342466673580L;
	private String codError;
	private String msgError;
	/**
	 * 
	 */
	public GeneralError() {
		// TODO Auto-generated constructor stub
	}
	public String getCodError() {
		return codError;
	}
	public void setCodError(String codError) {
		this.codError = codError;
	}
	public String getMsgError() {
		return msgError;
	}
	public void setMsgError(String msgError) {
		this.msgError = msgError;
	}
	public JSONObject generateJSON() throws JSONException{
		JSONObject jsonError=new JSONObject();
		jsonError.put("codError", codError);
		jsonError.put("msgError", msgError);
		return jsonError;
	}
}
