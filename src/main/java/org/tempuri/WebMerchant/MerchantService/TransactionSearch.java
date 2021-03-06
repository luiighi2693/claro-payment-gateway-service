/**
 * TransactionSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WebMerchant.MerchantService;

import TransactionSearch.MMPay.Evertec.TransactionSearchRequest;

public class TransactionSearch  implements java.io.Serializable {
	
    private TransactionSearchRequest transactionSearchRequest;

    public TransactionSearch() {
    }

    public TransactionSearch(
           TransactionSearchRequest transactionSearchRequest) {
           this.transactionSearchRequest = transactionSearchRequest;
    }


    /**
     * Gets the transactionSearchRequest value for this TransactionSearch.
     * 
     * @return transactionSearchRequest
     */
    public TransactionSearchRequest getTransactionSearchRequest() {
        return transactionSearchRequest;
    }


    /**
     * Sets the transactionSearchRequest value for this TransactionSearch.
     * 
     * @param transactionSearchRequest
     */
    public void setTransactionSearchRequest(TransactionSearchRequest transactionSearchRequest) {
        this.transactionSearchRequest = transactionSearchRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearch)) return false;
        TransactionSearch other = (TransactionSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionSearchRequest==null && other.getTransactionSearchRequest()==null) || 
             (this.transactionSearchRequest!=null &&
              this.transactionSearchRequest.equals(other.getTransactionSearchRequest())));
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
        if (getTransactionSearchRequest() != null) {
            _hashCode += getTransactionSearchRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WebMerchant/MerchantService", ">TransactionSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSearchRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "TransactionSearchRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "TransactionSearchRequest"));
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
