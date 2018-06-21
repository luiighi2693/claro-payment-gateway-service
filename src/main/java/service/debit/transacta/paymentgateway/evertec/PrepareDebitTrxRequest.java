/**
 * PrepareDebitTrxRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.debit.transacta.paymentgateway.evertec;

public class PrepareDebitTrxRequest  extends classes.service.debit.transacta.paymentgateway.evertec.DebitTrxBase  implements java.io.Serializable {
    private java.lang.String merchantUser;

    private java.lang.String merchantPassword;

    private java.lang.String terminalNumber;

    private java.lang.String merchantNumber;

    private service.debit.transacta.paymentgateway.evertec.TrxType trxType;

    private java.lang.String requestId;

    private java.math.BigDecimal amount;

    private java.math.BigDecimal cashBack;

    private java.math.BigDecimal sureCharge;

    private java.lang.String cardNumber;

    private java.lang.String expirationDate;

    private java.lang.String nameOnCard;

    private java.lang.String invoiceNumber;

    private java.lang.String PNRef;

    private java.lang.String closeURL;

    private java.lang.String timeOutURL;

    private java.lang.String extendedData;

    public PrepareDebitTrxRequest() {
    }

    public PrepareDebitTrxRequest(
           java.lang.String merchantUser,
           java.lang.String merchantPassword,
           java.lang.String terminalNumber,
           java.lang.String merchantNumber,
           service.debit.transacta.paymentgateway.evertec.TrxType trxType,
           java.lang.String requestId,
           java.math.BigDecimal amount,
           java.math.BigDecimal cashBack,
           java.math.BigDecimal sureCharge,
           java.lang.String cardNumber,
           java.lang.String expirationDate,
           java.lang.String nameOnCard,
           java.lang.String invoiceNumber,
           java.lang.String PNRef,
           java.lang.String closeURL,
           java.lang.String timeOutURL,
           java.lang.String extendedData) {
        this.merchantUser = merchantUser;
        this.merchantPassword = merchantPassword;
        this.terminalNumber = terminalNumber;
        this.merchantNumber = merchantNumber;
        this.trxType = trxType;
        this.requestId = requestId;
        this.amount = amount;
        this.cashBack = cashBack;
        this.sureCharge = sureCharge;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.nameOnCard = nameOnCard;
        this.invoiceNumber = invoiceNumber;
        this.PNRef = PNRef;
        this.closeURL = closeURL;
        this.timeOutURL = timeOutURL;
        this.extendedData = extendedData;
    }


    /**
     * Gets the merchantUser value for this PrepareDebitTrxRequest.
     * 
     * @return merchantUser
     */
    public java.lang.String getMerchantUser() {
        return merchantUser;
    }


    /**
     * Sets the merchantUser value for this PrepareDebitTrxRequest.
     * 
     * @param merchantUser
     */
    public void setMerchantUser(java.lang.String merchantUser) {
        this.merchantUser = merchantUser;
    }


    /**
     * Gets the merchantPassword value for this PrepareDebitTrxRequest.
     * 
     * @return merchantPassword
     */
    public java.lang.String getMerchantPassword() {
        return merchantPassword;
    }


    /**
     * Sets the merchantPassword value for this PrepareDebitTrxRequest.
     * 
     * @param merchantPassword
     */
    public void setMerchantPassword(java.lang.String merchantPassword) {
        this.merchantPassword = merchantPassword;
    }


    /**
     * Gets the terminalNumber value for this PrepareDebitTrxRequest.
     * 
     * @return terminalNumber
     */
    public java.lang.String getTerminalNumber() {
        return terminalNumber;
    }


    /**
     * Sets the terminalNumber value for this PrepareDebitTrxRequest.
     * 
     * @param terminalNumber
     */
    public void setTerminalNumber(java.lang.String terminalNumber) {
        this.terminalNumber = terminalNumber;
    }


    /**
     * Gets the merchantNumber value for this PrepareDebitTrxRequest.
     * 
     * @return merchantNumber
     */
    public java.lang.String getMerchantNumber() {
        return merchantNumber;
    }


    /**
     * Sets the merchantNumber value for this PrepareDebitTrxRequest.
     * 
     * @param merchantNumber
     */
    public void setMerchantNumber(java.lang.String merchantNumber) {
        this.merchantNumber = merchantNumber;
    }


    /**
     * Gets the trxType value for this PrepareDebitTrxRequest.
     * 
     * @return trxType
     */
    public service.debit.transacta.paymentgateway.evertec.TrxType getTrxType() {
        return trxType;
    }


    /**
     * Sets the trxType value for this PrepareDebitTrxRequest.
     * 
     * @param trxType
     */
    public void setTrxType(service.debit.transacta.paymentgateway.evertec.TrxType trxType) {
        this.trxType = trxType;
    }


    /**
     * Gets the requestId value for this PrepareDebitTrxRequest.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this PrepareDebitTrxRequest.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the amount value for this PrepareDebitTrxRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PrepareDebitTrxRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cashBack value for this PrepareDebitTrxRequest.
     * 
     * @return cashBack
     */
    public java.math.BigDecimal getCashBack() {
        return cashBack;
    }


    /**
     * Sets the cashBack value for this PrepareDebitTrxRequest.
     * 
     * @param cashBack
     */
    public void setCashBack(java.math.BigDecimal cashBack) {
        this.cashBack = cashBack;
    }


    /**
     * Gets the sureCharge value for this PrepareDebitTrxRequest.
     * 
     * @return sureCharge
     */
    public java.math.BigDecimal getSureCharge() {
        return sureCharge;
    }


    /**
     * Sets the sureCharge value for this PrepareDebitTrxRequest.
     * 
     * @param sureCharge
     */
    public void setSureCharge(java.math.BigDecimal sureCharge) {
        this.sureCharge = sureCharge;
    }


    /**
     * Gets the cardNumber value for this PrepareDebitTrxRequest.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this PrepareDebitTrxRequest.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the expirationDate value for this PrepareDebitTrxRequest.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this PrepareDebitTrxRequest.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the nameOnCard value for this PrepareDebitTrxRequest.
     * 
     * @return nameOnCard
     */
    public java.lang.String getNameOnCard() {
        return nameOnCard;
    }


    /**
     * Sets the nameOnCard value for this PrepareDebitTrxRequest.
     * 
     * @param nameOnCard
     */
    public void setNameOnCard(java.lang.String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }


    /**
     * Gets the invoiceNumber value for this PrepareDebitTrxRequest.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this PrepareDebitTrxRequest.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the PNRef value for this PrepareDebitTrxRequest.
     * 
     * @return PNRef
     */
    public java.lang.String getPNRef() {
        return PNRef;
    }


    /**
     * Sets the PNRef value for this PrepareDebitTrxRequest.
     * 
     * @param PNRef
     */
    public void setPNRef(java.lang.String PNRef) {
        this.PNRef = PNRef;
    }


    /**
     * Gets the closeURL value for this PrepareDebitTrxRequest.
     * 
     * @return closeURL
     */
    public java.lang.String getCloseURL() {
        return closeURL;
    }


    /**
     * Sets the closeURL value for this PrepareDebitTrxRequest.
     * 
     * @param closeURL
     */
    public void setCloseURL(java.lang.String closeURL) {
        this.closeURL = closeURL;
    }


    /**
     * Gets the timeOutURL value for this PrepareDebitTrxRequest.
     * 
     * @return timeOutURL
     */
    public java.lang.String getTimeOutURL() {
        return timeOutURL;
    }


    /**
     * Sets the timeOutURL value for this PrepareDebitTrxRequest.
     * 
     * @param timeOutURL
     */
    public void setTimeOutURL(java.lang.String timeOutURL) {
        this.timeOutURL = timeOutURL;
    }


    /**
     * Gets the extendedData value for this PrepareDebitTrxRequest.
     * 
     * @return extendedData
     */
    public java.lang.String getExtendedData() {
        return extendedData;
    }


    /**
     * Sets the extendedData value for this PrepareDebitTrxRequest.
     * 
     * @param extendedData
     */
    public void setExtendedData(java.lang.String extendedData) {
        this.extendedData = extendedData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepareDebitTrxRequest)) return false;
        PrepareDebitTrxRequest other = (PrepareDebitTrxRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.merchantUser==null && other.getMerchantUser()==null) || 
             (this.merchantUser!=null &&
              this.merchantUser.equals(other.getMerchantUser()))) &&
            ((this.merchantPassword==null && other.getMerchantPassword()==null) || 
             (this.merchantPassword!=null &&
              this.merchantPassword.equals(other.getMerchantPassword()))) &&
            ((this.terminalNumber==null && other.getTerminalNumber()==null) || 
             (this.terminalNumber!=null &&
              this.terminalNumber.equals(other.getTerminalNumber()))) &&
            ((this.merchantNumber==null && other.getMerchantNumber()==null) || 
             (this.merchantNumber!=null &&
              this.merchantNumber.equals(other.getMerchantNumber()))) &&
            ((this.trxType==null && other.getTrxType()==null) || 
             (this.trxType!=null &&
              this.trxType.equals(other.getTrxType()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.cashBack==null && other.getCashBack()==null) || 
             (this.cashBack!=null &&
              this.cashBack.equals(other.getCashBack()))) &&
            ((this.sureCharge==null && other.getSureCharge()==null) || 
             (this.sureCharge!=null &&
              this.sureCharge.equals(other.getSureCharge()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.nameOnCard==null && other.getNameOnCard()==null) || 
             (this.nameOnCard!=null &&
              this.nameOnCard.equals(other.getNameOnCard()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.PNRef==null && other.getPNRef()==null) || 
             (this.PNRef!=null &&
              this.PNRef.equals(other.getPNRef()))) &&
            ((this.closeURL==null && other.getCloseURL()==null) || 
             (this.closeURL!=null &&
              this.closeURL.equals(other.getCloseURL()))) &&
            ((this.timeOutURL==null && other.getTimeOutURL()==null) || 
             (this.timeOutURL!=null &&
              this.timeOutURL.equals(other.getTimeOutURL()))) &&
            ((this.extendedData==null && other.getExtendedData()==null) || 
             (this.extendedData!=null &&
              this.extendedData.equals(other.getExtendedData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMerchantUser() != null) {
            _hashCode += getMerchantUser().hashCode();
        }
        if (getMerchantPassword() != null) {
            _hashCode += getMerchantPassword().hashCode();
        }
        if (getTerminalNumber() != null) {
            _hashCode += getTerminalNumber().hashCode();
        }
        if (getMerchantNumber() != null) {
            _hashCode += getMerchantNumber().hashCode();
        }
        if (getTrxType() != null) {
            _hashCode += getTrxType().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCashBack() != null) {
            _hashCode += getCashBack().hashCode();
        }
        if (getSureCharge() != null) {
            _hashCode += getSureCharge().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getNameOnCard() != null) {
            _hashCode += getNameOnCard().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getPNRef() != null) {
            _hashCode += getPNRef().hashCode();
        }
        if (getCloseURL() != null) {
            _hashCode += getCloseURL().hashCode();
        }
        if (getTimeOutURL() != null) {
            _hashCode += getTimeOutURL().hashCode();
        }
        if (getExtendedData() != null) {
            _hashCode += getExtendedData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrepareDebitTrxRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PrepareDebitTrxRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantUser");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "MerchantUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "MerchantPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TerminalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "MerchantNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trxType");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TrxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TrxType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashBack");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "CashBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sureCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "SureCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "CardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameOnCard");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "NameOnCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "InvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PNRef");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "PNRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeURL");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "CloseURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOutURL");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TimeOutURL"));
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
