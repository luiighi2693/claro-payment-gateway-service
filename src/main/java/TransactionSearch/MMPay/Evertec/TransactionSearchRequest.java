/**
 * TransactionSearchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package TransactionSearch.MMPay.Evertec;

public class TransactionSearchRequest  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String accountID;

    private java.lang.String minProcessDate;

    private java.lang.String maxProcessDate;

    private java.lang.String totalPrice;

    private java.lang.String taxAmount1;

    private java.lang.String authorizationNum;

    private java.lang.String confirmationNum;

    private TransactionSearch.MMPay.Evertec.PaymentMethodType paymentMethod;

    private java.lang.String requestID;

    private java.lang.String merchantIdTransaction;

    public TransactionSearchRequest() {
    }

    public TransactionSearchRequest(
           java.lang.String username,
           java.lang.String password,
           java.lang.String accountID,
           java.lang.String minProcessDate,
           java.lang.String maxProcessDate,
           java.lang.String totalPrice,
           java.lang.String taxAmount1,
           java.lang.String authorizationNum,
           java.lang.String confirmationNum,
           TransactionSearch.MMPay.Evertec.PaymentMethodType paymentMethod,
           java.lang.String requestID,
           java.lang.String merchantIdTransaction) {
           this.username = username;
           this.password = password;
           this.accountID = accountID;
           this.minProcessDate = minProcessDate;
           this.maxProcessDate = maxProcessDate;
           this.totalPrice = totalPrice;
           this.taxAmount1 = taxAmount1;
           this.authorizationNum = authorizationNum;
           this.confirmationNum = confirmationNum;
           this.paymentMethod = paymentMethod;
           this.requestID = requestID;
           this.merchantIdTransaction = merchantIdTransaction;
    }


    /**
     * Gets the username value for this TransactionSearchRequest.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this TransactionSearchRequest.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this TransactionSearchRequest.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this TransactionSearchRequest.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the accountID value for this TransactionSearchRequest.
     * 
     * @return accountID
     */
    public java.lang.String getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this TransactionSearchRequest.
     * 
     * @param accountID
     */
    public void setAccountID(java.lang.String accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the minProcessDate value for this TransactionSearchRequest.
     * 
     * @return minProcessDate
     */
    public java.lang.String getMinProcessDate() {
        return minProcessDate;
    }


    /**
     * Sets the minProcessDate value for this TransactionSearchRequest.
     * 
     * @param minProcessDate
     */
    public void setMinProcessDate(java.lang.String minProcessDate) {
        this.minProcessDate = minProcessDate;
    }


    /**
     * Gets the maxProcessDate value for this TransactionSearchRequest.
     * 
     * @return maxProcessDate
     */
    public java.lang.String getMaxProcessDate() {
        return maxProcessDate;
    }


    /**
     * Sets the maxProcessDate value for this TransactionSearchRequest.
     * 
     * @param maxProcessDate
     */
    public void setMaxProcessDate(java.lang.String maxProcessDate) {
        this.maxProcessDate = maxProcessDate;
    }


    /**
     * Gets the totalPrice value for this TransactionSearchRequest.
     * 
     * @return totalPrice
     */
    public java.lang.String getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this TransactionSearchRequest.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.lang.String totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the taxAmount1 value for this TransactionSearchRequest.
     * 
     * @return taxAmount1
     */
    public java.lang.String getTaxAmount1() {
        return taxAmount1;
    }


    /**
     * Sets the taxAmount1 value for this TransactionSearchRequest.
     * 
     * @param taxAmount1
     */
    public void setTaxAmount1(java.lang.String taxAmount1) {
        this.taxAmount1 = taxAmount1;
    }


    /**
     * Gets the authorizationNum value for this TransactionSearchRequest.
     * 
     * @return authorizationNum
     */
    public java.lang.String getAuthorizationNum() {
        return authorizationNum;
    }


    /**
     * Sets the authorizationNum value for this TransactionSearchRequest.
     * 
     * @param authorizationNum
     */
    public void setAuthorizationNum(java.lang.String authorizationNum) {
        this.authorizationNum = authorizationNum;
    }


    /**
     * Gets the confirmationNum value for this TransactionSearchRequest.
     * 
     * @return confirmationNum
     */
    public java.lang.String getConfirmationNum() {
        return confirmationNum;
    }


    /**
     * Sets the confirmationNum value for this TransactionSearchRequest.
     * 
     * @param confirmationNum
     */
    public void setConfirmationNum(java.lang.String confirmationNum) {
        this.confirmationNum = confirmationNum;
    }


    /**
     * Gets the paymentMethod value for this TransactionSearchRequest.
     * 
     * @return paymentMethod
     */
    public TransactionSearch.MMPay.Evertec.PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this TransactionSearchRequest.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(TransactionSearch.MMPay.Evertec.PaymentMethodType paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the requestID value for this TransactionSearchRequest.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this TransactionSearchRequest.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the merchantIdTransaction value for this TransactionSearchRequest.
     * 
     * @return merchantIdTransaction
     */
    public java.lang.String getMerchantIdTransaction() {
        return merchantIdTransaction;
    }


    /**
     * Sets the merchantIdTransaction value for this TransactionSearchRequest.
     * 
     * @param merchantIdTransaction
     */
    public void setMerchantIdTransaction(java.lang.String merchantIdTransaction) {
        this.merchantIdTransaction = merchantIdTransaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchRequest)) return false;
        TransactionSearchRequest other = (TransactionSearchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.minProcessDate==null && other.getMinProcessDate()==null) || 
             (this.minProcessDate!=null &&
              this.minProcessDate.equals(other.getMinProcessDate()))) &&
            ((this.maxProcessDate==null && other.getMaxProcessDate()==null) || 
             (this.maxProcessDate!=null &&
              this.maxProcessDate.equals(other.getMaxProcessDate()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            ((this.taxAmount1==null && other.getTaxAmount1()==null) || 
             (this.taxAmount1!=null &&
              this.taxAmount1.equals(other.getTaxAmount1()))) &&
            ((this.authorizationNum==null && other.getAuthorizationNum()==null) || 
             (this.authorizationNum!=null &&
              this.authorizationNum.equals(other.getAuthorizationNum()))) &&
            ((this.confirmationNum==null && other.getConfirmationNum()==null) || 
             (this.confirmationNum!=null &&
              this.confirmationNum.equals(other.getConfirmationNum()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.merchantIdTransaction==null && other.getMerchantIdTransaction()==null) || 
             (this.merchantIdTransaction!=null &&
              this.merchantIdTransaction.equals(other.getMerchantIdTransaction())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getMinProcessDate() != null) {
            _hashCode += getMinProcessDate().hashCode();
        }
        if (getMaxProcessDate() != null) {
            _hashCode += getMaxProcessDate().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        if (getTaxAmount1() != null) {
            _hashCode += getTaxAmount1().hashCode();
        }
        if (getAuthorizationNum() != null) {
            _hashCode += getAuthorizationNum().hashCode();
        }
        if (getConfirmationNum() != null) {
            _hashCode += getConfirmationNum().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getMerchantIdTransaction() != null) {
            _hashCode += getMerchantIdTransaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSearchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "TransactionSearchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minProcessDate");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "MinProcessDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxProcessDate");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "MaxProcessDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "TotalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount1");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "TaxAmount1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationNum");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "AuthorizationNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNum");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "ConfirmationNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "PaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "PaymentMethodType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "RequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantIdTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "MerchantIdTransaction"));
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
