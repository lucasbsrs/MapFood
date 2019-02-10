/**
 * RouteTotals.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class RouteTotals  implements java.io.Serializable {
    private double totalDistance;

    private java.lang.String totalTime;

    private double totalFuelUsed;

    private double totaltollFeeCost;

    private double totalfuelCost;

    private double totalCost;

    private double taxiFare1;

    private double taxiFare2;

    public RouteTotals() {
    }

    public RouteTotals(
           double totalDistance,
           java.lang.String totalTime,
           double totalFuelUsed,
           double totaltollFeeCost,
           double totalfuelCost,
           double totalCost,
           double taxiFare1,
           double taxiFare2) {
           this.totalDistance = totalDistance;
           this.totalTime = totalTime;
           this.totalFuelUsed = totalFuelUsed;
           this.totaltollFeeCost = totaltollFeeCost;
           this.totalfuelCost = totalfuelCost;
           this.totalCost = totalCost;
           this.taxiFare1 = taxiFare1;
           this.taxiFare2 = taxiFare2;
    }


    /**
     * Gets the totalDistance value for this RouteTotals.
     * 
     * @return totalDistance
     */
    public double getTotalDistance() {
        return totalDistance;
    }


    /**
     * Sets the totalDistance value for this RouteTotals.
     * 
     * @param totalDistance
     */
    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }


    /**
     * Gets the totalTime value for this RouteTotals.
     * 
     * @return totalTime
     */
    public java.lang.String getTotalTime() {
        return totalTime;
    }


    /**
     * Sets the totalTime value for this RouteTotals.
     * 
     * @param totalTime
     */
    public void setTotalTime(java.lang.String totalTime) {
        this.totalTime = totalTime;
    }


    /**
     * Gets the totalFuelUsed value for this RouteTotals.
     * 
     * @return totalFuelUsed
     */
    public double getTotalFuelUsed() {
        return totalFuelUsed;
    }


    /**
     * Sets the totalFuelUsed value for this RouteTotals.
     * 
     * @param totalFuelUsed
     */
    public void setTotalFuelUsed(double totalFuelUsed) {
        this.totalFuelUsed = totalFuelUsed;
    }


    /**
     * Gets the totaltollFeeCost value for this RouteTotals.
     * 
     * @return totaltollFeeCost
     */
    public double getTotaltollFeeCost() {
        return totaltollFeeCost;
    }


    /**
     * Sets the totaltollFeeCost value for this RouteTotals.
     * 
     * @param totaltollFeeCost
     */
    public void setTotaltollFeeCost(double totaltollFeeCost) {
        this.totaltollFeeCost = totaltollFeeCost;
    }


    /**
     * Gets the totalfuelCost value for this RouteTotals.
     * 
     * @return totalfuelCost
     */
    public double getTotalfuelCost() {
        return totalfuelCost;
    }


    /**
     * Sets the totalfuelCost value for this RouteTotals.
     * 
     * @param totalfuelCost
     */
    public void setTotalfuelCost(double totalfuelCost) {
        this.totalfuelCost = totalfuelCost;
    }


    /**
     * Gets the totalCost value for this RouteTotals.
     * 
     * @return totalCost
     */
    public double getTotalCost() {
        return totalCost;
    }


    /**
     * Sets the totalCost value for this RouteTotals.
     * 
     * @param totalCost
     */
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }


    /**
     * Gets the taxiFare1 value for this RouteTotals.
     * 
     * @return taxiFare1
     */
    public double getTaxiFare1() {
        return taxiFare1;
    }


    /**
     * Sets the taxiFare1 value for this RouteTotals.
     * 
     * @param taxiFare1
     */
    public void setTaxiFare1(double taxiFare1) {
        this.taxiFare1 = taxiFare1;
    }


    /**
     * Gets the taxiFare2 value for this RouteTotals.
     * 
     * @return taxiFare2
     */
    public double getTaxiFare2() {
        return taxiFare2;
    }


    /**
     * Sets the taxiFare2 value for this RouteTotals.
     * 
     * @param taxiFare2
     */
    public void setTaxiFare2(double taxiFare2) {
        this.taxiFare2 = taxiFare2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RouteTotals)) return false;
        RouteTotals other = (RouteTotals) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.totalDistance == other.getTotalDistance() &&
            ((this.totalTime==null && other.getTotalTime()==null) || 
             (this.totalTime!=null &&
              this.totalTime.equals(other.getTotalTime()))) &&
            this.totalFuelUsed == other.getTotalFuelUsed() &&
            this.totaltollFeeCost == other.getTotaltollFeeCost() &&
            this.totalfuelCost == other.getTotalfuelCost() &&
            this.totalCost == other.getTotalCost() &&
            this.taxiFare1 == other.getTaxiFare1() &&
            this.taxiFare2 == other.getTaxiFare2();
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
        _hashCode += new Double(getTotalDistance()).hashCode();
        if (getTotalTime() != null) {
            _hashCode += getTotalTime().hashCode();
        }
        _hashCode += new Double(getTotalFuelUsed()).hashCode();
        _hashCode += new Double(getTotaltollFeeCost()).hashCode();
        _hashCode += new Double(getTotalfuelCost()).hashCode();
        _hashCode += new Double(getTotalCost()).hashCode();
        _hashCode += new Double(getTaxiFare1()).hashCode();
        _hashCode += new Double(getTaxiFare2()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RouteTotals.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotals"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "totalDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "totalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFuelUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "totalFuelUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaltollFeeCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "totaltollFeeCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalfuelCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "totalfuelCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "totalCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxiFare1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "taxiFare1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxiFare2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "taxiFare2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
