/**
 * MerchantServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WebMerchant.MerchantService;

public class MerchantServiceLocator extends org.apache.axis.client.Service implements org.tempuri.WebMerchant.MerchantService.MerchantService {

/**
 * This XML Web service allows clients to log on to Multimerchant
 * Pay System. Ver. 06012012
 */

    public MerchantServiceLocator() {
    }


    public MerchantServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MerchantServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MerchantServiceSoap
    private java.lang.String MerchantServiceSoap_address = "https://mmpay.evertecinc.com/webservicev2/wscheckoutpayment.asmx";

    public java.lang.String getMerchantServiceSoapAddress() {
        return MerchantServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MerchantServiceSoapWSDDServiceName = "MerchantServiceSoap";

    public java.lang.String getMerchantServiceSoapWSDDServiceName() {
        return MerchantServiceSoapWSDDServiceName;
    }

    public void setMerchantServiceSoapWSDDServiceName(java.lang.String name) {
        MerchantServiceSoapWSDDServiceName = name;
    }

    public org.tempuri.WebMerchant.MerchantService.MerchantServiceSoap getMerchantServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MerchantServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMerchantServiceSoap(endpoint);
    }

    public org.tempuri.WebMerchant.MerchantService.MerchantServiceSoap getMerchantServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WebMerchant.MerchantService.MerchantServiceSoapStub _stub = new org.tempuri.WebMerchant.MerchantService.MerchantServiceSoapStub(portAddress, this);
            _stub.setPortName(getMerchantServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMerchantServiceSoapEndpointAddress(java.lang.String address) {
        MerchantServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WebMerchant.MerchantService.MerchantServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WebMerchant.MerchantService.MerchantServiceSoapStub _stub = new org.tempuri.WebMerchant.MerchantService.MerchantServiceSoapStub(new java.net.URL(MerchantServiceSoap_address), this);
                _stub.setPortName(getMerchantServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MerchantServiceSoap".equals(inputPortName)) {
            return getMerchantServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/WebMerchant/MerchantService", "MerchantService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/WebMerchant/MerchantService", "MerchantServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MerchantServiceSoap".equals(portName)) {
            setMerchantServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
