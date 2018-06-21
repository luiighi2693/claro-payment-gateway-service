/**
 * ResultDebitTrxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.debit.transacta.paymentgateway.evertec;

public class ResultDebitTrxResponse  implements java.io.Serializable {
    private java.lang.String getError;

    private service.debit.transacta.paymentgateway.evertec.TrxStatus trxStatus;

    private java.util.Calendar trxDate;

    private java.lang.String statusCode;

    private java.lang.String decodedCardNumber;

    private java.lang.String authorizationCode;

    private java.lang.String confirmationNumber;

    private int PNRef;

    private java.lang.String hostCode;

    private java.lang.String resultMsg;

    private java.lang.String resultText;

    private java.lang.String extendedData;

    private java.lang.String XMLResponse;

    public ResultDebitTrxResponse() {
    }

    public ResultDebitTrxResponse(
           java.lang.String getError,
           service.debit.transacta.paymentgateway.evertec.TrxStatus trxStatus,
           java.util.Calendar trxDate,
           java.lang.String statusCode,
           java.lang.String decodedCardNumber,
           java.lang.String authorizationCode,
           java.lang.String confirmationNumber,
           int PNRef,
           java.lang.String hostCode,
           java.lang.String resultMsg,
           java.lang.String resultText,
           java.lang.String extendedData,
           java.lang.String XMLResponse) {
           this.getError = getError;
           this.trxStatus = trxStatus;
           this.trxDate = trxDate;
           this.statusCode = statusCode;
           this.decodedCardNumber = decodedCardNumber;
           this.authorizationCode = authorizationCode;
           this.confirmationNumber = confirmationNumber;
           this.PNRef = PNRef;
           this.hostCode = hostCode;
           this.resultMsg = resultMsg;
           this.resultText = resultText;
           this.extendedData = extendedData;
           this.XMLResponse = XMLResponse;
    }


    /**
     * Gets the getError value for this ResultDebitTrxResponse.
     * 
     * @return getError
     */
    public java.lang.String getGetError() {
        return getError;
    }


    /**
     * Sets the getError value for this ResultDebitTrxResponse.
     * 
     * @param getError
     */
    public void setGetError(java.lang.String getError) {
        this.getError = getError;
    }


    /**
     * Gets the trxStatus value for this ResultDebitTrxResponse.
     * 
     * @return trxStatus
     */
    public service.debit.transacta.paymentgateway.evertec.TrxStatus getTrxStatus() {
        return trxStatus;
    }


    /**
     * Sets the trxStatus value for this ResultDebitTrxResponse.
     * 
     * @param trxStatus
     */
    public void setTrxStatus(service.debit.transacta.paymentgateway.evertec.TrxStatus trxStatus) {
        this.trxStatus = trxStatus;
    }


    /**
     * Gets the trxDate value for this ResultDebitTrxResponse.
     * 
     * @return trxDate
     */
    public java.util.Calendar getTrxDate() {
        return trxDate;
    }


    /**
     * Sets the trxDate value for this ResultDebitTrxResponse.
     * 
     * @param trxDate
     */
    public void setTrxDate(java.util.Calendar trxDate) {
        this.trxDate = trxDate;
    }


    /**
     * Gets the statusCode value for this ResultDebitTrxResponse.
     * 
     * @return statusCode
     */
    public java.lang.String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this ResultDebitTrxResponse.
     * 
     * @param statusCode
     */
    public void setStatusCode(java.lang.String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the decodedCardNumber value for this ResultDebitTrxResponse.
     * 
     * @return decodedCardNumber
     */
    public java.lang.String getDecodedCardNumber() {
        return decodedCardNumber;
    }


    /**
     * Sets the decodedCardNumber value for this ResultDebitTrxResponse.
     * 
     * @param decodedCardNumber
     */
    public void setDecodedCardNumber(java.lang.String decodedCardNumber) {
        this.decodedCardNumber = decodedCardNumber;
    }


    /**
     * Gets the authorizationCode value for this ResultDebitTrxResponse.
     * 
     * @return authorizationCode
     */
    public java.lang.String getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this ResultDebitTrxResponse.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(java.lang.String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the confirmationNumber value for this ResultDebitTrxResponse.
     * 
     * @return confirmationNumber
     */
    public java.lang.String getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this ResultDebitTrxResponse.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(java.lang.String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the PNRef value for this ResultDebitTrxResponse.
     * 
     * @return PNRef
     */
    public int getPNRef() {
        return PNRef;
    }


    /**
     * Sets the PNRef value for this ResultDebitTrxResponse.
     * 
     * @param PNRef
     */
    public void setPNRef(int PNRef) {
        this.PNRef = PNRef;
    }


    /**
     * Gets the hostCode value for this ResultDebitTrxResponse.
     * 
     * @return hostCode
     */
    public java.lang.String getHostCode() {
        return hostCode;
    }


    /**
     * Sets the hostCode value for this ResultDebitTrxResponse.
     * 
     * @param hostCode
     */
    public void setHostCode(java.lang.String hostCode) {
        this.hostCode = hostCode;
    }


    /**
     * Gets the resultMsg value for this ResultDebitTrxResponse.
     * 
     * @return resultMsg
     */
    public java.lang.String getResultMsg() {
        return resultMsg;
    }


    /**
     * Sets the resultMsg value for this ResultDebitTrxResponse.
     * 
     * @param resultMsg
     */
    public void setResultMsg(java.lang.String resultMsg) {
        this.resultMsg = resultMsg;
    }


    /**
     * Gets the resultText value for this ResultDebitTrxResponse.
     * 
     * @return resultText
     */
    public java.lang.String getResultText() {
        return resultText;
    }


    /**
     * Sets the resultText value for this ResultDebitTrxResponse.
     * 
     * @param resultText
     */
    public void setResultText(java.lang.String resultText) {
        this.resultText = resultText;
    }


    /**
     * Gets the extendedData value for this ResultDebitTrxResponse.
     * 
     * @return extendedData
     */
    public java.lang.String getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this ResultDebitTrxResponse.
     * 
     * @param extendedData
     */
    public void setExtendedData(java.lang.String extendedData) {
        this.extendedData = extendedData;
    }


    /**
     * Gets the XMLResponse value for this ResultDebitTrxResponse.
     * 
     * @return XMLResponse
     */
    public java.lang.String getXMLResponse() {
        return XMLResponse;
    }


    /**
     * Sets the XMLResponse value for this ResultDebitTrxResponse.
     * 
     * @param XMLResponse
     */
    public void setXMLResponse(java.lang.String XMLResponse) {
        this.XMLResponse = XMLResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultDebitTrxResponse)) return false;
        ResultDebitTrxResponse other = (ResultDebitTrxResponse) obj;
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
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.decodedCardNumber==null && other.getDecodedCardNumber()==null) || 
             (this.decodedCardNumber!=null &&
              this.decodedCardNumber.equals(other.getDecodedCardNumber()))) &&
            ((this.authorizationCode==null && other.getAuthorizationCode()==null) || 
             (this.authorizationCode!=null &&
              this.authorizationCode.equals(other.getAuthorizationCode()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber()))) &&
            this.PNRef == other.getPNRef() &&
            ((this.hostCode==null && other.getHostCode()==null) || 
             (this.hostCode!=null &&
              this.hostCode.equals(other.getHostCode()))) &&
            ((this.resultMsg==null && other.getResultMsg()==null) || 
             (this.resultMsg!=null &&
              this.resultMsg.equals(other.getResultMsg()))) &&
            ((this.resultText==null && other.getResultText()==null) || 
             (this.resultText!=null &&
              this.resultText.equals(other.getResultText()))) &&
            ((this.extendedData==null && other.getExtendedData()==null) || 
             (this.extendedData!=null &&
              this.extendedData.equals(other.getExtendedData()))) &&
            ((this.XMLResponse==null && other.getXMLResponse()==null) || 
             (this.XMLResponse!=null &&
              this.XMLResponse.equals(other.getXMLResponse())));
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
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getDecodedCardNumber() != null) {
            _hashCode += getDecodedCardNumber().hashCode();
        }
        if (getAuthorizationCode() != null) {
            _hashCode += getAuthorizationCode().hashCode();
        }
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        _hashCode += getPNRef();
        if (getHostCode() != null) {
            _hashCode += getHostCode().hashCode();
        }
        if (getResultMsg() != null) {
            _hashCode += getResultMsg().hashCode();
        }
        if (getResultText() != null) {
            _hashCode += getResultText().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        if (getXMLResponse() != null) {
            _hashCode += getXMLResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultDebitTrxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ResultDebitTrxResponse"));
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
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "StatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decodedCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "DecodedCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "AuthorizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ConfirmationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PNRef");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PNRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostCode");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "HostCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ResultMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultText");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ResultText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedData");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ExtendedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMLResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "XMLResponse"));
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
