/**
 * RouteOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class RouteOptions  implements java.io.Serializable {
    private java.lang.String language;

    private br.com.maplink.services.RouteDetails routeDetails;

    private br.com.maplink.services.Vehicle vehicle;

    private br.com.maplink.services.RouteLine[] routeLine;

    private long excludedZoneGroupId;

    private br.com.maplink.services.Controls controls;

    private br.com.maplink.services.RouteSchedule routeSchedule;

    public RouteOptions() {
    }

    public RouteOptions(
           java.lang.String language,
           br.com.maplink.services.RouteDetails routeDetails,
           br.com.maplink.services.Vehicle vehicle,
           br.com.maplink.services.RouteLine[] routeLine,
           long excludedZoneGroupId,
           br.com.maplink.services.Controls controls,
           br.com.maplink.services.RouteSchedule routeSchedule) {
           this.language = language;
           this.routeDetails = routeDetails;
           this.vehicle = vehicle;
           this.routeLine = routeLine;
           this.excludedZoneGroupId = excludedZoneGroupId;
           this.controls = controls;
           this.routeSchedule = routeSchedule;
    }


    /**
     * Gets the language value for this RouteOptions.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this RouteOptions.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the routeDetails value for this RouteOptions.
     * 
     * @return routeDetails
     */
    public br.com.maplink.services.RouteDetails getRouteDetails() {
        return routeDetails;
    }


    /**
     * Sets the routeDetails value for this RouteOptions.
     * 
     * @param routeDetails
     */
    public void setRouteDetails(br.com.maplink.services.RouteDetails routeDetails) {
        this.routeDetails = routeDetails;
    }


    /**
     * Gets the vehicle value for this RouteOptions.
     * 
     * @return vehicle
     */
    public br.com.maplink.services.Vehicle getVehicle() {
        return vehicle;
    }


    /**
     * Sets the vehicle value for this RouteOptions.
     * 
     * @param vehicle
     */
    public void setVehicle(br.com.maplink.services.Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    /**
     * Gets the routeLine value for this RouteOptions.
     * 
     * @return routeLine
     */
    public br.com.maplink.services.RouteLine[] getRouteLine() {
        return routeLine;
    }


    /**
     * Sets the routeLine value for this RouteOptions.
     * 
     * @param routeLine
     */
    public void setRouteLine(br.com.maplink.services.RouteLine[] routeLine) {
        this.routeLine = routeLine;
    }


    /**
     * Gets the excludedZoneGroupId value for this RouteOptions.
     * 
     * @return excludedZoneGroupId
     */
    public long getExcludedZoneGroupId() {
        return excludedZoneGroupId;
    }


    /**
     * Sets the excludedZoneGroupId value for this RouteOptions.
     * 
     * @param excludedZoneGroupId
     */
    public void setExcludedZoneGroupId(long excludedZoneGroupId) {
        this.excludedZoneGroupId = excludedZoneGroupId;
    }


    /**
     * Gets the controls value for this RouteOptions.
     * 
     * @return controls
     */
    public br.com.maplink.services.Controls getControls() {
        return controls;
    }


    /**
     * Sets the controls value for this RouteOptions.
     * 
     * @param controls
     */
    public void setControls(br.com.maplink.services.Controls controls) {
        this.controls = controls;
    }


    /**
     * Gets the routeSchedule value for this RouteOptions.
     * 
     * @return routeSchedule
     */
    public br.com.maplink.services.RouteSchedule getRouteSchedule() {
        return routeSchedule;
    }


    /**
     * Sets the routeSchedule value for this RouteOptions.
     * 
     * @param routeSchedule
     */
    public void setRouteSchedule(br.com.maplink.services.RouteSchedule routeSchedule) {
        this.routeSchedule = routeSchedule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteOptions)) return false;
        RouteOptions other = (RouteOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.routeDetails==null && other.getRouteDetails()==null) || 
             (this.routeDetails!=null &&
              this.routeDetails.equals(other.getRouteDetails()))) &&
            ((this.vehicle==null && other.getVehicle()==null) || 
             (this.vehicle!=null &&
              this.vehicle.equals(other.getVehicle()))) &&
            ((this.routeLine==null && other.getRouteLine()==null) || 
             (this.routeLine!=null &&
              java.util.Arrays.equals(this.routeLine, other.getRouteLine()))) &&
            this.excludedZoneGroupId == other.getExcludedZoneGroupId() &&
            ((this.controls==null && other.getControls()==null) || 
             (this.controls!=null &&
              this.controls.equals(other.getControls()))) &&
            ((this.routeSchedule==null && other.getRouteSchedule()==null) || 
             (this.routeSchedule!=null &&
              this.routeSchedule.equals(other.getRouteSchedule())));
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
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getRouteDetails() != null) {
            _hashCode += getRouteDetails().hashCode();
        }
        if (getVehicle() != null) {
            _hashCode += getVehicle().hashCode();
        }
        if (getRouteLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRouteLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRouteLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getExcludedZoneGroupId()).hashCode();
        if (getControls() != null) {
            _hashCode += getControls().hashCode();
        }
        if (getRouteSchedule() != null) {
            _hashCode += getRouteSchedule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "vehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "Vehicle"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteLine"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedZoneGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "excludedZoneGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "controls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "Controls"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteSchedule"));
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
