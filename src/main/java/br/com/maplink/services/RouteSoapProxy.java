package br.com.maplink.services;

public class RouteSoapProxy implements br.com.maplink.services.RouteSoap {
  private String _endpoint = null;
  private br.com.maplink.services.RouteSoap routeSoap = null;
  
  public RouteSoapProxy() {
    _initRouteSoapProxy();
  }
  
  public RouteSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initRouteSoapProxy();
  }
  
  private void _initRouteSoapProxy() {
    try {
      routeSoap = (new br.com.maplink.services.RouteLocator()).getRouteSoap();
      if (routeSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)routeSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)routeSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (routeSoap != null)
      ((javax.xml.rpc.Stub)routeSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.maplink.services.RouteSoap getRouteSoap() {
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap;
  }
  
  public br.com.maplink.services.GetRouteResponse getRoute(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRoute(routeStops, routeOptions, token);
  }
  
  public br.com.maplink.services.GetRouteTotalsResponse getRouteTotals(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteTotals(routeStops, routeOptions, token);
  }
  
  public br.com.maplink.services.GetRouteTotalsBatchResponse getRouteTotalsBatch(br.com.maplink.services.RouteTotalsBatchRequest[] routeTotalsBatchRequest, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteTotalsBatch(routeTotalsBatchRequest, token);
  }
  
  public br.com.maplink.services.GetRouteWithAlternativesResponse getRouteWithAlternatives(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteWithAlternatives(routeStops, routeOptions, token);
  }
  
  public br.com.maplink.services.GetRouteSummaryResponse getRouteSummary(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteSummary(routeStops, routeOptions, token);
  }
  
  public br.com.maplink.services.GetRouteDescriptionResponse getRouteDescription(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteDescription(routeStops, routeOptions, token);
  }
  
  public br.com.maplink.services.GetMultiRouteResponse getMultiRoute(br.com.maplink.services.MultiRouteRequest[] multiRouteRequests, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getMultiRoute(multiRouteRequests, routeOptions, token);
  }
  
  public br.com.maplink.services.GetRouteWithMapResponse getRouteWithMap(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, br.com.maplink.services.MapOptions mapOptions, java.lang.String token) throws java.rmi.RemoteException{
    if (routeSoap == null)
      _initRouteSoapProxy();
    return routeSoap.getRouteWithMap(routeStops, routeOptions, mapOptions, token);
  }
  
  
}