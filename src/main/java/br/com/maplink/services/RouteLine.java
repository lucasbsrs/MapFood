/**
 * RouteLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class RouteLine  implements java.io.Serializable {
    private int width;

    private java.lang.String RGB;

    private double transparency;

    public RouteLine() {
    }

    public RouteLine(
           int width,
           java.lang.String RGB,
           double transparency) {
           this.width = width;
           this.RGB = RGB;
           this.transparency = transparency;
    }


    /**
     * Gets the width value for this RouteLine.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this RouteLine.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Gets the RGB value for this RouteLine.
     * 
     * @return RGB
     */
    public java.lang.String getRGB() {
        return RGB;
    }


    /**
     * Sets the RGB value for this RouteLine.
     * 
     * @param RGB
     */
    public void setRGB(java.lang.String RGB) {
        this.RGB = RGB;
    }


    /**
     * Gets the transparency value for this RouteLine.
     * 
     * @return transparency
     */
    public double getTransparency() {
        return transparency;
    }


    /**
     * Sets the transparency value for this RouteLine.
     * 
     * @param transparency
     */
    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteLine)) return false;
        RouteLine other = (RouteLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.width == other.getWidth() &&
            ((this.RGB==null && other.getRGB()==null) || 
             (this.RGB!=null &&
              this.RGB.equals(other.getRGB()))) &&
            this.transparency == other.getTransparency();
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
        _hashCode += getWidth();
        if (getRGB() != null) {
            _hashCode += getRGB().hashCode();
        }
        _hashCode += new Double(getTransparency()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RGB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RGB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "transparency"));
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
