/**
 * SubmitATH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.cpsh2h.serviceh2h;

public class SubmitATH  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String userName;

    private java.lang.String passWord;

    private java.lang.String requestid;

    public SubmitATH() {
    }

    public SubmitATH(
           java.lang.String userName,
           java.lang.String passWord,
           java.lang.String requestid) {
           this.userName = userName;
           this.passWord = passWord;
           this.requestid = requestid;
    }


    /**
     * Gets the userName value for this SubmitATH.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this SubmitATH.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the passWord value for this SubmitATH.
     * 
     * @return passWord
     */
    public java.lang.String getPassWord() {
        return passWord;
    }


    /**
     * Sets the passWord value for this SubmitATH.
     * 
     * @param passWord
     */
    public void setPassWord(java.lang.String passWord) {
        this.passWord = passWord;
    }


    /**
     * Gets the requestid value for this SubmitATH.
     * 
     * @return requestid
     */
    public java.lang.String getRequestid() {
        return requestid;
    }


    /**
     * Sets the requestid value for this SubmitATH.
     * 
     * @param requestid
     */
    public void setRequestid(java.lang.String requestid) {
        this.requestid = requestid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubmitATH)) return false;
        SubmitATH other = (SubmitATH) obj;
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
            ((this.requestid==null && other.getRequestid()==null) || 
             (this.requestid!=null &&
              this.requestid.equals(other.getRequestid())));
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
        if (getRequestid() != null) {
            _hashCode += getRequestid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmitATH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", ">SubmitATH"));
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
        elemField.setFieldName("requestid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "Requestid"));
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
