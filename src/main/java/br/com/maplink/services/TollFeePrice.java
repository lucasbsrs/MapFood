/**
 * TollFeePrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class TollFeePrice  implements java.io.Serializable {
    private int tollFeeCategoryId;

    private double price;

    public TollFeePrice() {
    }

    public TollFeePrice(
           int tollFeeCategoryId,
           double price) {
           this.tollFeeCategoryId = tollFeeCategoryId;
           this.price = price;
    }


    /**
     * Gets the tollFeeCategoryId value for this TollFeePrice.
     * 
     * @return tollFeeCategoryId
     */
    public int getTollFeeCategoryId() {
        return tollFeeCategoryId;
    }


    /**
     * Sets the tollFeeCategoryId value for this TollFeePrice.
     * 
     * @param tollFeeCategoryId
     */
    public void setTollFeeCategoryId(int tollFeeCategoryId) {
        this.tollFeeCategoryId = tollFeeCategoryId;
    }


    /**
     * Gets the price value for this TollFeePrice.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this TollFeePrice.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TollFeePrice)) return false;
        TollFeePrice other = (TollFeePrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.tollFeeCategoryId == other.getTollFeeCategoryId() &&
            this.price == other.getPrice();
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
        _hashCode += getTollFeeCategoryId();
        _hashCode += new Double(getPrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TollFeePrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "TollFeePrice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollFeeCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "tollFeeCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
