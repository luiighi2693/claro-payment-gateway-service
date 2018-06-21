/**
 * Serviceh2H.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gateway.payments.ws.serviceh2h;

public interface Serviceh2H extends javax.xml.rpc.Service {

/**
 * This XML Web service allows clients to log on to
 *       Multimerchant Pay System. Ver. 06212013
 */
    public String getserviceh2hSoapAddress();

    public Serviceh2HSoap_PortType getserviceh2hSoap() throws javax.xml.rpc.ServiceException;

    public Serviceh2HSoap_PortType getserviceh2hSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
