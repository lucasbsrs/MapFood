/**
 * AlternativeRouteInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class AlternativeRouteInfo  implements java.io.Serializable {
    private br.com.maplink.services.RouteInfo mainRoute;

    private br.com.maplink.services.RouteInfo[] alternatives;

    public AlternativeRouteInfo() {
    }

    public AlternativeRouteInfo(
           br.com.maplink.services.RouteInfo mainRoute,
           br.com.maplink.services.RouteInfo[] alternatives) {
           this.mainRoute = mainRoute;
           this.alternatives = alternatives;
    }


    /**
     * Gets the mainRoute value for this AlternativeRouteInfo.
     * 
     * @return mainRoute
     */
    public br.com.maplink.services.RouteInfo getMainRoute() {
        return mainRoute;
    }


    /**
     * Sets the mainRoute value for this AlternativeRouteInfo.
     * 
     * @param mainRoute
     */
    public void setMainRoute(br.com.maplink.services.RouteInfo mainRoute) {
        this.mainRoute = mainRoute;
    }


    /**
     * Gets the alternatives value for this AlternativeRouteInfo.
     * 
     * @return alternatives
     */
    public br.com.maplink.services.RouteInfo[] getAlternatives() {
        return alternatives;
    }


    /**
     * Sets the alternatives value for this AlternativeRouteInfo.
     * 
     * @param alternatives
     */
    public void setAlternatives(br.com.maplink.services.RouteInfo[] alternatives) {
        this.alternatives = alternatives;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlternativeRouteInfo)) return false;
        AlternativeRouteInfo other = (AlternativeRouteInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mainRoute==null && other.getMainRoute()==null) || 
             (this.mainRoute!=null &&
              this.mainRoute.equals(other.getMainRoute()))) &&
            ((this.alternatives==null && other.getAlternatives()==null) || 
             (this.alternatives!=null &&
              java.util.Arrays.equals(this.alternatives, other.getAlternatives())));
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
        if (getMainRoute() != null) {
            _hashCode += getMainRoute().hashCode();
        }
        if (getAlternatives() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternatives());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternatives(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlternativeRouteInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "AlternativeRouteInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "mainRoute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternatives");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "alternatives"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteInfo"));
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
