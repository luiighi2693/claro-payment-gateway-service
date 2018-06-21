/**
 * RequestPINPADResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.cpsh2h.serviceh2h;

public class RequestPINPADResponse  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private org.tempuri.cpsh2h.serviceh2h.PinPadResponse requestPINPADResult;

    public RequestPINPADResponse() {
    }

    public RequestPINPADResponse(
           org.tempuri.cpsh2h.serviceh2h.PinPadResponse requestPINPADResult) {
           this.requestPINPADResult = requestPINPADResult;
    }


    /**
     * Gets the requestPINPADResult value for this RequestPINPADResponse.
     * 
     * @return requestPINPADResult
     */
    public org.tempuri.cpsh2h.serviceh2h.PinPadResponse getRequestPINPADResult() {
        return requestPINPADResult;
    }


    /**
     * Sets the requestPINPADResult value for this RequestPINPADResponse.
     * 
     * @param requestPINPADResult
     */
    public void setRequestPINPADResult(org.tempuri.cpsh2h.serviceh2h.PinPadResponse requestPINPADResult) {
        this.requestPINPADResult = requestPINPADResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestPINPADResponse)) return false;
        RequestPINPADResponse other = (RequestPINPADResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestPINPADResult==null && other.getRequestPINPADResult()==null) || 
             (this.requestPINPADResult!=null &&
              this.requestPINPADResult.equals(other.getRequestPINPADResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestPINPADResult() != null) {
            _hashCode += getRequestPINPADResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestPINPADResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", ">RequestPINPADResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestPINPADResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "RequestPINPADResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "PinPadResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
