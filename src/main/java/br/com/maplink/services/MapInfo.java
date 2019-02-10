/**
 * MapInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class MapInfo  implements java.io.Serializable {
    private byte[] imageBinaries;

    private br.com.maplink.services.Extent extent;

    private java.lang.String url;

    public MapInfo() {
    }

    public MapInfo(
           byte[] imageBinaries,
           br.com.maplink.services.Extent extent,
           java.lang.String url) {
           this.imageBinaries = imageBinaries;
           this.extent = extent;
           this.url = url;
    }


    /**
     * Gets the imageBinaries value for this MapInfo.
     * 
     * @return imageBinaries
     */
    public byte[] getImageBinaries() {
        return imageBinaries;
    }


    /**
     * Sets the imageBinaries value for this MapInfo.
     * 
     * @param imageBinaries
     */
    public void setImageBinaries(byte[] imageBinaries) {
        this.imageBinaries = imageBinaries;
    }


    /**
     * Gets the extent value for this MapInfo.
     * 
     * @return extent
     */
    public br.com.maplink.services.Extent getExtent() {
        return extent;
    }


    /**
     * Sets the extent value for this MapInfo.
     * 
     * @param extent
     */
    public void setExtent(br.com.maplink.services.Extent extent) {
        this.extent = extent;
    }


    /**
     * Gets the url value for this MapInfo.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this MapInfo.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MapInfo)) return false;
        MapInfo other = (MapInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.imageBinaries==null && other.getImageBinaries()==null) || 
             (this.imageBinaries!=null &&
              java.util.Arrays.equals(this.imageBinaries, other.getImageBinaries()))) &&
            ((this.extent==null && other.getExtent()==null) || 
             (this.extent!=null &&
              this.extent.equals(other.getExtent()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getImageBinaries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageBinaries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageBinaries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtent() != null) {
            _hashCode += getExtent().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MapInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "MapInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageBinaries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "imageBinaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "extent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "Extent"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "url"));
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
