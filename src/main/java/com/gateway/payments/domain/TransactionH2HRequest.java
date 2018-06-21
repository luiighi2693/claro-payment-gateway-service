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
public class TransactionH2HRequest {
	
	private String paymentType; 
	private String cardNumber;
	private String expirationDate; 
	private String customerName; 
	private String amount; 
	private String securityCardCode; 
	private String address;
	private String city;
	private String state;
	private String email;
	private String customerId;
	private String cellphone;
	private String zipCode; 
	private String descriptionBuy; 
	
	public TransactionH2HRequest() {

	}

	public TransactionH2HRequest(String paymentType, String cardNumber,
			String expirationDate, String customerName, String amount,
			String securityCardCode, String address, String city, String state,
			String email, String customerId, String cellphone, String zipCode,
			String descriptionBuy) {
		super();
		this.paymentType = paymentType;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.customerName = customerName;
		this.amount = amount;
		this.securityCardCode = securityCardCode;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.customerId = customerId;
		this.cellphone = cellphone;
		this.zipCode = zipCode;
		this.descriptionBuy = descriptionBuy;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getDescriptionBuy() {
		return descriptionBuy;
	}

	public void setDescriptionBuy(String descriptionBuy) {
		this.descriptionBuy = descriptionBuy;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getSecurityCardCode() {
		return securityCardCode;
	}

	public void setSecurityCardCode(String securityCardCode) {
		this.securityCardCode = securityCardCode;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

}
