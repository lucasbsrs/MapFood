/**
 * GetRouteDescriptionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class GetRouteDescriptionResponse  implements java.io.Serializable {
    private br.com.maplink.services.SegmentDescription[] segmentDescriptions;

    private br.com.maplink.services.OutputInformation[] outputInformations;

    public GetRouteDescriptionResponse() {
    }

    public GetRouteDescriptionResponse(
           br.com.maplink.services.SegmentDescription[] segmentDescriptions,
           br.com.maplink.services.OutputInformation[] outputInformations) {
           this.segmentDescriptions = segmentDescriptions;
           this.outputInformations = outputInformations;
    }


    /**
     * Gets the segmentDescriptions value for this GetRouteDescriptionResponse.
     * 
     * @return segmentDescriptions
     */
    public br.com.maplink.services.SegmentDescription[] getSegmentDescriptions() {
        return segmentDescriptions;
    }


    /**
     * Sets the segmentDescriptions value for this GetRouteDescriptionResponse.
     * 
     * @param segmentDescriptions
     */
    public void setSegmentDescriptions(br.com.maplink.services.SegmentDescription[] segmentDescriptions) {
        this.segmentDescriptions = segmentDescriptions;
    }


    /**
     * Gets the outputInformations value for this GetRouteDescriptionResponse.
     * 
     * @return outputInformations
     */
    public br.com.maplink.services.OutputInformation[] getOutputInformations() {
        return outputInformations;
    }


    /**
     * Sets the outputInformations value for this GetRouteDescriptionResponse.
     * 
     * @param outputInformations
     */
    public void setOutputInformations(br.com.maplink.services.OutputInformation[] outputInformations) {
        this.outputInformations = outputInformations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRouteDescriptionResponse)) return false;
        GetRouteDescriptionResponse other = (GetRouteDescriptionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.segmentDescriptions==null && other.getSegmentDescriptions()==null) || 
             (this.segmentDescriptions!=null &&
              java.util.Arrays.equals(this.segmentDescriptions, other.getSegmentDescriptions()))) &&
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
        if (getSegmentDescriptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegmentDescriptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegmentDescriptions(), i);
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
        new org.apache.axis.description.TypeDesc(GetRouteDescriptionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteDescriptionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentDescriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "segmentDescriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "SegmentDescription"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "SegmentDescription"));
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
