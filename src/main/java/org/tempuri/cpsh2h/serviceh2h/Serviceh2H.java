/**
 * Serviceh2H.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.cpsh2h.serviceh2h;

public interface Serviceh2H extends javax.xml.rpc.Service {

/**
 * This XML Web service allows clients to log on to Multimerchant
 * Pay System. Ver. 06212013
 */
    public java.lang.String getserviceh2hSoapAddress();

    public org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoap getserviceh2hSoap() throws javax.xml.rpc.ServiceException;

    public org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoap getserviceh2hSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
