/**
 * GetMultiRouteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class GetMultiRouteResponse  implements java.io.Serializable {
    private br.com.maplink.services.MultiRoute multiRoute;

    private br.com.maplink.services.OutputInformation[] outputInformations;

    public GetMultiRouteResponse() {
    }

    public GetMultiRouteResponse(
           br.com.maplink.services.MultiRoute multiRoute,
           br.com.maplink.services.OutputInformation[] outputInformations) {
           this.multiRoute = multiRoute;
           this.outputInformations = outputInformations;
    }


    /**
     * Gets the multiRoute value for this GetMultiRouteResponse.
     * 
     * @return multiRoute
     */
    public br.com.maplink.services.MultiRoute getMultiRoute() {
        return multiRoute;
    }


    /**
     * Sets the multiRoute value for this GetMultiRouteResponse.
     * 
     * @param multiRoute
     */
    public void setMultiRoute(br.com.maplink.services.MultiRoute multiRoute) {
        this.multiRoute = multiRoute;
    }


    /**
     * Gets the outputInformations value for this GetMultiRouteResponse.
     * 
     * @return outputInformations
     */
    public br.com.maplink.services.OutputInformation[] getOutputInformations() {
        return outputInformations;
    }


    /**
     * Sets the outputInformations value for this GetMultiRouteResponse.
     * 
     * @param outputInformations
     */
    public void setOutputInformations(br.com.maplink.services.OutputInformation[] outputInformations) {
        this.outputInformations = outputInformations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMultiRouteResponse)) return false;
        GetMultiRouteResponse other = (GetMultiRouteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.multiRoute==null && other.getMultiRoute()==null) || 
             (this.multiRoute!=null &&
              this.multiRoute.equals(other.getMultiRoute()))) &&
            ((this.outputInformations==null && other.getOutputInformations()==null) || 
             (this.outputInformations!=null &&
              java.util.Arrays.equals(this.outputInformations, other.getOutputInformations())));
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
        if (getMultiRoute() != null) {
            _hashCode += getMultiRoute().hashCode();
        }
        if (getOutputInformations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputInformations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputInformations(), i);
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
        new org.apache.axis.description.TypeDesc(GetMultiRouteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetMultiRouteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "multiRoute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "MultiRoute"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputInformations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "outputInformations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "OutputInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "OutputInformation"));
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
