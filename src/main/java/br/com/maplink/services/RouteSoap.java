/**
 * RouteSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public interface RouteSoap extends java.rmi.Remote {

    /**
     * It generates a route and returns general data from the generated
     * route.
     */
    public br.com.maplink.services.GetRouteResponse getRoute(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * It generates a route and returns the total data from the generated
     * route.
     */
    public br.com.maplink.services.GetRouteTotalsResponse getRouteTotals(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * It generates routes from a requested routes batch, and returns
     * the total data from the generated routes.
     */
    public br.com.maplink.services.GetRouteTotalsBatchResponse getRouteTotalsBatch(br.com.maplink.services.RouteTotalsBatchRequest[] routeTotalsBatchRequest, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * It generates a route and up to two alternative routes, if they
     * exist.
     */
    public br.com.maplink.services.GetRouteWithAlternativesResponse getRouteWithAlternatives(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * It generates a route and returns summarized data from the generated
     * route.
     */
    public br.com.maplink.services.GetRouteSummaryResponse getRouteSummary(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * It generates a route and returns description data from the
     * generated route.
     */
    public br.com.maplink.services.GetRouteDescriptionResponse getRouteDescription(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * It generates multiple routes and returns total, id and map
     * data from the generated routes.
     */
    public br.com.maplink.services.GetMultiRouteResponse getMultiRoute(br.com.maplink.services.MultiRouteRequest[] multiRouteRequests, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException;

    /**
     * It generates a route and returns map data from the generated
     * route.
     */
    public br.com.maplink.services.GetRouteWithMapResponse getRouteWithMap(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, br.com.maplink.services.MapOptions mapOptions, java.lang.String token) throws java.rmi.RemoteException;
}
