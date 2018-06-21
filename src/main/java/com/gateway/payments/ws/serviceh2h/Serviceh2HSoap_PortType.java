/**
 * Serviceh2HSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gateway.payments.ws.serviceh2h;

public interface Serviceh2HSoap_PortType extends java.rmi.Remote {

    /**
     * This XML Web Service Authorize VISA, MasterCard
     *         and AMEX Payments with EVERTEC
     */
    public SendTransactionsResponseSendTransactionsResult sendTransactions(String userName, String passWord, String customerID, String customerName, String customerEmail, String telephone, String fax, String address1, String address2, String state, String city, String zipCode, String descriptionBuy, String operatorId, String channel, String tax1, String tax2, String tax3, String tax4, String merchantTransId, String amount, String paymentType, String securityCardCode, String expirationDate, String cardNumber, String bankRoutingNumber, String bankAccountNumber, String authorizationBit, String bankClientName, String filler1, String filler2, String filler3, String filler4, String note) throws java.rmi.RemoteException;

    /**
     * EVERTEC - ATH REQUEST PINPAD
     */
    public PinPadResponse requestPINPAD(String userName, String passWord, String customerID, String customerName, String customerEmail, String telephone, String fax, String address1, String address2, String state, String city, String zipCode, String descriptionBuy, String operatorId, String channel, String tax1, String tax2, String tax3, String tax4, String merchantTransId, String amount, String expirationDate, String cardNumber, String filler1, String filler2, String filler3, String filler4, String note) throws java.rmi.RemoteException;

    /**
     * EVERTEC - ATH SUBMIT PAYMENT
     */
    public ATHResponse submitATH(String userName, String passWord, String requestid) throws java.rmi.RemoteException;
}
