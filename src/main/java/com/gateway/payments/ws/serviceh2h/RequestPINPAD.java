/**
 * RequestPINPAD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.gateway.payments.ws.serviceh2h;

public class RequestPINPAD  implements java.io.Serializable {
    private String userName;

    private String passWord;

    private String customerID;

    private String customerName;

    private String customerEmail;

    private String telephone;

    private String fax;

    private String address1;

    private String address2;

    private String state;

    private String city;

    private String zipCode;

    private String descriptionBuy;

    private String operatorId;

    private String channel;

    private String tax1;

    private String tax2;

    private String tax3;

    private String tax4;

    private String merchantTransId;

    private String amount;

    private String expirationDate;

    private String cardNumber;

    private String filler1;

    private String filler2;

    private String filler3;

    private String filler4;

    private String note;

    public RequestPINPAD() {
    }

    public RequestPINPAD(
           String userName,
           String passWord,
           String customerID,
           String customerName,
           String customerEmail,
           String telephone,
           String fax,
           String address1,
           String address2,
           String state,
           String city,
           String zipCode,
           String descriptionBuy,
           String operatorId,
           String channel,
           String tax1,
           String tax2,
           String tax3,
           String tax4,
           String merchantTransId,
           String amount,
           String expirationDate,
           String cardNumber,
           String filler1,
           String filler2,
           String filler3,
           String filler4,
           String note) {
           this.userName = userName;
           this.passWord = passWord;
           this.customerID = customerID;
           this.customerName = customerName;
           this.customerEmail = customerEmail;
           this.telephone = telephone;
           this.fax = fax;
           this.address1 = address1;
           this.address2 = address2;
           this.state = state;
           this.city = city;
           this.zipCode = zipCode;
           this.descriptionBuy = descriptionBuy;
           this.operatorId = operatorId;
           this.channel = channel;
           this.tax1 = tax1;
           this.tax2 = tax2;
           this.tax3 = tax3;
           this.tax4 = tax4;
           this.merchantTransId = merchantTransId;
           this.amount = amount;
           this.expirationDate = expirationDate;
           this.cardNumber = cardNumber;
           this.filler1 = filler1;
           this.filler2 = filler2;
           this.filler3 = filler3;
           this.filler4 = filler4;
           this.note = note;
    }


    /**
     * Gets the userName value for this RequestPINPAD.
     *
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this RequestPINPAD.
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the passWord value for this RequestPINPAD.
     *
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }


    /**
     * Sets the passWord value for this RequestPINPAD.
     *
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    /**
     * Gets the customerID value for this RequestPINPAD.
     *
     * @return customerID
     */
    public String getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this RequestPINPAD.
     *
     * @param customerID
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the customerName value for this RequestPINPAD.
     *
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this RequestPINPAD.
     *
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerEmail value for this RequestPINPAD.
     *
     * @return customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }


    /**
     * Sets the customerEmail value for this RequestPINPAD.
     *
     * @param customerEmail
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


    /**
     * Gets the telephone value for this RequestPINPAD.
     *
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this RequestPINPAD.
     *
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the fax value for this RequestPINPAD.
     *
     * @return fax
     */
    public String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this RequestPINPAD.
     *
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }


    /**
     * Gets the address1 value for this RequestPINPAD.
     *
     * @return address1
     */
    public String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this RequestPINPAD.
     *
     * @param address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this RequestPINPAD.
     *
     * @return address2
     */
    public String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this RequestPINPAD.
     *
     * @param address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the state value for this RequestPINPAD.
     *
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this RequestPINPAD.
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the city value for this RequestPINPAD.
     *
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this RequestPINPAD.
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the zipCode value for this RequestPINPAD.
     *
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this RequestPINPAD.
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the descriptionBuy value for this RequestPINPAD.
     *
     * @return descriptionBuy
     */
    public String getDescriptionBuy() {
        return descriptionBuy;
    }


    /**
     * Sets the descriptionBuy value for this RequestPINPAD.
     *
     * @param descriptionBuy
     */
    public void setDescriptionBuy(String descriptionBuy) {
        this.descriptionBuy = descriptionBuy;
    }


    /**
     * Gets the operatorId value for this RequestPINPAD.
     *
     * @return operatorId
     */
    public String getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this RequestPINPAD.
     *
     * @param operatorId
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the channel value for this RequestPINPAD.
     *
     * @return channel
     */
    public String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this RequestPINPAD.
     *
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }


    /**
     * Gets the tax1 value for this RequestPINPAD.
     *
     * @return tax1
     */
    public String getTax1() {
        return tax1;
    }


    /**
     * Sets the tax1 value for this RequestPINPAD.
     *
     * @param tax1
     */
    public void setTax1(String tax1) {
        this.tax1 = tax1;
    }


    /**
     * Gets the tax2 value for this RequestPINPAD.
     *
     * @return tax2
     */
    public String getTax2() {
        return tax2;
    }


    /**
     * Sets the tax2 value for this RequestPINPAD.
     *
     * @param tax2
     */
    public void setTax2(String tax2) {
        this.tax2 = tax2;
    }


    /**
     * Gets the tax3 value for this RequestPINPAD.
     *
     * @return tax3
     */
    public String getTax3() {
        return tax3;
    }


    /**
     * Sets the tax3 value for this RequestPINPAD.
     *
     * @param tax3
     */
    public void setTax3(String tax3) {
        this.tax3 = tax3;
    }


    /**
     * Gets the tax4 value for this RequestPINPAD.
     *
     * @return tax4
     */
    public String getTax4() {
        return tax4;
    }


    /**
     * Sets the tax4 value for this RequestPINPAD.
     *
     * @param tax4
     */
    public void setTax4(String tax4) {
        this.tax4 = tax4;
    }


    /**
     * Gets the merchantTransId value for this RequestPINPAD.
     *
     * @return merchantTransId
     */
    public String getMerchantTransId() {
        return merchantTransId;
    }


    /**
     * Sets the merchantTransId value for this RequestPINPAD.
     *
     * @param merchantTransId
     */
    public void setMerchantTransId(String merchantTransId) {
        this.merchantTransId = merchantTransId;
    }


    /**
     * Gets the amount value for this RequestPINPAD.
     *
     * @return amount
     */
    public String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RequestPINPAD.
     *
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * Gets the expirationDate value for this RequestPINPAD.
     *
     * @return expirationDate
     */
    public String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this RequestPINPAD.
     *
     * @param expirationDate
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the cardNumber value for this RequestPINPAD.
     *
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this RequestPINPAD.
     *
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the filler1 value for this RequestPINPAD.
     *
     * @return filler1
     */
    public String getFiller1() {
        return filler1;
    }


    /**
     * Sets the filler1 value for this RequestPINPAD.
     *
     * @param filler1
     */
    public void setFiller1(String filler1) {
        this.filler1 = filler1;
    }


    /**
     * Gets the filler2 value for this RequestPINPAD.
     *
     * @return filler2
     */
    public String getFiller2() {
        return filler2;
    }


    /**
     * Sets the filler2 value for this RequestPINPAD.
     *
     * @param filler2
     */
    public void setFiller2(String filler2) {
        this.filler2 = filler2;
    }


    /**
     * Gets the filler3 value for this RequestPINPAD.
     *
     * @return filler3
     */
    public String getFiller3() {
        return filler3;
    }


    /**
     * Sets the filler3 value for this RequestPINPAD.
     *
     * @param filler3
     */
    public void setFiller3(String filler3) {
        this.filler3 = filler3;
    }


    /**
     * Gets the filler4 value for this RequestPINPAD.
     *
     * @return filler4
     */
    public String getFiller4() {
        return filler4;
    }


    /**
     * Sets the filler4 value for this RequestPINPAD.
     *
     * @param filler4
     */
    public void setFiller4(String filler4) {
        this.filler4 = filler4;
    }


    /**
     * Gets the note value for this RequestPINPAD.
     *
     * @return note
     */
    public String getNote() {
        return note;
    }


    /**
     * Sets the note value for this RequestPINPAD.
     *
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RequestPINPAD)) return false;
        RequestPINPAD other = (RequestPINPAD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.userName==null && other.getUserName()==null) ||
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.passWord==null && other.getPassWord()==null) ||
             (this.passWord!=null &&
              this.passWord.equals(other.getPassWord()))) &&
            ((this.customerID==null && other.getCustomerID()==null) ||
             (this.customerID!=null &&
              this.customerID.equals(other.getCustomerID()))) &&
            ((this.customerName==null && other.getCustomerName()==null) ||
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerEmail==null && other.getCustomerEmail()==null) ||
             (this.customerEmail!=null &&
              this.customerEmail.equals(other.getCustomerEmail()))) &&
            ((this.telephone==null && other.getTelephone()==null) ||
             (this.telephone!=null &&
              this.telephone.equals(other.getTelephone()))) &&
            ((this.fax==null && other.getFax()==null) ||
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.address1==null && other.getAddress1()==null) ||
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) ||
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.state==null && other.getState()==null) ||
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.city==null && other.getCity()==null) ||
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.zipCode==null && other.getZipCode()==null) ||
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.descriptionBuy==null && other.getDescriptionBuy()==null) ||
             (this.descriptionBuy!=null &&
              this.descriptionBuy.equals(other.getDescriptionBuy()))) &&
            ((this.operatorId==null && other.getOperatorId()==null) ||
             (this.operatorId!=null &&
              this.operatorId.equals(other.getOperatorId()))) &&
            ((this.channel==null && other.getChannel()==null) ||
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.tax1==null && other.getTax1()==null) ||
             (this.tax1!=null &&
              this.tax1.equals(other.getTax1()))) &&
            ((this.tax2==null && other.getTax2()==null) ||
             (this.tax2!=null &&
              this.tax2.equals(other.getTax2()))) &&
            ((this.tax3==null && other.getTax3()==null) ||
             (this.tax3!=null &&
              this.tax3.equals(other.getTax3()))) &&
            ((this.tax4==null && other.getTax4()==null) ||
             (this.tax4!=null &&
              this.tax4.equals(other.getTax4()))) &&
            ((this.merchantTransId==null && other.getMerchantTransId()==null) ||
             (this.merchantTransId!=null &&
              this.merchantTransId.equals(other.getMerchantTransId()))) &&
            ((this.amount==null && other.getAmount()==null) ||
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) ||
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) ||
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.filler1==null && other.getFiller1()==null) ||
             (this.filler1!=null &&
              this.filler1.equals(other.getFiller1()))) &&
            ((this.filler2==null && other.getFiller2()==null) ||
             (this.filler2!=null &&
              this.filler2.equals(other.getFiller2()))) &&
            ((this.filler3==null && other.getFiller3()==null) ||
             (this.filler3!=null &&
              this.filler3.equals(other.getFiller3()))) &&
            ((this.filler4==null && other.getFiller4()==null) ||
             (this.filler4!=null &&
              this.filler4.equals(other.getFiller4()))) &&
            ((this.note==null && other.getNote()==null) ||
             (this.note!=null &&
              this.note.equals(other.getNote())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPassWord() != null) {
            _hashCode += getPassWord().hashCode();
        }
        if (getCustomerID() != null) {
            _hashCode += getCustomerID().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerEmail() != null) {
            _hashCode += getCustomerEmail().hashCode();
        }
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getDescriptionBuy() != null) {
            _hashCode += getDescriptionBuy().hashCode();
        }
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getTax1() != null) {
            _hashCode += getTax1().hashCode();
        }
        if (getTax2() != null) {
            _hashCode += getTax2().hashCode();
        }
        if (getTax3() != null) {
            _hashCode += getTax3().hashCode();
        }
        if (getTax4() != null) {
            _hashCode += getTax4().hashCode();
        }
        if (getMerchantTransId() != null) {
            _hashCode += getMerchantTransId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getFiller1() != null) {
            _hashCode += getFiller1().hashCode();
        }
        if (getFiller2() != null) {
            _hashCode += getFiller2().hashCode();
        }
        if (getFiller3() != null) {
            _hashCode += getFiller3().hashCode();
        }
        if (getFiller4() != null) {
            _hashCode += getFiller4().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestPINPAD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", ">RequestPINPAD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passWord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "passWord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "customerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "customerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "customerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionBuy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "descriptionBuy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "operatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "tax1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "tax2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "tax3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "tax4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "MerchantTransId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "filler1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "filler2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "filler3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filler4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "filler4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "Note"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
