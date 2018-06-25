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
 * @author jrodriguez
 */
public class ProcessCreditCardH2HRequest {

    private String  cardNum;
    private String  expDate;
    private String  customerName;
    private String  amount;
    private String  zipCode;
    private String  street;
    private String  cvNum;
    private String  aplicationID;
    private String  pcrftransaID;

    private String  customerId;
    private String  customerEmail;
    private String  telephone;
    private String  address1;
    private String  address2;
    private String  state;
    private String  city;
    private String  descriptionBuy;
    private String  paymentType;


    public ProcessCreditCardH2HRequest() {
    }


    public ProcessCreditCardH2HRequest(String cardNum, String expDate, String customerName, String amount, String zipCode, String street, String cvNum, String aplicationID, String pcrftransaID, String customerId, String customerEmail, String telephone, String address1, String address2, String state, String city, String descriptionBuy, String paymentType) {
        this.cardNum = cardNum;
        this.expDate = expDate;
        this.customerName = customerName;
        this.amount = amount;
        this.zipCode = zipCode;
        this.street = street;
        this.cvNum = cvNum;
        this.aplicationID = aplicationID;
        this.pcrftransaID = pcrftransaID;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.telephone = telephone;
        this.address1 = address1;
        this.address2 = address2;
        this.state = state;
        this.city = city;
        this.descriptionBuy = descriptionBuy;
        this.paymentType = paymentType;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCvNum() {
        return cvNum;
    }

    public void setCvNum(String cvNum) {
        this.cvNum = cvNum;
    }

    public String getAplicationID() {
        return aplicationID;
    }

    public void setAplicationID(String aplicationID) {
        this.aplicationID = aplicationID;
    }

    public String getPcrftransaID() {
        return pcrftransaID;
    }

    public void setPcrftransaID(String pcrftransaID) {
        this.pcrftransaID = pcrftransaID;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescriptionBuy() {
        return descriptionBuy;
    }

    public void setDescriptionBuy(String descriptionBuy) {
        this.descriptionBuy = descriptionBuy;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "ProcessCreditCardRequest{" + "cardNum=" + cardNum + ", expDate=" + expDate + ", customerName=" + customerName + ", amount=" + amount + ", zipCode=" + zipCode + ", address1=" + address1 + ", address2=" + address2 + ", cvNum=" + cvNum+ ", aplicationID=" + aplicationID +", pcrftransaID=" + pcrftransaID + '}';
    }
    public JSONObject generateJSONObject()throws JSONException{
        JSONObject output = new JSONObject();
        
        output.put("cardNum", cardNum);
        output.put("expDate", expDate);
        output.put("customerName", customerName);
        output.put("amount", amount);
        output.put("zipCode", zipCode);
        output.put("street", street);
        output.put("cvNum", cvNum);
        output.put("aplicationID", aplicationID);
        output.put("pcrftransaID", pcrftransaID);

        return output;
    }
}
