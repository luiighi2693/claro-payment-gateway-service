/**
 * TransactaDebitServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evertecinc.transacta;

public class TransactaDebitServiceLocator extends org.apache.axis.client.Service implements com.evertecinc.transacta.TransactaDebitService {

/**
 * Evertec PaymentGateway Transacta Debit Service
 */

    public TransactaDebitServiceLocator() {
    }


    public TransactaDebitServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TransactaDebitServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TransactaDebitServiceSoap
    private java.lang.String TransactaDebitServiceSoap_address = "https://everpaycert.evertecinc.com/TransactaDebitService/TransactaDebitService.asmx";

    public java.lang.String getTransactaDebitServiceSoapAddress() {
        return TransactaDebitServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TransactaDebitServiceSoapWSDDServiceName = "TransactaDebitServiceSoap";

    public java.lang.String getTransactaDebitServiceSoapWSDDServiceName() {
        return TransactaDebitServiceSoapWSDDServiceName;
    }

    public void setTransactaDebitServiceSoapWSDDServiceName(java.lang.String name) {
        TransactaDebitServiceSoapWSDDServiceName = name;
    }

    public com.evertecinc.transacta.TransactaDebitServiceSoap getTransactaDebitServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TransactaDebitServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTransactaDebitServiceSoap(endpoint);
    }

    public com.evertecinc.transacta.TransactaDebitServiceSoap getTransactaDebitServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.evertecinc.transacta.TransactaDebitServiceSoapStub _stub = new com.evertecinc.transacta.TransactaDebitServiceSoapStub(portAddress, this);
            _stub.setPortName(getTransactaDebitServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTransactaDebitServiceSoapEndpointAddress(java.lang.String address) {
        TransactaDebitServiceSoap_address = address;
    }


    // Use to get a proxy class for TransactaDebitServiceSoap12
    private java.lang.String TransactaDebitServiceSoap12_address = "https://everpaycert.evertecinc.com/TransactaDebitService/TransactaDebitService.asmx";

    public java.lang.String getTransactaDebitServiceSoap12Address() {
        return TransactaDebitServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TransactaDebitServiceSoap12WSDDServiceName = "TransactaDebitServiceSoap12";

    public java.lang.String getTransactaDebitServiceSoap12WSDDServiceName() {
        return TransactaDebitServiceSoap12WSDDServiceName;
    }

    public void setTransactaDebitServiceSoap12WSDDServiceName(java.lang.String name) {
        TransactaDebitServiceSoap12WSDDServiceName = name;
    }

    public com.evertecinc.transacta.TransactaDebitServiceSoap getTransactaDebitServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TransactaDebitServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTransactaDebitServiceSoap12(endpoint);
    }

    public com.evertecinc.transacta.TransactaDebitServiceSoap getTransactaDebitServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.evertecinc.transacta.TransactaDebitServiceSoap12Stub _stub = new com.evertecinc.transacta.TransactaDebitServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getTransactaDebitServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTransactaDebitServiceSoap12EndpointAddress(java.lang.String address) {
        TransactaDebitServiceSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.evertecinc.transacta.TransactaDebitServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.evertecinc.transacta.TransactaDebitServiceSoapStub _stub = new com.evertecinc.transacta.TransactaDebitServiceSoapStub(new java.net.URL(TransactaDebitServiceSoap_address), this);
                _stub.setPortName(getTransactaDebitServiceSoapWSDDServiceName());
                return _stub;
            }
            if (com.evertecinc.transacta.TransactaDebitServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.evertecinc.transacta.TransactaDebitServiceSoap12Stub _stub = new com.evertecinc.transacta.TransactaDebitServiceSoap12Stub(new java.net.URL(TransactaDebitServiceSoap12_address), this);
                _stub.setPortName(getTransactaDebitServiceSoap12WSDDServiceName());
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
        if ("TransactaDebitServiceSoap".equals(inputPortName)) {
            return getTransactaDebitServiceSoap();
        }
        else if ("TransactaDebitServiceSoap12".equals(inputPortName)) {
            return getTransactaDebitServiceSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://transacta.evertecinc.com/", "TransactaDebitService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://transacta.evertecinc.com/", "TransactaDebitServiceSoap"));
            ports.add(new javax.xml.namespace.QName("http://transacta.evertecinc.com/", "TransactaDebitServiceSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TransactaDebitServiceSoap".equals(portName)) {
            setTransactaDebitServiceSoapEndpointAddress(address);
        }
        else 
if ("TransactaDebitServiceSoap12".equals(portName)) {
            setTransactaDebitServiceSoap12EndpointAddress(address);
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
