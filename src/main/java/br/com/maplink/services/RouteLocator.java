/**
 * RouteLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class RouteLocator extends org.apache.axis.client.Service implements br.com.maplink.services.Route {

    public RouteLocator() {
    }


    public RouteLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RouteLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RouteSoap
    private java.lang.String RouteSoap_address = "http://services.maplink.com.br/webservices/v5.2/route/route.asmx";

    public java.lang.String getRouteSoapAddress() {
        return RouteSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RouteSoapWSDDServiceName = "RouteSoap";

    public java.lang.String getRouteSoapWSDDServiceName() {
        return RouteSoapWSDDServiceName;
    }

    public void setRouteSoapWSDDServiceName(java.lang.String name) {
        RouteSoapWSDDServiceName = name;
    }

    public br.com.maplink.services.RouteSoap getRouteSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RouteSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRouteSoap(endpoint);
    }

    public br.com.maplink.services.RouteSoap getRouteSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.maplink.services.RouteSoapStub _stub = new br.com.maplink.services.RouteSoapStub(portAddress, this);
            _stub.setPortName(getRouteSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRouteSoapEndpointAddress(java.lang.String address) {
        RouteSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.maplink.services.RouteSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.maplink.services.RouteSoapStub _stub = new br.com.maplink.services.RouteSoapStub(new java.net.URL(RouteSoap_address), this);
                _stub.setPortName(getRouteSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RouteSoap".equals(inputPortName)) {
            return getRouteSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.maplink.com.br", "Route");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RouteSoap".equals(portName)) {
            setRouteSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
