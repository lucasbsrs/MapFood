/**
 * RouteTotalsBatchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class RouteTotalsBatchRequest  implements java.io.Serializable {
    private br.com.maplink.services.RouteStop origin;

    private br.com.maplink.services.RouteStop destination;

    private br.com.maplink.services.RouteOptions options;

    public RouteTotalsBatchRequest() {
    }

    public RouteTotalsBatchRequest(
           br.com.maplink.services.RouteStop origin,
           br.com.maplink.services.RouteStop destination,
           br.com.maplink.services.RouteOptions options) {
           this.origin = origin;
           this.destination = destination;
           this.options = options;
    }


    /**
     * Gets the origin value for this RouteTotalsBatchRequest.
     * 
     * @return origin
     */
    public br.com.maplink.services.RouteStop getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this RouteTotalsBatchRequest.
     * 
     * @param origin
     */
    public void setOrigin(br.com.maplink.services.RouteStop origin) {
        this.origin = origin;
    }


    /**
     * Gets the destination value for this RouteTotalsBatchRequest.
     * 
     * @return destination
     */
    public br.com.maplink.services.RouteStop getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this RouteTotalsBatchRequest.
     * 
     * @param destination
     */
    public void setDestination(br.com.maplink.services.RouteStop destination) {
        this.destination = destination;
    }


    /**
     * Gets the options value for this RouteTotalsBatchRequest.
     * 
     * @return options
     */
    public br.com.maplink.services.RouteOptions getOptions() {
        return options;
    }


    /**
     * Sets the options value for this RouteTotalsBatchRequest.
     * 
     * @param options
     */
    public void setOptions(br.com.maplink.services.RouteOptions options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteTotalsBatchRequest)) return false;
        RouteTotalsBatchRequest other = (RouteTotalsBatchRequest) obj;
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
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions())));
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
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteTotalsBatchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotalsBatchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions"));
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
