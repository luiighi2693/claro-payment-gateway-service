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
public class ProcessCreditCardRequest {
    
    private String  cardNum;
    private String  expDate;
    private String  nameOnCard;
    private String  amount;
    private String  zip;
    private String  street;
    private String  cvNum;
    private String  aplicationID;
    private String  pcrftransaID;
    private String  accountNumber;

    public ProcessCreditCardRequest() {
    }

    
    public ProcessCreditCardRequest(String cardNum, String expDate, String nameOnCard, String amount, 
    		String zip, String street, String cvNum, String aplicationID, String accountNumber) {
        this.cardNum = cardNum;
        this.expDate = expDate;
        this.nameOnCard = nameOnCard;
        this.amount = amount;
        this.zip = zip;
        this.street = street;
        this.cvNum = cvNum;
        this.aplicationID = aplicationID;
        this.accountNumber = accountNumber;
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

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
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

	public String getAccountNumber() {
        return accountNumber;
    }

	public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "ProcessCreditCardRequest{" + "cardNum=" + cardNum + ", expDate=" + expDate + ", nameOnCard=" + nameOnCard + ", amount=" + amount + ", zip=" + zip + ", street=" + street + ", cvNum=" + cvNum+ ", aplicationID=" + aplicationID +", pcrftransaID=" + pcrftransaID + ", accountNumber=" + accountNumber + '}';
    }
    public JSONObject generateJSONObject()throws JSONException{
        JSONObject output = new JSONObject();
        
        output.put("cardNum", cardNum);
        output.put("expDate", expDate);
        output.put("nameOnCard", nameOnCard);
        output.put("amount", amount);
        output.put("zip", zip);
        output.put("street", street);
        output.put("cvNum", cvNum);
        output.put("aplicationID", aplicationID);
        output.put("pcrftransaID", pcrftransaID);
        output.put("accountNumber", accountNumber);
        
        return output;
    }
}
