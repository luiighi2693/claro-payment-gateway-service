/**
 * TrxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.debit.transacta.paymentgateway.evertec;

public class TrxType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrxType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Sale = "Sale";
    public static final java.lang.String _Refund = "Refund";
    public static final java.lang.String _Unassigned = "Unassigned";
    public static final java.lang.String _Unknown = "Unknown";
    public static final TrxType Sale = new TrxType(_Sale);
    public static final TrxType Refund = new TrxType(_Refund);
    public static final TrxType Unassigned = new TrxType(_Unassigned);
    public static final TrxType Unknown = new TrxType(_Unknown);
    public java.lang.String getValue() { return _value_;}
    public static TrxType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TrxType enumeration = (TrxType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TrxType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrxType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TrxType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
