/**
 * Serviceh2HLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.cpsh2h.serviceh2h;

public class Serviceh2HLocator extends org.apache.axis.client.Service implements org.tempuri.cpsh2h.serviceh2h.Serviceh2H {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/**
 * This XML Web service allows clients to log on to Multimerchant
 * Pay System. Ver. 06212013
 */

    public Serviceh2HLocator() {
    }


    public Serviceh2HLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Serviceh2HLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for serviceh2hSoap
    private java.lang.String serviceh2hSoap_address = "https://everpaycert.evertecinc.com/cpsh2h/serviceh2h.asmx";

    public java.lang.String getserviceh2hSoapAddress() {
        return serviceh2hSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String serviceh2hSoapWSDDServiceName = "serviceh2hSoap";

    public java.lang.String getserviceh2hSoapWSDDServiceName() {
        return serviceh2hSoapWSDDServiceName;
    }

    public void setserviceh2hSoapWSDDServiceName(java.lang.String name) {
        serviceh2hSoapWSDDServiceName = name;
    }

    public org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoap getserviceh2hSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(serviceh2hSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getserviceh2hSoap(endpoint);
    }

    public org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoap getserviceh2hSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoapStub _stub = new org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoapStub(portAddress, this);
            _stub.setPortName(getserviceh2hSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setserviceh2hSoapEndpointAddress(java.lang.String address) {
        serviceh2hSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoapStub _stub = new org.tempuri.cpsh2h.serviceh2h.Serviceh2HSoapStub(new java.net.URL(serviceh2hSoap_address), this);
                _stub.setPortName(getserviceh2hSoapWSDDServiceName());
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
        if ("serviceh2hSoap".equals(inputPortName)) {
            return getserviceh2hSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "serviceh2h");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "serviceh2hSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("serviceh2hSoap".equals(portName)) {
            setserviceh2hSoapEndpointAddress(address);
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
