/**
 * OutputInformationCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class OutputInformationCategory implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OutputInformationCategory(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Undefined = "Undefined";
    public static final java.lang.String _TollFee = "TollFee";
    public static final java.lang.String _PointOfInterest = "PointOfInterest";
    public static final java.lang.String _ExcludedZone = "ExcludedZone";
    public static final java.lang.String _RouteSchedule = "RouteSchedule";
    public static final java.lang.String _NonAuthorizedRouteBecauseTraffic = "NonAuthorizedRouteBecauseTraffic";
    public static final OutputInformationCategory Undefined = new OutputInformationCategory(_Undefined);
    public static final OutputInformationCategory TollFee = new OutputInformationCategory(_TollFee);
    public static final OutputInformationCategory PointOfInterest = new OutputInformationCategory(_PointOfInterest);
    public static final OutputInformationCategory ExcludedZone = new OutputInformationCategory(_ExcludedZone);
    public static final OutputInformationCategory RouteSchedule = new OutputInformationCategory(_RouteSchedule);
    public static final OutputInformationCategory NonAuthorizedRouteBecauseTraffic = new OutputInformationCategory(_NonAuthorizedRouteBecauseTraffic);
    public java.lang.String getValue() { return _value_;}
    public static OutputInformationCategory fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OutputInformationCategory enumeration = (OutputInformationCategory)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OutputInformationCategory fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OutputInformationCategory.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "OutputInformationCategory"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
