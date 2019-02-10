/**
 * GetRouteSummaryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class GetRouteSummaryResponse  implements java.io.Serializable {
    private br.com.maplink.services.RouteSummary[] routeSummaries;

    private br.com.maplink.services.OutputInformation[] outputInformations;

    public GetRouteSummaryResponse() {
    }

    public GetRouteSummaryResponse(
           br.com.maplink.services.RouteSummary[] routeSummaries,
           br.com.maplink.services.OutputInformation[] outputInformations) {
           this.routeSummaries = routeSummaries;
           this.outputInformations = outputInformations;
    }


    /**
     * Gets the routeSummaries value for this GetRouteSummaryResponse.
     * 
     * @return routeSummaries
     */
    public br.com.maplink.services.RouteSummary[] getRouteSummaries() {
        return routeSummaries;
    }


    /**
     * Sets the routeSummaries value for this GetRouteSummaryResponse.
     * 
     * @param routeSummaries
     */
    public void setRouteSummaries(br.com.maplink.services.RouteSummary[] routeSummaries) {
        this.routeSummaries = routeSummaries;
    }


    /**
     * Gets the outputInformations value for this GetRouteSummaryResponse.
     * 
     * @return outputInformations
     */
    public br.com.maplink.services.OutputInformation[] getOutputInformations() {
        return outputInformations;
    }


    /**
     * Sets the outputInformations value for this GetRouteSummaryResponse.
     * 
     * @param outputInformations
     */
    public void setOutputInformations(br.com.maplink.services.OutputInformation[] outputInformations) {
        this.outputInformations = outputInformations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRouteSummaryResponse)) return false;
        GetRouteSummaryResponse other = (GetRouteSummaryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.routeSummaries==null && other.getRouteSummaries()==null) || 
             (this.routeSummaries!=null &&
              java.util.Arrays.equals(this.routeSummaries, other.getRouteSummaries()))) &&
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
        if (getRouteSummaries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRouteSummaries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRouteSummaries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(GetRouteSummaryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteSummaryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeSummaries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeSummaries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteSummary"));
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
