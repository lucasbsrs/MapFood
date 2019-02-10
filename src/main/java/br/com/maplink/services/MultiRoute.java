/**
 * MultiRoute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class MultiRoute  implements java.io.Serializable {
    private br.com.maplink.services.SingleRouteTotals[] singleRouteTotals;

    public MultiRoute() {
    }

    public MultiRoute(
           br.com.maplink.services.SingleRouteTotals[] singleRouteTotals) {
           this.singleRouteTotals = singleRouteTotals;
    }


    /**
     * Gets the singleRouteTotals value for this MultiRoute.
     * 
     * @return singleRouteTotals
     */
    public br.com.maplink.services.SingleRouteTotals[] getSingleRouteTotals() {
        return singleRouteTotals;
    }


    /**
     * Sets the singleRouteTotals value for this MultiRoute.
     * 
     * @param singleRouteTotals
     */
    public void setSingleRouteTotals(br.com.maplink.services.SingleRouteTotals[] singleRouteTotals) {
        this.singleRouteTotals = singleRouteTotals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultiRoute)) return false;
        MultiRoute other = (MultiRoute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.singleRouteTotals==null && other.getSingleRouteTotals()==null) || 
             (this.singleRouteTotals!=null &&
              java.util.Arrays.equals(this.singleRouteTotals, other.getSingleRouteTotals())));
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
        if (getSingleRouteTotals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSingleRouteTotals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSingleRouteTotals(), i);
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
        new org.apache.axis.description.TypeDesc(MultiRoute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "MultiRoute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleRouteTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "singleRouteTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "SingleRouteTotals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "SingleRouteTotals"));
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
