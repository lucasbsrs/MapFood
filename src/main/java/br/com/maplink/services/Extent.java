/**
 * Extent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class Extent  implements java.io.Serializable {
    private double XMin;

    private double YMin;

    private double XMax;

    private double YMax;

    public Extent() {
    }

    public Extent(
           double XMin,
           double YMin,
           double XMax,
           double YMax) {
           this.XMin = XMin;
           this.YMin = YMin;
           this.XMax = XMax;
           this.YMax = YMax;
    }


    /**
     * Gets the XMin value for this Extent.
     * 
     * @return XMin
     */
    public double getXMin() {
        return XMin;
    }


    /**
     * Sets the XMin value for this Extent.
     * 
     * @param XMin
     */
    public void setXMin(double XMin) {
        this.XMin = XMin;
    }


    /**
     * Gets the YMin value for this Extent.
     * 
     * @return YMin
     */
    public double getYMin() {
        return YMin;
    }


    /**
     * Sets the YMin value for this Extent.
     * 
     * @param YMin
     */
    public void setYMin(double YMin) {
        this.YMin = YMin;
    }


    /**
     * Gets the XMax value for this Extent.
     * 
     * @return XMax
     */
    public double getXMax() {
        return XMax;
    }


    /**
     * Sets the XMax value for this Extent.
     * 
     * @param XMax
     */
    public void setXMax(double XMax) {
        this.XMax = XMax;
    }


    /**
     * Gets the YMax value for this Extent.
     * 
     * @return YMax
     */
    public double getYMax() {
        return YMax;
    }


    /**
     * Sets the YMax value for this Extent.
     * 
     * @param YMax
     */
    public void setYMax(double YMax) {
        this.YMax = YMax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Extent)) return false;
        Extent other = (Extent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.XMin == other.getXMin() &&
            this.YMin == other.getYMin() &&
            this.XMax == other.getXMax() &&
            this.YMax == other.getYMax();
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
        _hashCode += new Double(getXMin()).hashCode();
        _hashCode += new Double(getYMin()).hashCode();
        _hashCode += new Double(getXMax()).hashCode();
        _hashCode += new Double(getYMax()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Extent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "Extent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "XMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YMin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "YMin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "XMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YMax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "YMax"));
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
