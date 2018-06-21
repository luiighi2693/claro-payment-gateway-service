/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package com.gateway.payments.domain;

/**
 *
 * @author yriera
 */
public class TransactionH2HResponse {
	
	private static final long serialVersionUID = 1L;

	private String statusCode;
	private String statusDescription;
	private String confirmationNumber;
	private String authorizationNumber;
	
	
	public TransactionH2HResponse() {

	}


	public TransactionH2HResponse(String statusCode, String statusDescription,
			String confirmationNumber, String authorizationNumber) {
		super();
		this.statusCode = statusCode;
		this.statusDescription = statusDescription;
		this.confirmationNumber = confirmationNumber;
		this.authorizationNumber = authorizationNumber;
	}


	public String getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}


	public String getStatusDescription() {
		return statusDescription;
	}


	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}


	public String getConfirmationNumber() {
		return confirmationNumber;
	}


	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}


	public String getAuthorizationNumber() {
		return authorizationNumber;
	}


	public void setAuthorizationNumber(String authorizationNumber) {
		this.authorizationNumber = authorizationNumber;
	}

	
	

}
