/**
 * ReverseACHTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WebMerchant.MerchantService;

public class ReverseACHTransactionResponse  implements java.io.Serializable {
    private ReverseTransaction.MMPay.Evertec.ReverseTransactionResponse reverseTransactionResponse;

    public ReverseACHTransactionResponse() {
    }

    public ReverseACHTransactionResponse(
           ReverseTransaction.MMPay.Evertec.ReverseTransactionResponse reverseTransactionResponse) {
           this.reverseTransactionResponse = reverseTransactionResponse;
    }


    /**
     * Gets the reverseTransactionResponse value for this ReverseACHTransactionResponse.
     * 
     * @return reverseTransactionResponse
     */
    public ReverseTransaction.MMPay.Evertec.ReverseTransactionResponse getReverseTransactionResponse() {
        return reverseTransactionResponse;
    }


    /**
     * Sets the reverseTransactionResponse value for this ReverseACHTransactionResponse.
     * 
     * @param reverseTransactionResponse
     */
    public void setReverseTransactionResponse(ReverseTransaction.MMPay.Evertec.ReverseTransactionResponse reverseTransactionResponse) {
        this.reverseTransactionResponse = reverseTransactionResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReverseACHTransactionResponse)) return false;
        ReverseACHTransactionResponse other = (ReverseACHTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reverseTransactionResponse==null && other.getReverseTransactionResponse()==null) || 
             (this.reverseTransactionResponse!=null &&
              this.reverseTransactionResponse.equals(other.getReverseTransactionResponse())));
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
        if (getReverseTransactionResponse() != null) {
            _hashCode += getReverseTransactionResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReverseACHTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WebMerchant/MerchantService", ">ReverseACHTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseTransactionResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "ReverseTransactionResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "ReverseTransactionResponse"));
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
