/**
 * RouteDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class RouteDetails  implements java.io.Serializable {
    private int descriptionType;

    private boolean optimizeRoute;

    private java.lang.String[] pois;

    private java.lang.String[] barriers;

    private br.com.maplink.services.Point[] barrierPoints;

    private boolean toll;

    public RouteDetails() {
    }

    public RouteDetails(
           int descriptionType,
           boolean optimizeRoute,
           java.lang.String[] pois,
           java.lang.String[] barriers,
           br.com.maplink.services.Point[] barrierPoints,
           boolean toll) {
           this.descriptionType = descriptionType;
           this.optimizeRoute = optimizeRoute;
           this.pois = pois;
           this.barriers = barriers;
           this.barrierPoints = barrierPoints;
           this.toll = toll;
    }


    /**
     * Gets the descriptionType value for this RouteDetails.
     * 
     * @return descriptionType
     */
    public int getDescriptionType() {
        return descriptionType;
    }


    /**
     * Sets the descriptionType value for this RouteDetails.
     * 
     * @param descriptionType
     */
    public void setDescriptionType(int descriptionType) {
        this.descriptionType = descriptionType;
    }


    /**
     * Gets the optimizeRoute value for this RouteDetails.
     * 
     * @return optimizeRoute
     */
    public boolean isOptimizeRoute() {
        return optimizeRoute;
    }


    /**
     * Sets the optimizeRoute value for this RouteDetails.
     * 
     * @param optimizeRoute
     */
    public void setOptimizeRoute(boolean optimizeRoute) {
        this.optimizeRoute = optimizeRoute;
    }


    /**
     * Gets the pois value for this RouteDetails.
     * 
     * @return pois
     */
    public java.lang.String[] getPois() {
        return pois;
    }


    /**
     * Sets the pois value for this RouteDetails.
     * 
     * @param pois
     */
    public void setPois(java.lang.String[] pois) {
        this.pois = pois;
    }


    /**
     * Gets the barriers value for this RouteDetails.
     * 
     * @return barriers
     */
    public java.lang.String[] getBarriers() {
        return barriers;
    }


    /**
     * Sets the barriers value for this RouteDetails.
     * 
     * @param barriers
     */
    public void setBarriers(java.lang.String[] barriers) {
        this.barriers = barriers;
    }


    /**
     * Gets the barrierPoints value for this RouteDetails.
     * 
     * @return barrierPoints
     */
    public br.com.maplink.services.Point[] getBarrierPoints() {
        return barrierPoints;
    }


    /**
     * Sets the barrierPoints value for this RouteDetails.
     * 
     * @param barrierPoints
     */
    public void setBarrierPoints(br.com.maplink.services.Point[] barrierPoints) {
        this.barrierPoints = barrierPoints;
    }


    /**
     * Gets the toll value for this RouteDetails.
     * 
     * @return toll
     */
    public boolean isToll() {
        return toll;
    }


    /**
     * Sets the toll value for this RouteDetails.
     * 
     * @param toll
     */
    public void setToll(boolean toll) {
        this.toll = toll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteDetails)) return false;
        RouteDetails other = (RouteDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.descriptionType == other.getDescriptionType() &&
            this.optimizeRoute == other.isOptimizeRoute() &&
            ((this.pois==null && other.getPois()==null) || 
             (this.pois!=null &&
              java.util.Arrays.equals(this.pois, other.getPois()))) &&
            ((this.barriers==null && other.getBarriers()==null) || 
             (this.barriers!=null &&
              java.util.Arrays.equals(this.barriers, other.getBarriers()))) &&
            ((this.barrierPoints==null && other.getBarrierPoints()==null) || 
             (this.barrierPoints!=null &&
              java.util.Arrays.equals(this.barrierPoints, other.getBarrierPoints()))) &&
            this.toll == other.isToll();
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
        _hashCode += getDescriptionType();
        _hashCode += (isOptimizeRoute() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPois() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPois());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPois(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarriers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBarriers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBarriers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarrierPoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBarrierPoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBarrierPoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isToll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "descriptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optimizeRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "optimizeRoute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pois");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "pois"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "poi"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barriers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "barriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "barrier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barrierPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "barrierPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "Point"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "Point"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toll");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "toll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
