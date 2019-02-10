/**
 * Controls.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class Controls  implements java.io.Serializable {
    private java.lang.String mode;

    private java.lang.String[] costAdjustments;

    private java.lang.String traffic;

    private java.lang.String map;

    private java.lang.String extensionMap;

    private java.lang.String routeControl;

    public Controls() {
    }

    public Controls(
           java.lang.String mode,
           java.lang.String[] costAdjustments,
           java.lang.String traffic,
           java.lang.String map,
           java.lang.String extensionMap,
           java.lang.String routeControl) {
           this.mode = mode;
           this.costAdjustments = costAdjustments;
           this.traffic = traffic;
           this.map = map;
           this.extensionMap = extensionMap;
           this.routeControl = routeControl;
    }


    /**
     * Gets the mode value for this Controls.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this Controls.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }


    /**
     * Gets the costAdjustments value for this Controls.
     * 
     * @return costAdjustments
     */
    public java.lang.String[] getCostAdjustments() {
        return costAdjustments;
    }


    /**
     * Sets the costAdjustments value for this Controls.
     * 
     * @param costAdjustments
     */
    public void setCostAdjustments(java.lang.String[] costAdjustments) {
        this.costAdjustments = costAdjustments;
    }


    /**
     * Gets the traffic value for this Controls.
     * 
     * @return traffic
     */
    public java.lang.String getTraffic() {
        return traffic;
    }


    /**
     * Sets the traffic value for this Controls.
     * 
     * @param traffic
     */
    public void setTraffic(java.lang.String traffic) {
        this.traffic = traffic;
    }


    /**
     * Gets the map value for this Controls.
     * 
     * @return map
     */
    public java.lang.String getMap() {
        return map;
    }


    /**
     * Sets the map value for this Controls.
     * 
     * @param map
     */
    public void setMap(java.lang.String map) {
        this.map = map;
    }


    /**
     * Gets the extensionMap value for this Controls.
     * 
     * @return extensionMap
     */
    public java.lang.String getExtensionMap() {
        return extensionMap;
    }


    /**
     * Sets the extensionMap value for this Controls.
     * 
     * @param extensionMap
     */
    public void setExtensionMap(java.lang.String extensionMap) {
        this.extensionMap = extensionMap;
    }


    /**
     * Gets the routeControl value for this Controls.
     * 
     * @return routeControl
     */
    public java.lang.String getRouteControl() {
        return routeControl;
    }


    /**
     * Sets the routeControl value for this Controls.
     * 
     * @param routeControl
     */
    public void setRouteControl(java.lang.String routeControl) {
        this.routeControl = routeControl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Controls)) return false;
        Controls other = (Controls) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.costAdjustments==null && other.getCostAdjustments()==null) || 
             (this.costAdjustments!=null &&
              java.util.Arrays.equals(this.costAdjustments, other.getCostAdjustments()))) &&
            ((this.traffic==null && other.getTraffic()==null) || 
             (this.traffic!=null &&
              this.traffic.equals(other.getTraffic()))) &&
            ((this.map==null && other.getMap()==null) || 
             (this.map!=null &&
              this.map.equals(other.getMap()))) &&
            ((this.extensionMap==null && other.getExtensionMap()==null) || 
             (this.extensionMap!=null &&
              this.extensionMap.equals(other.getExtensionMap()))) &&
            ((this.routeControl==null && other.getRouteControl()==null) || 
             (this.routeControl!=null &&
              this.routeControl.equals(other.getRouteControl())));
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
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getCostAdjustments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostAdjustments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostAdjustments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTraffic() != null) {
            _hashCode += getTraffic().hashCode();
        }
        if (getMap() != null) {
            _hashCode += getMap().hashCode();
        }
        if (getExtensionMap() != null) {
            _hashCode += getExtensionMap().hashCode();
        }
        if (getRouteControl() != null) {
            _hashCode += getRouteControl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Controls.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "Controls"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costAdjustments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "costAdjustments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "costAdjustment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traffic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "traffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "map"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "extensionMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeControl"));
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
