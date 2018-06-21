/**
 * PrepareDebitTrxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.debit.transacta.paymentgateway.evertec;

public class PrepareDebitTrxResponse  implements java.io.Serializable {
    private java.lang.String getError;

    private service.debit.transacta.paymentgateway.evertec.TrxStatus trxStatus;

    private java.util.Calendar trxDate;

    private java.lang.String HTMLCode;

    private boolean fieldError;

    private java.lang.String[] fieldErrorList;

    public PrepareDebitTrxResponse() {
    }

    public PrepareDebitTrxResponse(
           java.lang.String getError,
           service.debit.transacta.paymentgateway.evertec.TrxStatus trxStatus,
           java.util.Calendar trxDate,
           java.lang.String HTMLCode,
           boolean fieldError,
           java.lang.String[] fieldErrorList) {
           this.getError = getError;
           this.trxStatus = trxStatus;
           this.trxDate = trxDate;
           this.HTMLCode = HTMLCode;
           this.fieldError = fieldError;
           this.fieldErrorList = fieldErrorList;
    }


    /**
     * Gets the getError value for this PrepareDebitTrxResponse.
     * 
     * @return getError
     */
    public java.lang.String getGetError() {
        return getError;
    }


    /**
     * Sets the getError value for this PrepareDebitTrxResponse.
     * 
     * @param getError
     */
    public void setGetError(java.lang.String getError) {
        this.getError = getError;
    }


    /**
     * Gets the trxStatus value for this PrepareDebitTrxResponse.
     * 
     * @return trxStatus
     */
    public service.debit.transacta.paymentgateway.evertec.TrxStatus getTrxStatus() {
        return trxStatus;
    }


    /**
     * Sets the trxStatus value for this PrepareDebitTrxResponse.
     * 
     * @param trxStatus
     */
    public void setTrxStatus(service.debit.transacta.paymentgateway.evertec.TrxStatus trxStatus) {
        this.trxStatus = trxStatus;
    }


    /**
     * Gets the trxDate value for this PrepareDebitTrxResponse.
     * 
     * @return trxDate
     */
    public java.util.Calendar getTrxDate() {
        return trxDate;
    }


    /**
     * Sets the trxDate value for this PrepareDebitTrxResponse.
     * 
     * @param trxDate
     */
    public void setTrxDate(java.util.Calendar trxDate) {
        this.trxDate = trxDate;
    }


    /**
     * Gets the HTMLCode value for this PrepareDebitTrxResponse.
     * 
     * @return HTMLCode
     */
    public java.lang.String getHTMLCode() {
        return HTMLCode;
    }


    /**
     * Sets the HTMLCode value for this PrepareDebitTrxResponse.
     * 
     * @param HTMLCode
     */
    public void setHTMLCode(java.lang.String HTMLCode) {
        this.HTMLCode = HTMLCode;
    }


    /**
     * Gets the fieldError value for this PrepareDebitTrxResponse.
     * 
     * @return fieldError
     */
    public boolean isFieldError() {
        return fieldError;
    }


    /**
     * Sets the fieldError value for this PrepareDebitTrxResponse.
     * 
     * @param fieldError
     */
    public void setFieldError(boolean fieldError) {
        this.fieldError = fieldError;
    }


    /**
     * Gets the fieldErrorList value for this PrepareDebitTrxResponse.
     * 
     * @return fieldErrorList
     */
    public java.lang.String[] getFieldErrorList() {
        return fieldErrorList;
    }


    /**
     * Sets the fieldErrorList value for this PrepareDebitTrxResponse.
     * 
     * @param fieldErrorList
     */
    public void setFieldErrorList(java.lang.String[] fieldErrorList) {
        this.fieldErrorList = fieldErrorList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepareDebitTrxResponse)) return false;
        PrepareDebitTrxResponse other = (PrepareDebitTrxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getError==null && other.getGetError()==null) || 
             (this.getError!=null &&
              this.getError.equals(other.getGetError()))) &&
            ((this.trxStatus==null && other.getTrxStatus()==null) || 
             (this.trxStatus!=null &&
              this.trxStatus.equals(other.getTrxStatus()))) &&
            ((this.trxDate==null && other.getTrxDate()==null) || 
             (this.trxDate!=null &&
              this.trxDate.equals(other.getTrxDate()))) &&
            ((this.HTMLCode==null && other.getHTMLCode()==null) || 
             (this.HTMLCode!=null &&
              this.HTMLCode.equals(other.getHTMLCode()))) &&
            this.fieldError == other.isFieldError() &&
            ((this.fieldErrorList==null && other.getFieldErrorList()==null) || 
             (this.fieldErrorList!=null &&
              java.util.Arrays.equals(this.fieldErrorList, other.getFieldErrorList())));
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
        if (getGetError() != null) {
            _hashCode += getGetError().hashCode();
        }
        if (getTrxStatus() != null) {
            _hashCode += getTrxStatus().hashCode();
        }
        if (getTrxDate() != null) {
            _hashCode += getTrxDate().hashCode();
        }
        if (getHTMLCode() != null) {
            _hashCode += getHTMLCode().hashCode();
        }
        _hashCode += (isFieldError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFieldErrorList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldErrorList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldErrorList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrepareDebitTrxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PrepareDebitTrxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getError");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "GetError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trxStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TrxStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TrxStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trxDate");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TrxDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HTMLCode");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "HTMLCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldError");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "FieldError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "FieldErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "string"));
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
