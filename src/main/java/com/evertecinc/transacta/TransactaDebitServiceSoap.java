/**
 * TransactaDebitServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evertecinc.transacta;

public interface TransactaDebitServiceSoap extends java.rmi.Remote {

    /**
     * Prepare Debit Transaction
     */
    public service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxResponse prepareDebitTransaction(service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxRequest prepareDebitTrxRequest) throws java.rmi.RemoteException;

    /**
     * Request Debit Result
     */
    public service.debit.transacta.paymentgateway.evertec.ResultDebitTrxResponse requestDebitResult(service.debit.transacta.paymentgateway.evertec.ResultDebitTrxRequest resultDebitTrxRequest) throws java.rmi.RemoteException;
}
