/**
 * PinPadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.cpsh2h.serviceh2h;

public class PinPadResponse  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String resultCode;

    private java.lang.String PGResponse;

    private java.lang.String description;

    private java.lang.String PINPADhtml;

    private java.lang.String PGTransactionId;

    public PinPadResponse() {
    }

    public PinPadResponse(
           java.lang.String resultCode,
           java.lang.String PGResponse,
           java.lang.String description,
           java.lang.String PINPADhtml,
           java.lang.String PGTransactionId) {
           this.resultCode = resultCode;
           this.PGResponse = PGResponse;
           this.description = description;
           this.PINPADhtml = PINPADhtml;
           this.PGTransactionId = PGTransactionId;
    }


    /**
     * Gets the resultCode value for this PinPadResponse.
     * 
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this PinPadResponse.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the PGResponse value for this PinPadResponse.
     * 
     * @return PGResponse
     */
    public java.lang.String getPGResponse() {
        return PGResponse;
    }


    /**
     * Sets the PGResponse value for this PinPadResponse.
     * 
     * @param PGResponse
     */
    public void setPGResponse(java.lang.String PGResponse) {
        this.PGResponse = PGResponse;
    }


    /**
     * Gets the description value for this PinPadResponse.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PinPadResponse.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the PINPADhtml value for this PinPadResponse.
     * 
     * @return PINPADhtml
     */
    public java.lang.String getPINPADhtml() {
        return PINPADhtml;
    }


    /**
     * Sets the PINPADhtml value for this PinPadResponse.
     * 
     * @param PINPADhtml
     */
    public void setPINPADhtml(java.lang.String PINPADhtml) {
        this.PINPADhtml = PINPADhtml;
    }


    /**
     * Gets the PGTransactionId value for this PinPadResponse.
     * 
     * @return PGTransactionId
     */
    public java.lang.String getPGTransactionId() {
        return PGTransactionId;
    }


    /**
     * Sets the PGTransactionId value for this PinPadResponse.
     * 
     * @param PGTransactionId
     */
    public void setPGTransactionId(java.lang.String PGTransactionId) {
        this.PGTransactionId = PGTransactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PinPadResponse)) return false;
        PinPadResponse other = (PinPadResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.PGResponse==null && other.getPGResponse()==null) || 
             (this.PGResponse!=null &&
              this.PGResponse.equals(other.getPGResponse()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.PINPADhtml==null && other.getPINPADhtml()==null) || 
             (this.PINPADhtml!=null &&
              this.PINPADhtml.equals(other.getPINPADhtml()))) &&
            ((this.PGTransactionId==null && other.getPGTransactionId()==null) || 
             (this.PGTransactionId!=null &&
              this.PGTransactionId.equals(other.getPGTransactionId())));
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getPGResponse() != null) {
            _hashCode += getPGResponse().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPINPADhtml() != null) {
            _hashCode += getPINPADhtml().hashCode();
        }
        if (getPGTransactionId() != null) {
            _hashCode += getPGTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PinPadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "PinPadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "PGResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PINPADhtml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "PINPADhtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PGTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/cpsh2h/serviceh2h", "PGTransactionId"));
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
