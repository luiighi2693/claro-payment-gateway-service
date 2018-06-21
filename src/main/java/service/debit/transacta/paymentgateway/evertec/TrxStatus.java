/**
 * TrxStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.debit.transacta.paymentgateway.evertec;

public class TrxStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrxStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AllowableNumberOfPinTriesExceeded = "AllowableNumberOfPinTriesExceeded";
    public static final java.lang.String _AllowablePinTriesExceeded = "AllowablePinTriesExceeded";
    public static final java.lang.String _Approved = "Approved";
    public static final java.lang.String _AuthenticationError = "AuthenticationError";
    public static final java.lang.String _Completed = "Completed";
    public static final java.lang.String _Declined = "Declined";
    public static final java.lang.String _Error = "Error";
    public static final java.lang.String _Exception = "Exception";
    public static final java.lang.String _Failed = "Failed";
    public static final java.lang.String _Initiated = "Initiated";
    public static final java.lang.String _Pending = "Pending";
    public static final java.lang.String _Processing = "Processing";
    public static final java.lang.String _Rejected = "Rejected";
    public static final java.lang.String _Successfull = "Successfull";
    public static final java.lang.String _IncorrectPIN = "IncorrectPIN";
    public static final java.lang.String _DuplicateTransaction = "DuplicateTransaction";
    public static final java.lang.String _Unassigned = "Unassigned";
    public static final java.lang.String _Unknown = "Unknown";
    public static final TrxStatus AllowableNumberOfPinTriesExceeded = new TrxStatus(_AllowableNumberOfPinTriesExceeded);
    public static final TrxStatus AllowablePinTriesExceeded = new TrxStatus(_AllowablePinTriesExceeded);
    public static final TrxStatus Approved = new TrxStatus(_Approved);
    public static final TrxStatus AuthenticationError = new TrxStatus(_AuthenticationError);
    public static final TrxStatus Completed = new TrxStatus(_Completed);
    public static final TrxStatus Declined = new TrxStatus(_Declined);
    public static final TrxStatus Error = new TrxStatus(_Error);
    public static final TrxStatus Exception = new TrxStatus(_Exception);
    public static final TrxStatus Failed = new TrxStatus(_Failed);
    public static final TrxStatus Initiated = new TrxStatus(_Initiated);
    public static final TrxStatus Pending = new TrxStatus(_Pending);
    public static final TrxStatus Processing = new TrxStatus(_Processing);
    public static final TrxStatus Rejected = new TrxStatus(_Rejected);
    public static final TrxStatus Successfull = new TrxStatus(_Successfull);
    public static final TrxStatus IncorrectPIN = new TrxStatus(_IncorrectPIN);
    public static final TrxStatus DuplicateTransaction = new TrxStatus(_DuplicateTransaction);
    public static final TrxStatus Unassigned = new TrxStatus(_Unassigned);
    public static final TrxStatus Unknown = new TrxStatus(_Unknown);
    public java.lang.String getValue() { return _value_;}
    public static TrxStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TrxStatus enumeration = (TrxStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TrxStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TrxStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("Evertec.PaymentGateway.Transacta.Debit.Service", "TrxStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
