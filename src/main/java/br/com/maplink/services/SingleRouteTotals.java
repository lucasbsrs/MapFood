/**
 * SingleRouteTotals.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class SingleRouteTotals  implements java.io.Serializable {
    private br.com.maplink.services.RouteStop origin;

    private br.com.maplink.services.RouteStop destin;

    private br.com.maplink.services.RouteTotals routeTotals;

    private java.lang.String logRouteId;

    private br.com.maplink.services.MapInfo mapInfo;

    public SingleRouteTotals() {
    }

    public SingleRouteTotals(
           br.com.maplink.services.RouteStop origin,
           br.com.maplink.services.RouteStop destin,
           br.com.maplink.services.RouteTotals routeTotals,
           java.lang.String logRouteId,
           br.com.maplink.services.MapInfo mapInfo) {
           this.origin = origin;
           this.destin = destin;
           this.routeTotals = routeTotals;
           this.logRouteId = logRouteId;
           this.mapInfo = mapInfo;
    }


    /**
     * Gets the origin value for this SingleRouteTotals.
     * 
     * @return origin
     */
    public br.com.maplink.services.RouteStop getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this SingleRouteTotals.
     * 
     * @param origin
     */
    public void setOrigin(br.com.maplink.services.RouteStop origin) {
        this.origin = origin;
    }


    /**
     * Gets the destin value for this SingleRouteTotals.
     * 
     * @return destin
     */
    public br.com.maplink.services.RouteStop getDestin() {
        return destin;
    }


    /**
     * Sets the destin value for this SingleRouteTotals.
     * 
     * @param destin
     */
    public void setDestin(br.com.maplink.services.RouteStop destin) {
        this.destin = destin;
    }


    /**
     * Gets the routeTotals value for this SingleRouteTotals.
     * 
     * @return routeTotals
     */
    public br.com.maplink.services.RouteTotals getRouteTotals() {
        return routeTotals;
    }


    /**
     * Sets the routeTotals value for this SingleRouteTotals.
     * 
     * @param routeTotals
     */
    public void setRouteTotals(br.com.maplink.services.RouteTotals routeTotals) {
        this.routeTotals = routeTotals;
    }


    /**
     * Gets the logRouteId value for this SingleRouteTotals.
     * 
     * @return logRouteId
     */
    public java.lang.String getLogRouteId() {
        return logRouteId;
    }


    /**
     * Sets the logRouteId value for this SingleRouteTotals.
     * 
     * @param logRouteId
     */
    public void setLogRouteId(java.lang.String logRouteId) {
        this.logRouteId = logRouteId;
    }


    /**
     * Gets the mapInfo value for this SingleRouteTotals.
     * 
     * @return mapInfo
     */
    public br.com.maplink.services.MapInfo getMapInfo() {
        return mapInfo;
    }


    /**
     * Sets the mapInfo value for this SingleRouteTotals.
     * 
     * @param mapInfo
     */
    public void setMapInfo(br.com.maplink.services.MapInfo mapInfo) {
        this.mapInfo = mapInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SingleRouteTotals)) return false;
        SingleRouteTotals other = (SingleRouteTotals) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.destin==null && other.getDestin()==null) || 
             (this.destin!=null &&
              this.destin.equals(other.getDestin()))) &&
            ((this.routeTotals==null && other.getRouteTotals()==null) || 
             (this.routeTotals!=null &&
              this.routeTotals.equals(other.getRouteTotals()))) &&
            ((this.logRouteId==null && other.getLogRouteId()==null) || 
             (this.logRouteId!=null &&
              this.logRouteId.equals(other.getLogRouteId()))) &&
            ((this.mapInfo==null && other.getMapInfo()==null) || 
             (this.mapInfo!=null &&
              this.mapInfo.equals(other.getMapInfo())));
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
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDestin() != null) {
            _hashCode += getDestin().hashCode();
        }
        if (getRouteTotals() != null) {
            _hashCode += getRouteTotals().hashCode();
        }
        if (getLogRouteId() != null) {
            _hashCode += getLogRouteId().hashCode();
        }
        if (getMapInfo() != null) {
            _hashCode += getMapInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SingleRouteTotals.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "SingleRouteTotals"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "destin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotals"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logRouteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "logRouteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "mapInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "MapInfo"));
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
