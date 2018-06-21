/**
 * SubmitATHResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gateway.payments.ws.serviceh2h;

public class SubmitATHResponse  implements java.io.Serializable {
    private ATHResponse submitATHResult;

    public SubmitATHResponse() {
    }

    public SubmitATHResponse(
           ATHResponse submitATHResult) {
           this.submitATHResult = submitATHResult;
    }


    /**
     * Gets the submitATHResult value for this SubmitATHResponse.
     * 
     * @return submitATHResult
     */
    public ATHResponse getSubmitATHResult() {
        return submitATHResult;
    }


    /**
     * Sets the submitATHResult value for this SubmitATHResponse.
     * 
     * @param submitATHResult
     */
    public void setSubmitATHResult(ATHResponse submitATHResult) {
        this.submitATHResult = submitATHResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubmitATHResponse)) return false;
        SubmitATHResponse other = (SubmitATHResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.submitATHResult==null && other.getSubmitATHResult()==null) ||
             (this.submitATHResult!=null &&
              this.submitATHResult.equals(other.getSubmitATHResult())));
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
        if (getSubmitATHResult() != null) {
            _hashCode += getSubmitATHResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitATHResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", ">SubmitATHResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitATHResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "SubmitATHResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "ATHResponse"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
