/**
 * TransactionSearchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package TransactionSearch.MMPay.Evertec;

public class TransactionSearchResponse  implements java.io.Serializable {
    private java.lang.String getError;

    private java.lang.String getMessage;

    private java.lang.String statusCode;

    private boolean fieldError;

    private java.lang.Object[] fieldErrorList;

    private TransactionSearch.MMPay.Evertec.ResponseStatusType responseStatus;

    private TransactionSearch.MMPay.Evertec.TransactionSearchResponseTransactionDetail transactionDetail;

    private int affectedRows;

    public TransactionSearchResponse() {
    }

    public TransactionSearchResponse(
           java.lang.String getError,
           java.lang.String getMessage,
           java.lang.String statusCode,
           boolean fieldError,
           java.lang.Object[] fieldErrorList,
           TransactionSearch.MMPay.Evertec.ResponseStatusType responseStatus,
           TransactionSearch.MMPay.Evertec.TransactionSearchResponseTransactionDetail transactionDetail,
           int affectedRows) {
           this.getError = getError;
           this.getMessage = getMessage;
           this.statusCode = statusCode;
           this.fieldError = fieldError;
           this.fieldErrorList = fieldErrorList;
           this.responseStatus = responseStatus;
           this.transactionDetail = transactionDetail;
           this.affectedRows = affectedRows;
    }


    /**
     * Gets the getError value for this TransactionSearchResponse.
     * 
     * @return getError
     */
    public java.lang.String getGetError() {
        return getError;
    }


    /**
     * Sets the getError value for this TransactionSearchResponse.
     * 
     * @param getError
     */
    public void setGetError(java.lang.String getError) {
        this.getError = getError;
    }


    /**
     * Gets the getMessage value for this TransactionSearchResponse.
     * 
     * @return getMessage
     */
    public java.lang.String getGetMessage() {
        return getMessage;
    }


    /**
     * Sets the getMessage value for this TransactionSearchResponse.
     * 
     * @param getMessage
     */
    public void setGetMessage(java.lang.String getMessage) {
        this.getMessage = getMessage;
    }


    /**
     * Gets the statusCode value for this TransactionSearchResponse.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this TransactionSearchResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the fieldError value for this TransactionSearchResponse.
     * 
     * @return fieldError
     */
    public boolean isFieldError() {
        return fieldError;
    }


    /**
     * Sets the fieldError value for this TransactionSearchResponse.
     * 
     * @param fieldError
     */
    public void setFieldError(boolean fieldError) {
        this.fieldError = fieldError;
    }


    /**
     * Gets the fieldErrorList value for this TransactionSearchResponse.
     * 
     * @return fieldErrorList
     */
    public java.lang.Object[] getFieldErrorList() {
        return fieldErrorList;
    }


    /**
     * Sets the fieldErrorList value for this TransactionSearchResponse.
     * 
     * @param fieldErrorList
     */
    public void setFieldErrorList(java.lang.Object[] fieldErrorList) {
        this.fieldErrorList = fieldErrorList;
    }


    /**
     * Gets the responseStatus value for this TransactionSearchResponse.
     * 
     * @return responseStatus
     */
    public TransactionSearch.MMPay.Evertec.ResponseStatusType getResponseStatus() {
        return responseStatus;
    }


    /**
     * Sets the responseStatus value for this TransactionSearchResponse.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(TransactionSearch.MMPay.Evertec.ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }


    /**
     * Gets the transactionDetail value for this TransactionSearchResponse.
     * 
     * @return transactionDetail
     */
    public TransactionSearch.MMPay.Evertec.TransactionSearchResponseTransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this TransactionSearchResponse.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionSearch.MMPay.Evertec.TransactionSearchResponseTransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the affectedRows value for this TransactionSearchResponse.
     * 
     * @return affectedRows
     */
    public int getAffectedRows() {
        return affectedRows;
    }


    /**
     * Sets the affectedRows value for this TransactionSearchResponse.
     * 
     * @param affectedRows
     */
    public void setAffectedRows(int affectedRows) {
        this.affectedRows = affectedRows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchResponse)) return false;
        TransactionSearchResponse other = (TransactionSearchResponse) obj;
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
            ((this.getMessage==null && other.getGetMessage()==null) || 
             (this.getMessage!=null &&
              this.getMessage.equals(other.getGetMessage()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            this.fieldError == other.isFieldError() &&
            ((this.fieldErrorList==null && other.getFieldErrorList()==null) || 
             (this.fieldErrorList!=null &&
              java.util.Arrays.equals(this.fieldErrorList, other.getFieldErrorList()))) &&
            ((this.responseStatus==null && other.getResponseStatus()==null) || 
             (this.responseStatus!=null &&
              this.responseStatus.equals(other.getResponseStatus()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            this.affectedRows == other.getAffectedRows();
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
        if (getGetMessage() != null) {
            _hashCode += getGetMessage().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
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
        if (getResponseStatus() != null) {
            _hashCode += getResponseStatus().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        _hashCode += getAffectedRows();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSearchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "TransactionSearchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getError");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "getError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "getMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldError");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "FieldError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "FieldErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "anyType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "ResponseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "ResponseStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", ">TransactionSearchResponse>TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectedRows");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "AffectedRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
