/**
 * MerchantServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WebMerchant.MerchantService;

import ReverseTransaction.MMPay.Evertec.ReverseTransactionResponse;
import TransactionSearch.MMPay.Evertec.TransactionSearchRequest;

public interface MerchantServiceSoap extends java.rmi.Remote {

    /**
     * This XML Web service validates a client and redirects them
     * to the Banco Popular Checkout Payment System
     */
    public java.lang.String makePayment(java.lang.String username, java.lang.String password, java.lang.String customerName, java.lang.String customerID, java.lang.String customerEmail, java.lang.String total, java.lang.String descriptionBuy, java.lang.String taxAmount1, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String zipcode, java.lang.String telephone, java.lang.String fax, java.lang.String ignoreValues, java.lang.String language, java.lang.String taxAmount2, java.lang.String taxAmount3, java.lang.String taxAmount4, java.lang.String taxAmount5, java.lang.String filler1, java.lang.String filler2, java.lang.String filler3) throws java.rmi.RemoteException;

    /**
     * Transaction Search
     */
    public TransactionSearchResponse transactionSearch(TransactionSearchRequest transactionSearchRequest) throws java.rmi.RemoteException;

    /**
     * Reverse ACH Transaction
     */
    public ReverseTransactionResponse reverseACHTransaction(ReverseTransaction.MMPay.Evertec.ReverseTransactionRequest reverseTransactionRequest) throws java.rmi.RemoteException;

    /**
     * Reverse Card Transaction
     */
    public CardReverseTransaction.MMPay.Evertec.CardReverseTransactionResponse reverseCardTransaction(CardReverseTransaction.MMPay.Evertec.CardReverseTransactionRequest cardReverseTransactionRequest) throws java.rmi.RemoteException;
}
