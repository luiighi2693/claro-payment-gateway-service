/**
 * ReverseTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ReverseTransaction.MMPay.Evertec;

public class ReverseTransactionResponse  implements java.io.Serializable {
    private java.lang.String getError;

    private java.lang.String getMessage;

    private java.lang.String statusCode;

    private boolean fieldError;

    private java.lang.Object[] fieldErrorList;

    private ReverseTransaction.MMPay.Evertec.ResponseStatusType responseStatus;

    private java.lang.String requestID;

    private java.math.BigDecimal amount;

    private java.lang.String fullName;

    public ReverseTransactionResponse() {
    }

    public ReverseTransactionResponse(
           java.lang.String getError,
           java.lang.String getMessage,
           java.lang.String statusCode,
           boolean fieldError,
           java.lang.Object[] fieldErrorList,
           ReverseTransaction.MMPay.Evertec.ResponseStatusType responseStatus,
           java.lang.String requestID,
           java.math.BigDecimal amount,
           java.lang.String fullName) {
           this.getError = getError;
           this.getMessage = getMessage;
           this.statusCode = statusCode;
           this.fieldError = fieldError;
           this.fieldErrorList = fieldErrorList;
           this.responseStatus = responseStatus;
           this.requestID = requestID;
           this.amount = amount;
           this.fullName = fullName;
    }


    /**
     * Gets the getError value for this ReverseTransactionResponse.
     * 
     * @return getError
     */
    public java.lang.String getGetError() {
        return getError;
    }


    /**
     * Sets the getError value for this ReverseTransactionResponse.
     * 
     * @param getError
     */
    public void setGetError(java.lang.String getError) {
        this.getError = getError;
    }


    /**
     * Gets the getMessage value for this ReverseTransactionResponse.
     * 
     * @return getMessage
     */
    public java.lang.String getGetMessage() {
        return getMessage;
    }


    /**
     * Sets the getMessage value for this ReverseTransactionResponse.
     * 
     * @param getMessage
     */
    public void setGetMessage(java.lang.String getMessage) {
        this.getMessage = getMessage;
    }


    /**
     * Gets the statusCode value for this ReverseTransactionResponse.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ReverseTransactionResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the fieldError value for this ReverseTransactionResponse.
     * 
     * @return fieldError
     */
    public boolean isFieldError() {
        return fieldError;
    }


    /**
     * Sets the fieldError value for this ReverseTransactionResponse.
     * 
     * @param fieldError
     */
    public void setFieldError(boolean fieldError) {
        this.fieldError = fieldError;
    }


    /**
     * Gets the fieldErrorList value for this ReverseTransactionResponse.
     * 
     * @return fieldErrorList
     */
    public java.lang.Object[] getFieldErrorList() {
        return fieldErrorList;
    }


    /**
     * Sets the fieldErrorList value for this ReverseTransactionResponse.
     * 
     * @param fieldErrorList
     */
    public void setFieldErrorList(java.lang.Object[] fieldErrorList) {
        this.fieldErrorList = fieldErrorList;
    }


    /**
     * Gets the responseStatus value for this ReverseTransactionResponse.
     * 
     * @return responseStatus
     */
    public ReverseTransaction.MMPay.Evertec.ResponseStatusType getResponseStatus() {
        return responseStatus;
    }


    /**
     * Sets the responseStatus value for this ReverseTransactionResponse.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(ReverseTransaction.MMPay.Evertec.ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }


    /**
     * Gets the requestID value for this ReverseTransactionResponse.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this ReverseTransactionResponse.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the amount value for this ReverseTransactionResponse.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ReverseTransactionResponse.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the fullName value for this ReverseTransactionResponse.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this ReverseTransactionResponse.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReverseTransactionResponse)) return false;
        ReverseTransactionResponse other = (ReverseTransactionResponse) obj;
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
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName())));
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
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReverseTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "ReverseTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getError");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "getError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "getMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldError");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "FieldError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "FieldErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "anyType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "ResponseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "ResponseStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "RequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "FullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
