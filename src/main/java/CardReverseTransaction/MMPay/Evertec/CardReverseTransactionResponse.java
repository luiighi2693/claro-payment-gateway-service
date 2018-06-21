/**
 * CardReverseTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CardReverseTransaction.MMPay.Evertec;

public class CardReverseTransactionResponse  implements java.io.Serializable {
    private java.lang.String getError;

    private java.lang.String getMessage;

    private java.lang.String statusCode;

    private boolean fieldError;

    private java.lang.Object[] fieldErrorList;

    private CardReverseTransaction.MMPay.Evertec.ResponseStatusType responseStatus;

    private java.lang.String requestID;

    private java.lang.String transactionID;

    private java.lang.String approvalCode;

    private java.lang.String responseText;

    public CardReverseTransactionResponse() {
    }

    public CardReverseTransactionResponse(
           java.lang.String getError,
           java.lang.String getMessage,
           java.lang.String statusCode,
           boolean fieldError,
           java.lang.Object[] fieldErrorList,
           CardReverseTransaction.MMPay.Evertec.ResponseStatusType responseStatus,
           java.lang.String requestID,
           java.lang.String transactionID,
           java.lang.String approvalCode,
           java.lang.String responseText) {
           this.getError = getError;
           this.getMessage = getMessage;
           this.statusCode = statusCode;
           this.fieldError = fieldError;
           this.fieldErrorList = fieldErrorList;
           this.responseStatus = responseStatus;
           this.requestID = requestID;
           this.transactionID = transactionID;
           this.approvalCode = approvalCode;
           this.responseText = responseText;
    }


    /**
     * Gets the getError value for this CardReverseTransactionResponse.
     * 
     * @return getError
     */
    public java.lang.String getGetError() {
        return getError;
    }


    /**
     * Sets the getError value for this CardReverseTransactionResponse.
     * 
     * @param getError
     */
    public void setGetError(java.lang.String getError) {
        this.getError = getError;
    }


    /**
     * Gets the getMessage value for this CardReverseTransactionResponse.
     * 
     * @return getMessage
     */
    public java.lang.String getGetMessage() {
        return getMessage;
    }


    /**
     * Sets the getMessage value for this CardReverseTransactionResponse.
     * 
     * @param getMessage
     */
    public void setGetMessage(java.lang.String getMessage) {
        this.getMessage = getMessage;
    }


    /**
     * Gets the statusCode value for this CardReverseTransactionResponse.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this CardReverseTransactionResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the fieldError value for this CardReverseTransactionResponse.
     * 
     * @return fieldError
     */
    public boolean isFieldError() {
        return fieldError;
    }


    /**
     * Sets the fieldError value for this CardReverseTransactionResponse.
     * 
     * @param fieldError
     */
    public void setFieldError(boolean fieldError) {
        this.fieldError = fieldError;
    }


    /**
     * Gets the fieldErrorList value for this CardReverseTransactionResponse.
     * 
     * @return fieldErrorList
     */
    public java.lang.Object[] getFieldErrorList() {
        return fieldErrorList;
    }


    /**
     * Sets the fieldErrorList value for this CardReverseTransactionResponse.
     * 
     * @param fieldErrorList
     */
    public void setFieldErrorList(java.lang.Object[] fieldErrorList) {
        this.fieldErrorList = fieldErrorList;
    }


    /**
     * Gets the responseStatus value for this CardReverseTransactionResponse.
     * 
     * @return responseStatus
     */
    public CardReverseTransaction.MMPay.Evertec.ResponseStatusType getResponseStatus() {
        return responseStatus;
    }


    /**
     * Sets the responseStatus value for this CardReverseTransactionResponse.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(CardReverseTransaction.MMPay.Evertec.ResponseStatusType responseStatus) {
        this.responseStatus = responseStatus;
    }


    /**
     * Gets the requestID value for this CardReverseTransactionResponse.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this CardReverseTransactionResponse.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the transactionID value for this CardReverseTransactionResponse.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this CardReverseTransactionResponse.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the approvalCode value for this CardReverseTransactionResponse.
     * 
     * @return approvalCode
     */
    public java.lang.String getApprovalCode() {
        return approvalCode;
    }


    /**
     * Sets the approvalCode value for this CardReverseTransactionResponse.
     * 
     * @param approvalCode
     */
    public void setApprovalCode(java.lang.String approvalCode) {
        this.approvalCode = approvalCode;
    }


    /**
     * Gets the responseText value for this CardReverseTransactionResponse.
     * 
     * @return responseText
     */
    public java.lang.String getResponseText() {
        return responseText;
    }


    /**
     * Sets the responseText value for this CardReverseTransactionResponse.
     * 
     * @param responseText
     */
    public void setResponseText(java.lang.String responseText) {
        this.responseText = responseText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardReverseTransactionResponse)) return false;
        CardReverseTransactionResponse other = (CardReverseTransactionResponse) obj;
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
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.approvalCode==null && other.getApprovalCode()==null) || 
             (this.approvalCode!=null &&
              this.approvalCode.equals(other.getApprovalCode()))) &&
            ((this.responseText==null && other.getResponseText()==null) || 
             (this.responseText!=null &&
              this.responseText.equals(other.getResponseText())));
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getApprovalCode() != null) {
            _hashCode += getApprovalCode().hashCode();
        }
        if (getResponseText() != null) {
            _hashCode += getResponseText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardReverseTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "CardReverseTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getError");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "getError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "getMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldError");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "FieldError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldErrorList");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "FieldErrorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "anyType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "ResponseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "ResponseStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "RequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "ApprovalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseText");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.CardReverseTransaction", "ResponseText"));
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
