/**
 * Serviceh2HSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.cpsh2h.serviceh2h;

public interface Serviceh2HSoap extends java.rmi.Remote {

    /**
     * This XML Web Service Authorize VISA, MasterCard and AMEX Payments
     * with EVERTEC
     */
    public org.tempuri.cpsh2h.serviceh2h.SendTransactionsResponseSendTransactionsResult sendTransactions(java.lang.String userName, java.lang.String passWord, java.lang.String customerID, java.lang.String customerName, java.lang.String customerEmail, java.lang.String telephone, java.lang.String fax, java.lang.String address1, java.lang.String address2, java.lang.String state, java.lang.String city, java.lang.String zipCode, java.lang.String descriptionBuy, java.lang.String operatorId, java.lang.String channel, java.lang.String tax1, java.lang.String tax2, java.lang.String tax3, java.lang.String tax4, java.lang.String merchantTransId, java.lang.String amount, java.lang.String paymentType, java.lang.String securityCardCode, java.lang.String expirationDate, java.lang.String cardNumber, java.lang.String bankRoutingNumber, java.lang.String bankAccountNumber, java.lang.String authorizationBit, java.lang.String bankClientName, java.lang.String filler1, java.lang.String filler2, java.lang.String filler3, java.lang.String filler4, java.lang.String note) throws java.rmi.RemoteException;

    /**
     * EVERTEC - ATH REQUEST PINPAD
     */
    public org.tempuri.cpsh2h.serviceh2h.PinPadResponse requestPINPAD(java.lang.String userName, java.lang.String passWord, java.lang.String customerID, java.lang.String customerName, java.lang.String customerEmail, java.lang.String telephone, java.lang.String fax, java.lang.String address1, java.lang.String address2, java.lang.String state, java.lang.String city, java.lang.String zipCode, java.lang.String descriptionBuy, java.lang.String operatorId, java.lang.String channel, java.lang.String tax1, java.lang.String tax2, java.lang.String tax3, java.lang.String tax4, java.lang.String merchantTransId, java.lang.String amount, java.lang.String expirationDate, java.lang.String cardNumber, java.lang.String filler1, java.lang.String filler2, java.lang.String filler3, java.lang.String filler4, java.lang.String note) throws java.rmi.RemoteException;

    /**
     * EVERTEC - ATH SUBMIT PAYMENT
     */
    public org.tempuri.cpsh2h.serviceh2h.ATHResponse submitATH(java.lang.String userName, java.lang.String passWord, java.lang.String requestid) throws java.rmi.RemoteException;
}
