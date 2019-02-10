/**
 * Route.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public interface Route extends javax.xml.rpc.Service {
    public java.lang.String getRouteSoapAddress();

    public br.com.maplink.services.RouteSoap getRouteSoap() throws javax.xml.rpc.ServiceException;

    public br.com.maplink.services.RouteSoap getRouteSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
