/**
 * TollFeeDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class TollFeeDetails  implements java.io.Serializable {
    private int id;

    private java.lang.String name;

    private java.lang.String direction;

    private java.lang.String address;

    private java.lang.String concession;

    private java.lang.String phone;

    private java.lang.String state;

    private br.com.maplink.services.TollFeePrice[] prices;

    private double pricePerAxle;

    private br.com.maplink.services.RoadService[] roadService;

    public TollFeeDetails() {
    }

    public TollFeeDetails(
           int id,
           java.lang.String name,
           java.lang.String direction,
           java.lang.String address,
           java.lang.String concession,
           java.lang.String phone,
           java.lang.String state,
           br.com.maplink.services.TollFeePrice[] prices,
           double pricePerAxle,
           br.com.maplink.services.RoadService[] roadService) {
           this.id = id;
           this.name = name;
           this.direction = direction;
           this.address = address;
           this.concession = concession;
           this.phone = phone;
           this.state = state;
           this.prices = prices;
           this.pricePerAxle = pricePerAxle;
           this.roadService = roadService;
    }


    /**
     * Gets the id value for this TollFeeDetails.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this TollFeeDetails.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the name value for this TollFeeDetails.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TollFeeDetails.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the direction value for this TollFeeDetails.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this TollFeeDetails.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the address value for this TollFeeDetails.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this TollFeeDetails.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the concession value for this TollFeeDetails.
     * 
     * @return concession
     */
    public java.lang.String getConcession() {
        return concession;
    }


    /**
     * Sets the concession value for this TollFeeDetails.
     * 
     * @param concession
     */
    public void setConcession(java.lang.String concession) {
        this.concession = concession;
    }


    /**
     * Gets the phone value for this TollFeeDetails.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this TollFeeDetails.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the state value for this TollFeeDetails.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TollFeeDetails.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the prices value for this TollFeeDetails.
     * 
     * @return prices
     */
    public br.com.maplink.services.TollFeePrice[] getPrices() {
        return prices;
    }


    /**
     * Sets the prices value for this TollFeeDetails.
     * 
     * @param prices
     */
    public void setPrices(br.com.maplink.services.TollFeePrice[] prices) {
        this.prices = prices;
    }


    /**
     * Gets the pricePerAxle value for this TollFeeDetails.
     * 
     * @return pricePerAxle
     */
    public double getPricePerAxle() {
        return pricePerAxle;
    }


    /**
     * Sets the pricePerAxle value for this TollFeeDetails.
     * 
     * @param pricePerAxle
     */
    public void setPricePerAxle(double pricePerAxle) {
        this.pricePerAxle = pricePerAxle;
    }


    /**
     * Gets the roadService value for this TollFeeDetails.
     * 
     * @return roadService
     */
    public br.com.maplink.services.RoadService[] getRoadService() {
        return roadService;
    }


    /**
     * Sets the roadService value for this TollFeeDetails.
     * 
     * @param roadService
     */
    public void setRoadService(br.com.maplink.services.RoadService[] roadService) {
        this.roadService = roadService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TollFeeDetails)) return false;
        TollFeeDetails other = (TollFeeDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.concession==null && other.getConcession()==null) || 
             (this.concession!=null &&
              this.concession.equals(other.getConcession()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.prices==null && other.getPrices()==null) || 
             (this.prices!=null &&
              java.util.Arrays.equals(this.prices, other.getPrices()))) &&
            this.pricePerAxle == other.getPricePerAxle() &&
            ((this.roadService==null && other.getRoadService()==null) || 
             (this.roadService!=null &&
              java.util.Arrays.equals(this.roadService, other.getRoadService())));
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
        _hashCode += getId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getConcession() != null) {
            _hashCode += getConcession().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getPricePerAxle()).hashCode();
        if (getRoadService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoadService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoadService(), i);
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
        new org.apache.axis.description.TypeDesc(TollFeeDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "TollFeeDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concession");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "concession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "prices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "TollFeePrice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "TollFeePrice"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePerAxle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "pricePerAxle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.maplink.com.br", "roadService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.maplink.com.br", "RoadService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RoadService"));
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
