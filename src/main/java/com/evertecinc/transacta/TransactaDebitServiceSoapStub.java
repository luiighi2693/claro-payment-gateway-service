/**
 * TransactaDebitServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.evertecinc.transacta;

public class TransactaDebitServiceSoapStub extends org.apache.axis.client.Stub implements com.evertecinc.transacta.TransactaDebitServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PrepareDebitTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PrepareDebitTrxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PrepareDebitTrxRequest"), service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PrepareDebitTrxResponse"));
        oper.setReturnClass(service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PrepareDebitTrxResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestDebitResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ResultDebitTrxRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ResultDebitTrxRequest"), service.debit.transacta.paymentgateway.evertec.ResultDebitTrxRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ResultDebitTrxResponse"));
        oper.setReturnClass(service.debit.transacta.paymentgateway.evertec.ResultDebitTrxResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ResultDebitTrxResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

    }

    public TransactaDebitServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TransactaDebitServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TransactaDebitServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service.Classes", "DebitTrxBase");
            cachedSerQNames.add(qName);
            cls = classes.service.debit.transacta.paymentgateway.evertec.DebitTrxBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PrepareDebitTrxRequest");
            cachedSerQNames.add(qName);
            cls = service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PrepareDebitTrxResponse");
            cachedSerQNames.add(qName);
            cls = service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ResultDebitTrxRequest");
            cachedSerQNames.add(qName);
            cls = service.debit.transacta.paymentgateway.evertec.ResultDebitTrxRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ResultDebitTrxResponse");
            cachedSerQNames.add(qName);
            cls = service.debit.transacta.paymentgateway.evertec.ResultDebitTrxResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TrxStatus");
            cachedSerQNames.add(qName);
            cls = service.debit.transacta.paymentgateway.evertec.TrxStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TrxType");
            cachedSerQNames.add(qName);
            cls = service.debit.transacta.paymentgateway.evertec.TrxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxResponse prepareDebitTransaction(service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxRequest prepareDebitTrxRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://transacta.evertecinc.com/PrepareDebitTransaction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://transacta.evertecinc.com/", "PrepareDebitTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {prepareDebitTrxRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxResponse) org.apache.axis.utils.JavaUtils.convert(_resp, service.debit.transacta.paymentgateway.evertec.PrepareDebitTrxResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public service.debit.transacta.paymentgateway.evertec.ResultDebitTrxResponse requestDebitResult(service.debit.transacta.paymentgateway.evertec.ResultDebitTrxRequest resultDebitTrxRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://transacta.evertecinc.com/RequestDebitResult");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://transacta.evertecinc.com/", "RequestDebitResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resultDebitTrxRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (service.debit.transacta.paymentgateway.evertec.ResultDebitTrxResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (service.debit.transacta.paymentgateway.evertec.ResultDebitTrxResponse) org.apache.axis.utils.JavaUtils.convert(_resp, service.debit.transacta.paymentgateway.evertec.ResultDebitTrxResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
