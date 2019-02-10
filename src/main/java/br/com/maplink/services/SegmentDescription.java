/**
 * SegmentDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class SegmentDescription  implements java.io.Serializable {
    private java.lang.String command;

    private java.lang.String description;

    private java.lang.String poiRoute;

    private br.com.maplink.services.POIDetails[] poiRouteDetails;

    private br.com.maplink.services.City city;

    private java.lang.String tollFee;

    private br.com.maplink.services.TollFeeDetails tollFeeDetails;

    private java.lang.String hasPublicTransportation;

    private br.com.maplink.services.PublicTransportationDetails[] publicTransportationDetails;

    private java.lang.String roadType;

    private double distance;

    private double duration;

    private double cumulativeDistance;

    private br.com.maplink.services.Point point;

    public SegmentDescription() {
    }

    public SegmentDescription(
           java.lang.String command,
           java.lang.String description,
           java.lang.String poiRoute,
           br.com.maplink.services.POIDetails[] poiRouteDetails,
           br.com.maplink.services.City city,
           java.lang.String tollFee,
           br.com.maplink.services.TollFeeDetails tollFeeDetails,
           java.lang.String hasPublicTransportation,
           br.com.maplink.services.PublicTransportationDetails[] publicTransportationDetails,
           java.lang.String roadType,
           double distance,
           double duration,
           double cumulativeDistance,
           br.com.maplink.services.Point point) {
           this.command = command;
           this.description = description;
           this.poiRoute = poiRoute;
           this.poiRouteDetails = poiRouteDetails;
           this.city = city;
           this.tollFee = tollFee;
           this.tollFeeDetails = tollFeeDetails;
           this.hasPublicTransportation = hasPublicTransportation;
           this.publicTransportationDetails = publicTransportationDetails;
           this.roadType = roadType;
           this.distance = distance;
           this.duration = duration;
           this.cumulativeDistance = cumulativeDistance;
           this.point = point;
    }


    /**
     * Gets the command value for this SegmentDescription.
     * 
     * @return command
     */
    public java.lang.String getCommand() {
        return command;
    }


    /**
     * Sets the command value for this SegmentDescription.
     * 
     * @param command
     */
    public void setCommand(java.lang.String command) {
        this.command = command;
    }


    /**
     * Gets the description value for this SegmentDescription.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SegmentDescription.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the poiRoute value for this SegmentDescription.
     * 
     * @return poiRoute
     */
    public java.lang.String getPoiRoute() {
        return poiRoute;
    }


    /**
     * Sets the poiRoute value for this SegmentDescription.
     * 
     * @param poiRoute
     */
    public void setPoiRoute(java.lang.String poiRoute) {
        this.poiRoute = poiRoute;
    }


    /**
     * Gets the poiRouteDetails value for this SegmentDescription.
     * 
     * @return poiRouteDetails
     */
    public br.com.maplink.services.POIDetails[] getPoiRouteDetails() {
        return poiRouteDetails;
    }


    /**
     * Sets the poiRouteDetails value for this SegmentDescription.
     * 
     * @param poiRouteDetails
     */
    public void setPoiRouteDetails(br.com.maplink.services.POIDetails[] poiRouteDetails) {
        this.poiRouteDetails = poiRouteDetails;
    }


    /**
     * Gets the city value for this SegmentDescription.
     * 
     * @return city
     */
    public br.com.maplink.services.City getCity() {
        return city;
    }


    /**
     * Sets the city value for this SegmentDescription.
     * 
     * @param city
     */
    public void setCity(br.com.maplink.services.City city) {
        this.city = city;
    }


    /**
     * Gets the tollFee value for this SegmentDescription.
     * 
     * @return tollFee
     */
    public java.lang.String getTollFee() {
        return tollFee;
    }


    /**
     * Sets the tollFee value for this SegmentDescription.
     * 
     * @param tollFee
     */
    public void setTollFee(java.lang.String tollFee) {
        this.tollFee = tollFee;
    }


    /**
     * Gets the tollFeeDetails value for this SegmentDescription.
     * 
     * @return tollFeeDetails
     */
    public br.com.maplink.services.TollFeeDetails getTollFeeDetails() {
        return tollFeeDetails;
    }


    /**
     * Sets the tollFeeDetails value for this SegmentDescription.
     * 
     * @param tollFeeDetails
     */
    public void setTollFeeDetails(br.com.maplink.services.TollFeeDetails tollFeeDetails) {
        this.tollFeeDetails = tollFeeDetails;
    }


    /**
     * Gets the hasPublicTransportation value for this SegmentDescription.
     * 
     * @return hasPublicTransportation
     */
    public java.lang.String getHasPublicTransportation() {
        return hasPublicTransportation;
    }


    /**
     * Sets the hasPublicTransportation value for this SegmentDescription.
     * 
     * @param hasPublicTransportation
     */
    public void setHasPublicTransportation(java.lang.String hasPublicTransportation) {
        this.hasPublicTransportation = hasPublicTransportation;
    }


    /**
     * Gets the publicTransportationDetails value for this SegmentDescription.
     * 
     * @return publicTransportationDetails
     */
    public br.com.maplink.services.PublicTransportationDetails[] getPublicTransportationDetails() {
        return publicTransportationDetails;
    }


    /**
     * Sets the publicTransportationDetails value for this SegmentDescription.
     * 
     * @param publicTransportationDetails
     */
    public void setPublicTransportationDetails(br.com.maplink.services.PublicTransportationDetails[] publicTransportationDetails) {
        this.publicTransportationDetails = publicTransportationDetails;
    }


    /**
     * Gets the roadType value for this SegmentDescription.
     * 
     * @return roadType
     */
    public java.lang.String getRoadType() {
        return roadType;
    }


    /**
     * Sets the roadType value for this SegmentDescription.
     * 
     * @param roadType
     */
    public void setRoadType(java.lang.String roadType) {
        this.roadType = roadType;
    }


    /**
     * Gets the distance value for this SegmentDescription.
     * 
     * @return distance
     */
    public double getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this SegmentDescription.
     * 
     * @param distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }


    /**
     * Gets the duration value for this SegmentDescription.
     * 
     * @return duration
     */
    public double getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this SegmentDescription.
     * 
     * @param duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }


    /**
     * Gets the cumulativeDistance value for this SegmentDescription.
     * 
     * @return cumulativeDistance
     */
    public double getCumulativeDistance() {
        return cumulativeDistance;
    }


    /**
     * Sets the cumulativeDistance value for this SegmentDescription.
     * 
     * @param cumulativeDistance
     */
    public void setCumulativeDistance(double cumulativeDistance) {
        this.cumulativeDistance = cumulativeDistance;
    }


    /**
     * Gets the point value for this SegmentDescription.
     * 
     * @return point
     */
    public br.com.maplink.services.Point getPoint() {
        return point;
    }


    /**
     * Sets the point value for this SegmentDescription.
     * 
     * @param point
     */
    public void setPoint(br.com.maplink.services.Point point) {
        this.point = point;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SegmentDescription)) return false;
        SegmentDescription other = (SegmentDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.command==null && other.getCommand()==null) || 
             (this.command!=null &&
              this.command.equals(other.getCommand()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.poiRoute==null && other.getPoiRoute()==null) || 
             (this.poiRoute!=null &&
              this.poiRoute.equals(other.getPoiRoute()))) &&
            ((this.poiRouteDetails==null && other.getPoiRouteDetails()==null) || 
             (this.poiRouteDetails!=null &&
              java.util.Arrays.equals(this.poiRouteDetails, other.getPoiRouteDetails()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.tollFee==null && other.getTollFee()==null) || 
             (this.tollFee!=null &&
              this.tollFee.equals(other.getTollFee()))) &&
            ((this.tollFeeDetails==null && other.getTollFeeDetails()==null) || 
             (this.tollFeeDetails!=null &&
              this.tollFeeDetails.equals(other.getTollFeeDetails()))) &&
            ((this.hasPublicTransportation==null && other.getHasPublicTransportation()==null) || 
             (this.hasPublicTransportation!=null &&
              this.hasPublicTransportation.equals(other.getHasPublicTransportation()))) &&
            ((this.publicTransportationDetails==null && other.getPublicTransportationDetails()==null) || 
             (this.publicTransportationDetails!=null &&
              java.util.Arrays.equals(this.publicTransportationDetails, other.getPublicTransportationDetails()))) &&
            ((this.roadType==null && other.getRoadType()==null) || 
             (this.roadType!=null &&
              this.roadType.equals(other.getRoadType()))) &&
            this.distance == other.getDistance() &&
            this.duration == other.getDuration() &&
            this.cumulativeDistance == other.getCumulativeDistance() &&
            ((this.point==null && other.getPoint()==null) || 
             (this.point!=null &&
              this.point.equals(other.getPoint())));
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
        if (getCommand() != null) {
            _hashCode += getCommand().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPoiRoute() != null) {
            _hashCode += getPoiRoute().hashCode();
        }
        if (getPoiRouteDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoiRouteDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoiRouteDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getTollFee() != null) {
            _hashCode += getTollFee().hashCode();
        }
        if (getTollFeeDetails() != null) {
            _hashCode += getTollFeeDetails().hashCode();
        }
        if (getHasPublicTransportation() != null) {
            _hashCode += getHasPublicTransportation().hashCode();
        }
        if (getPublicTransportationDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublicTransportationDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublicTransportationDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoadType() != null) {
            _hashCode += getRoadType().hashCode();
        }
        _hashCode += new Double(getDistance()).hashCode();
        _hashCode += new Double(getDuration()).hashCode();
        _hashCode += new Double(getCumulativeDistance()).hashCode();
        if (getPoint() != null) {
            _hashCode += getPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SegmentDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "SegmentDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "command"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poiRoute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "poiRoute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poiRouteDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "poiRouteDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "POIDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "POIDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "City"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "tollFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tollFeeDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "tollFeeDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "TollFeeDetails"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPublicTransportation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "hasPublicTransportation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicTransportationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "publicTransportationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "PublicTransportationDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "PublicTransportationDetails"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "roadType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumulativeDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "cumulativeDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "Point"));
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
