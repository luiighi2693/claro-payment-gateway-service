/**
 * ReverseCardTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.WebMerchant.MerchantService;

public class ReverseCardTransactionResponse  implements java.io.Serializable {
    private CardReverseTransaction.MMPay.Evertec.CardReverseTransactionResponse cardReverseTransactionResponse;

    public ReverseCardTransactionResponse() {
    }

    public ReverseCardTransactionResponse(
           CardReverseTransaction.MMPay.Evertec.CardReverseTransactionResponse cardReverseTransactionResponse) {
           this.cardReverseTransactionResponse = cardReverseTransactionResponse;
    }


    /**
     * Gets the cardReverseTransactionResponse value for this ReverseCardTransactionResponse.
     * 
     * @return cardReverseTransactionResponse
     */
    public CardReverseTransaction.MMPay.Evertec.CardReverseTransactionResponse getCardReverseTransactionResponse() {
        return cardReverseTransactionResponse;
    }


    /**
     * Sets the cardReverseTransactionResponse value for this ReverseCardTransactionResponse.
     * 
     * @param cardReverseTransactionResponse
     */
    public void setCardReverseTransactionResponse(CardReverseTransaction.MMPay.Evertec.CardReverseTransactionResponse cardReverseTransactionResponse) {
        this.cardReverseTransactionResponse = cardReverseTransactionResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReverseCardTransactionResponse)) return false;
        ReverseCardTransactionResponse other = (ReverseCardTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardReverseTransactionResponse==null && other.getCardReverseTransactionResponse()==null) || 
             (this.cardReverseTransactionResponse!=null &&
              this.cardReverseTransactionResponse.equals(other.getCardReverseTransactionResponse())));
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
        if (getCardReverseTransactionResponse() != null) {
            _hashCode += getCardReverseTransactionResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReverseCardTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/WebMerchant/MerchantService", ">ReverseCardTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardReverseTransactionResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "CardReverseTransactionResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "CardReverseTransactionResponse"));
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
