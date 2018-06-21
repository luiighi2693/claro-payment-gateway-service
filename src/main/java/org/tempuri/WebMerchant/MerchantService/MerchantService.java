/**
 * MerchantService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WebMerchant.MerchantService;

public interface MerchantService extends javax.xml.rpc.Service {

/**
 * This XML Web service allows clients to log on to Multimerchant
 * Pay System. Ver. 06012012
 */
    public java.lang.String getMerchantServiceSoapAddress();

    public org.tempuri.WebMerchant.MerchantService.MerchantServiceSoap getMerchantServiceSoap() throws javax.xml.rpc.ServiceException;

    public org.tempuri.WebMerchant.MerchantService.MerchantServiceSoap getMerchantServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
