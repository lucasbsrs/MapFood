/**
 * RoadType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class RoadType  implements java.io.Serializable {
    private double twoLaneHighway;

    private double secondLaneUnderConstruction;

    private double oneLaneRoadway;

    private double pavingWorkInProgress;

    private double dirtRoad;

    private double roadwayInPoorConditions;

    private double ferry;

    public RoadType() {
    }

    public RoadType(
           double twoLaneHighway,
           double secondLaneUnderConstruction,
           double oneLaneRoadway,
           double pavingWorkInProgress,
           double dirtRoad,
           double roadwayInPoorConditions,
           double ferry) {
           this.twoLaneHighway = twoLaneHighway;
           this.secondLaneUnderConstruction = secondLaneUnderConstruction;
           this.oneLaneRoadway = oneLaneRoadway;
           this.pavingWorkInProgress = pavingWorkInProgress;
           this.dirtRoad = dirtRoad;
           this.roadwayInPoorConditions = roadwayInPoorConditions;
           this.ferry = ferry;
    }


    /**
     * Gets the twoLaneHighway value for this RoadType.
     * 
     * @return twoLaneHighway
     */
    public double getTwoLaneHighway() {
        return twoLaneHighway;
    }


    /**
     * Sets the twoLaneHighway value for this RoadType.
     * 
     * @param twoLaneHighway
     */
    public void setTwoLaneHighway(double twoLaneHighway) {
        this.twoLaneHighway = twoLaneHighway;
    }


    /**
     * Gets the secondLaneUnderConstruction value for this RoadType.
     * 
     * @return secondLaneUnderConstruction
     */
    public double getSecondLaneUnderConstruction() {
        return secondLaneUnderConstruction;
    }


    /**
     * Sets the secondLaneUnderConstruction value for this RoadType.
     * 
     * @param secondLaneUnderConstruction
     */
    public void setSecondLaneUnderConstruction(double secondLaneUnderConstruction) {
        this.secondLaneUnderConstruction = secondLaneUnderConstruction;
    }


    /**
     * Gets the oneLaneRoadway value for this RoadType.
     * 
     * @return oneLaneRoadway
     */
    public double getOneLaneRoadway() {
        return oneLaneRoadway;
    }


    /**
     * Sets the oneLaneRoadway value for this RoadType.
     * 
     * @param oneLaneRoadway
     */
    public void setOneLaneRoadway(double oneLaneRoadway) {
        this.oneLaneRoadway = oneLaneRoadway;
    }


    /**
     * Gets the pavingWorkInProgress value for this RoadType.
     * 
     * @return pavingWorkInProgress
     */
    public double getPavingWorkInProgress() {
        return pavingWorkInProgress;
    }


    /**
     * Sets the pavingWorkInProgress value for this RoadType.
     * 
     * @param pavingWorkInProgress
     */
    public void setPavingWorkInProgress(double pavingWorkInProgress) {
        this.pavingWorkInProgress = pavingWorkInProgress;
    }


    /**
     * Gets the dirtRoad value for this RoadType.
     * 
     * @return dirtRoad
     */
    public double getDirtRoad() {
        return dirtRoad;
    }


    /**
     * Sets the dirtRoad value for this RoadType.
     * 
     * @param dirtRoad
     */
    public void setDirtRoad(double dirtRoad) {
        this.dirtRoad = dirtRoad;
    }


    /**
     * Gets the roadwayInPoorConditions value for this RoadType.
     * 
     * @return roadwayInPoorConditions
     */
    public double getRoadwayInPoorConditions() {
        return roadwayInPoorConditions;
    }


    /**
     * Sets the roadwayInPoorConditions value for this RoadType.
     * 
     * @param roadwayInPoorConditions
     */
    public void setRoadwayInPoorConditions(double roadwayInPoorConditions) {
        this.roadwayInPoorConditions = roadwayInPoorConditions;
    }


    /**
     * Gets the ferry value for this RoadType.
     * 
     * @return ferry
     */
    public double getFerry() {
        return ferry;
    }


    /**
     * Sets the ferry value for this RoadType.
     * 
     * @param ferry
     */
    public void setFerry(double ferry) {
        this.ferry = ferry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoadType)) return false;
        RoadType other = (RoadType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.twoLaneHighway == other.getTwoLaneHighway() &&
            this.secondLaneUnderConstruction == other.getSecondLaneUnderConstruction() &&
            this.oneLaneRoadway == other.getOneLaneRoadway() &&
            this.pavingWorkInProgress == other.getPavingWorkInProgress() &&
            this.dirtRoad == other.getDirtRoad() &&
            this.roadwayInPoorConditions == other.getRoadwayInPoorConditions() &&
            this.ferry == other.getFerry();
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
        _hashCode += new Double(getTwoLaneHighway()).hashCode();
        _hashCode += new Double(getSecondLaneUnderConstruction()).hashCode();
        _hashCode += new Double(getOneLaneRoadway()).hashCode();
        _hashCode += new Double(getPavingWorkInProgress()).hashCode();
        _hashCode += new Double(getDirtRoad()).hashCode();
        _hashCode += new Double(getRoadwayInPoorConditions()).hashCode();
        _hashCode += new Double(getFerry()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoadType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RoadType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twoLaneHighway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "twoLaneHighway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondLaneUnderConstruction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "secondLaneUnderConstruction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneLaneRoadway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "oneLaneRoadway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pavingWorkInProgress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "pavingWorkInProgress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirtRoad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "dirtRoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadwayInPoorConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "roadwayInPoorConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ferry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "ferry"));
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
