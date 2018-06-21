/**
 * PaymentMethodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package TransactionSearch.MMPay.Evertec;

public class PaymentMethodType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentMethodType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __X = "_X";
    public static final java.lang.String __A = "_A";
    public static final java.lang.String __C = "_C";
    public static final java.lang.String __M = "_M";
    public static final java.lang.String __W = "_W";
    public static final java.lang.String __S = "_S";
    public static final java.lang.String __T = "_T";
    public static final java.lang.String __U = "_U";
    public static final java.lang.String __V = "_V";
    public static final java.lang.String __Unassigned = "_Unassigned";
    public static final java.lang.String __Unknown = "_Unknown";
    public static final PaymentMethodType _X = new PaymentMethodType(__X);
    public static final PaymentMethodType _A = new PaymentMethodType(__A);
    public static final PaymentMethodType _C = new PaymentMethodType(__C);
    public static final PaymentMethodType _M = new PaymentMethodType(__M);
    public static final PaymentMethodType _W = new PaymentMethodType(__W);
    public static final PaymentMethodType _S = new PaymentMethodType(__S);
    public static final PaymentMethodType _T = new PaymentMethodType(__T);
    public static final PaymentMethodType _U = new PaymentMethodType(__U);
    public static final PaymentMethodType _V = new PaymentMethodType(__V);
    public static final PaymentMethodType _Unassigned = new PaymentMethodType(__Unassigned);
    public static final PaymentMethodType _Unknown = new PaymentMethodType(__Unknown);
    public java.lang.String getValue() { return _value_;}
    public static PaymentMethodType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PaymentMethodType enumeration = (PaymentMethodType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentMethodType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentMethodType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.TransactionSearch", "PaymentMethodType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
