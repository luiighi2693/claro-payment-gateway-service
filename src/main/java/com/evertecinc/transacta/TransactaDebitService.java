/**
 * TransactaDebitService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evertecinc.transacta;

public interface TransactaDebitService extends javax.xml.rpc.Service {

/**
 * Evertec PaymentGateway Transacta Debit Service
 */
    public java.lang.String getTransactaDebitServiceSoapAddress();

    public com.evertecinc.transacta.TransactaDebitServiceSoap getTransactaDebitServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.evertecinc.transacta.TransactaDebitServiceSoap getTransactaDebitServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getTransactaDebitServiceSoap12Address();

    public com.evertecinc.transacta.TransactaDebitServiceSoap getTransactaDebitServiceSoap12() throws javax.xml.rpc.ServiceException;

    public com.evertecinc.transacta.TransactaDebitServiceSoap getTransactaDebitServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
