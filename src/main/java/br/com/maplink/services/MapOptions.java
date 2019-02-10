/**
 * MapOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class MapOptions  implements java.io.Serializable {
    private boolean scaleBar;

    private br.com.maplink.services.MapSize mapSize;

    public MapOptions() {
    }

    public MapOptions(
           boolean scaleBar,
           br.com.maplink.services.MapSize mapSize) {
           this.scaleBar = scaleBar;
           this.mapSize = mapSize;
    }


    /**
     * Gets the scaleBar value for this MapOptions.
     * 
     * @return scaleBar
     */
    public boolean isScaleBar() {
        return scaleBar;
    }


    /**
     * Sets the scaleBar value for this MapOptions.
     * 
     * @param scaleBar
     */
    public void setScaleBar(boolean scaleBar) {
        this.scaleBar = scaleBar;
    }


    /**
     * Gets the mapSize value for this MapOptions.
     * 
     * @return mapSize
     */
    public br.com.maplink.services.MapSize getMapSize() {
        return mapSize;
    }


    /**
     * Sets the mapSize value for this MapOptions.
     * 
     * @param mapSize
     */
    public void setMapSize(br.com.maplink.services.MapSize mapSize) {
        this.mapSize = mapSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapOptions)) return false;
        MapOptions other = (MapOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.scaleBar == other.isScaleBar() &&
            ((this.mapSize==null && other.getMapSize()==null) || 
             (this.mapSize!=null &&
              this.mapSize.equals(other.getMapSize())));
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
        _hashCode += (isScaleBar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMapSize() != null) {
            _hashCode += getMapSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MapOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "MapOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scaleBar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "scaleBar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "mapSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "MapSize"));
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
