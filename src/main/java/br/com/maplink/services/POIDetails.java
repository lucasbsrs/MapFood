/**
 * POIDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class POIDetails  implements java.io.Serializable {
    private java.lang.String clientId;

    private java.lang.String name;

    private java.lang.String addressInfo;

    private java.lang.String source;

    private java.lang.String poiType;

    private br.com.maplink.services.Point point;

    public POIDetails() {
    }

    public POIDetails(
           java.lang.String clientId,
           java.lang.String name,
           java.lang.String addressInfo,
           java.lang.String source,
           java.lang.String poiType,
           br.com.maplink.services.Point point) {
           this.clientId = clientId;
           this.name = name;
           this.addressInfo = addressInfo;
           this.source = source;
           this.poiType = poiType;
           this.point = point;
    }


    /**
     * Gets the clientId value for this POIDetails.
     * 
     * @return clientId
     */
    public java.lang.String getClientId() {
        return clientId;
    }


    /**
     * Sets the clientId value for this POIDetails.
     * 
     * @param clientId
     */
    public void setClientId(java.lang.String clientId) {
        this.clientId = clientId;
    }


    /**
     * Gets the name value for this POIDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this POIDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the addressInfo value for this POIDetails.
     * 
     * @return addressInfo
     */
    public java.lang.String getAddressInfo() {
        return addressInfo;
    }


    /**
     * Sets the addressInfo value for this POIDetails.
     * 
     * @param addressInfo
     */
    public void setAddressInfo(java.lang.String addressInfo) {
        this.addressInfo = addressInfo;
    }


    /**
     * Gets the source value for this POIDetails.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this POIDetails.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the poiType value for this POIDetails.
     * 
     * @return poiType
     */
    public java.lang.String getPoiType() {
        return poiType;
    }


    /**
     * Sets the poiType value for this POIDetails.
     * 
     * @param poiType
     */
    public void setPoiType(java.lang.String poiType) {
        this.poiType = poiType;
    }


    /**
     * Gets the point value for this POIDetails.
     * 
     * @return point
     */
    public br.com.maplink.services.Point getPoint() {
        return point;
    }


    /**
     * Sets the point value for this POIDetails.
     * 
     * @param point
     */
    public void setPoint(br.com.maplink.services.Point point) {
        this.point = point;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof POIDetails)) return false;
        POIDetails other = (POIDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientId==null && other.getClientId()==null) || 
             (this.clientId!=null &&
              this.clientId.equals(other.getClientId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.addressInfo==null && other.getAddressInfo()==null) || 
             (this.addressInfo!=null &&
              this.addressInfo.equals(other.getAddressInfo()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.poiType==null && other.getPoiType()==null) || 
             (this.poiType!=null &&
              this.poiType.equals(other.getPoiType()))) &&
            ((this.point==null && other.getPoint()==null) || 
             (this.point!=null &&
              this.point.equals(other.getPoint())));
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
        if (getClientId() != null) {
            _hashCode += getClientId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAddressInfo() != null) {
            _hashCode += getAddressInfo().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getPoiType() != null) {
            _hashCode += getPoiType().hashCode();
        }
        if (getPoint() != null) {
            _hashCode += getPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(POIDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "POIDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "clientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "addressInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poiType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "poiType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "Point"));
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
