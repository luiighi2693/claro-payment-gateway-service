/**
 * ResponseStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ReverseTransaction.MMPay.Evertec;

public class ResponseStatusType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ResponseStatusType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __Approved = "_Approved";
    public static final java.lang.String __AuthenticationError = "_AuthenticationError";
    public static final java.lang.String __Completed = "_Completed";
    public static final java.lang.String __Declined = "_Declined";
    public static final java.lang.String __Error = "_Error";
    public static final java.lang.String __Exception = "_Exception";
    public static final java.lang.String __Failed = "_Failed";
    public static final java.lang.String __Pending = "_Pending";
    public static final java.lang.String __Processing = "_Processing";
    public static final java.lang.String __Rejected = "_Rejected";
    public static final java.lang.String __Reversed = "_Reversed";
    public static final java.lang.String __Successfull = "_Successfull";
    public static final java.lang.String __Unassigned = "_Unassigned";
    public static final java.lang.String __Unknown = "_Unknown";
    public static final ResponseStatusType _Approved = new ResponseStatusType(__Approved);
    public static final ResponseStatusType _AuthenticationError = new ResponseStatusType(__AuthenticationError);
    public static final ResponseStatusType _Completed = new ResponseStatusType(__Completed);
    public static final ResponseStatusType _Declined = new ResponseStatusType(__Declined);
    public static final ResponseStatusType _Error = new ResponseStatusType(__Error);
    public static final ResponseStatusType _Exception = new ResponseStatusType(__Exception);
    public static final ResponseStatusType _Failed = new ResponseStatusType(__Failed);
    public static final ResponseStatusType _Pending = new ResponseStatusType(__Pending);
    public static final ResponseStatusType _Processing = new ResponseStatusType(__Processing);
    public static final ResponseStatusType _Rejected = new ResponseStatusType(__Rejected);
    public static final ResponseStatusType _Reversed = new ResponseStatusType(__Reversed);
    public static final ResponseStatusType _Successfull = new ResponseStatusType(__Successfull);
    public static final ResponseStatusType _Unassigned = new ResponseStatusType(__Unassigned);
    public static final ResponseStatusType _Unknown = new ResponseStatusType(__Unknown);
    public java.lang.String getValue() { return _value_;}
    public static ResponseStatusType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ResponseStatusType enumeration = (ResponseStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ResponseStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ResponseStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.MMPay.ReverseTransaction", "ResponseStatusType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
