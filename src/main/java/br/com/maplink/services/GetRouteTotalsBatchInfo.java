/**
 * GetRouteTotalsBatchInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class GetRouteTotalsBatchInfo  implements java.io.Serializable {
    private br.com.maplink.services.RouteTotalsBatchRequest requestData;

    private br.com.maplink.services.RouteTotals routeTotals;

    private br.com.maplink.services.OutputInformation[] outputInformations;

    public GetRouteTotalsBatchInfo() {
    }

    public GetRouteTotalsBatchInfo(
           br.com.maplink.services.RouteTotalsBatchRequest requestData,
           br.com.maplink.services.RouteTotals routeTotals,
           br.com.maplink.services.OutputInformation[] outputInformations) {
           this.requestData = requestData;
           this.routeTotals = routeTotals;
           this.outputInformations = outputInformations;
    }


    /**
     * Gets the requestData value for this GetRouteTotalsBatchInfo.
     * 
     * @return requestData
     */
    public br.com.maplink.services.RouteTotalsBatchRequest getRequestData() {
        return requestData;
    }


    /**
     * Sets the requestData value for this GetRouteTotalsBatchInfo.
     * 
     * @param requestData
     */
    public void setRequestData(br.com.maplink.services.RouteTotalsBatchRequest requestData) {
        this.requestData = requestData;
    }


    /**
     * Gets the routeTotals value for this GetRouteTotalsBatchInfo.
     * 
     * @return routeTotals
     */
    public br.com.maplink.services.RouteTotals getRouteTotals() {
        return routeTotals;
    }


    /**
     * Sets the routeTotals value for this GetRouteTotalsBatchInfo.
     * 
     * @param routeTotals
     */
    public void setRouteTotals(br.com.maplink.services.RouteTotals routeTotals) {
        this.routeTotals = routeTotals;
    }


    /**
     * Gets the outputInformations value for this GetRouteTotalsBatchInfo.
     * 
     * @return outputInformations
     */
    public br.com.maplink.services.OutputInformation[] getOutputInformations() {
        return outputInformations;
    }


    /**
     * Sets the outputInformations value for this GetRouteTotalsBatchInfo.
     * 
     * @param outputInformations
     */
    public void setOutputInformations(br.com.maplink.services.OutputInformation[] outputInformations) {
        this.outputInformations = outputInformations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRouteTotalsBatchInfo)) return false;
        GetRouteTotalsBatchInfo other = (GetRouteTotalsBatchInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestData==null && other.getRequestData()==null) || 
             (this.requestData!=null &&
              this.requestData.equals(other.getRequestData()))) &&
            ((this.routeTotals==null && other.getRouteTotals()==null) || 
             (this.routeTotals!=null &&
              this.routeTotals.equals(other.getRouteTotals()))) &&
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
        if (getRequestData() != null) {
            _hashCode += getRequestData().hashCode();
        }
        if (getRouteTotals() != null) {
            _hashCode += getRouteTotals().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetRouteTotalsBatchInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsBatchInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "requestData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotalsBatchRequest"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotals"));
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
