/**
 * RouteSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.maplink.services;

public class RouteSoapStub extends org.apache.axis.client.Stub implements br.com.maplink.services.RouteSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRoute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeStops"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteStop"), br.com.maplink.services.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions"), br.com.maplink.services.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteResponse"));
        oper.setReturnClass(br.com.maplink.services.GetRouteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRouteTotals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeStops"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteStop"), br.com.maplink.services.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions"), br.com.maplink.services.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsResponse"));
        oper.setReturnClass(br.com.maplink.services.GetRouteTotalsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRouteTotalsBatch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeTotalsBatchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteTotalsBatchRequest"), br.com.maplink.services.RouteTotalsBatchRequest[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotalsBatchRequest"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsBatchResponse"));
        oper.setReturnClass(br.com.maplink.services.GetRouteTotalsBatchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsBatchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRouteWithAlternatives");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeStops"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteStop"), br.com.maplink.services.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions"), br.com.maplink.services.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteWithAlternativesResponse"));
        oper.setReturnClass(br.com.maplink.services.GetRouteWithAlternativesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteWithAlternativesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRouteSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeStops"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteStop"), br.com.maplink.services.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions"), br.com.maplink.services.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteSummaryResponse"));
        oper.setReturnClass(br.com.maplink.services.GetRouteSummaryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteSummaryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRouteDescription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeStops"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteStop"), br.com.maplink.services.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions"), br.com.maplink.services.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteDescriptionResponse"));
        oper.setReturnClass(br.com.maplink.services.GetRouteDescriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteDescriptionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMultiRoute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "multiRouteRequests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfMultiRouteRequest"), br.com.maplink.services.MultiRouteRequest[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "MultiRouteRequest"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions"), br.com.maplink.services.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetMultiRouteResponse"));
        oper.setReturnClass(br.com.maplink.services.GetMultiRouteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetMultiRouteResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRouteWithMap");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeStops"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteStop"), br.com.maplink.services.RouteStop[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "routeOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions"), br.com.maplink.services.RouteOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "mapOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.maplink.com.br", "MapOptions"), br.com.maplink.services.MapOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.maplink.com.br", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteWithMapResponse"));
        oper.setReturnClass(br.com.maplink.services.GetRouteWithMapResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteWithMapResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public RouteSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RouteSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RouteSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "AlternativeRouteInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.AlternativeRouteInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfGetRouteTotalsBatchInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetRouteTotalsBatchInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsBatchInfo");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsBatchInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfMultiRouteRequest");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.MultiRouteRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "MultiRouteRequest");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "MultiRouteRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfOutputInformation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.OutputInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "OutputInformation");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "OutputInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfPOIDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.POIDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "POIDetails");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "POIDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfPoint");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.Point[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "Point");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "Point");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfPublicTransportationDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.PublicTransportationDetails[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "PublicTransportationDetails");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "PublicTransportationDetails");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRoadService");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RoadService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RoadService");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "RoadService");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteInfo");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteLine");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteLine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteLine");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteLine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteStop");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteStop[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteSummary");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteSummary");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfRouteTotalsBatchRequest");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteTotalsBatchRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotalsBatchRequest");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotalsBatchRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfSegmentDescription");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.SegmentDescription[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "SegmentDescription");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "SegmentDescription");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfSingleRouteTotals");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.SingleRouteTotals[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "SingleRouteTotals");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "SingleRouteTotals");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "poi");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfString1");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "barrier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfString2");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "costAdjustment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "ArrayOfTollFeePrice");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.TollFeePrice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "TollFeePrice");
            qName2 = new javax.xml.namespace.QName("http://services.maplink.com.br", "TollFeePrice");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "City");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.City.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "Controls");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.Controls.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "Extent");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.Extent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetMultiRouteResponse");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetMultiRouteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetRouteDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteResponse");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetRouteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteSummaryResponse");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetRouteSummaryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsBatchInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetRouteTotalsBatchInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsBatchResponse");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetRouteTotalsBatchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsResponse");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetRouteTotalsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteWithAlternativesResponse");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetRouteWithAlternativesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteWithMapResponse");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.GetRouteWithMapResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "MapInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.MapInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "MapOptions");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.MapOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "MapSize");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.MapSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "MultiRoute");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.MultiRoute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "MultiRouteRequest");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.MultiRouteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "OutputInformation");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.OutputInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "OutputInformationCategory");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.OutputInformationCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "POIDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.POIDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "Point");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.Point.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "PublicTransportationDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.PublicTransportationDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RoadService");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RoadService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RoadType");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RoadType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteInfo");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteLine");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteOptions");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteSchedule");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteStop");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteStop.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteSummary");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotals");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteTotals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "RouteTotalsBatchRequest");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.RouteTotalsBatchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "SegmentDescription");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.SegmentDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "SingleRouteTotals");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.SingleRouteTotals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "TollFeeDetails");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.TollFeeDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "TollFeePrice");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.TollFeePrice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.maplink.com.br", "Vehicle");
            cachedSerQNames.add(qName);
            cls = br.com.maplink.services.Vehicle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.maplink.services.GetRouteResponse getRoute(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.maplink.com.br/GetRoute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRoute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeStops, routeOptions, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink.services.GetRouteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink.services.GetRouteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink.services.GetRouteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink.services.GetRouteTotalsResponse getRouteTotals(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.maplink.com.br/GetRouteTotals");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotals"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeStops, routeOptions, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink.services.GetRouteTotalsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink.services.GetRouteTotalsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink.services.GetRouteTotalsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink.services.GetRouteTotalsBatchResponse getRouteTotalsBatch(br.com.maplink.services.RouteTotalsBatchRequest[] routeTotalsBatchRequest, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.maplink.com.br/GetRouteTotalsBatch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteTotalsBatch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeTotalsBatchRequest, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink.services.GetRouteTotalsBatchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink.services.GetRouteTotalsBatchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink.services.GetRouteTotalsBatchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink.services.GetRouteWithAlternativesResponse getRouteWithAlternatives(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.maplink.com.br/GetRouteWithAlternatives");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteWithAlternatives"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeStops, routeOptions, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink.services.GetRouteWithAlternativesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink.services.GetRouteWithAlternativesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink.services.GetRouteWithAlternativesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink.services.GetRouteSummaryResponse getRouteSummary(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.maplink.com.br/GetRouteSummary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeStops, routeOptions, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink.services.GetRouteSummaryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink.services.GetRouteSummaryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink.services.GetRouteSummaryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink.services.GetRouteDescriptionResponse getRouteDescription(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.maplink.com.br/GetRouteDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeStops, routeOptions, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink.services.GetRouteDescriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink.services.GetRouteDescriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink.services.GetRouteDescriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink.services.GetMultiRouteResponse getMultiRoute(br.com.maplink.services.MultiRouteRequest[] multiRouteRequests, br.com.maplink.services.RouteOptions routeOptions, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.maplink.com.br/GetMultiRoute");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetMultiRoute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {multiRouteRequests, routeOptions, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink.services.GetMultiRouteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink.services.GetMultiRouteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink.services.GetMultiRouteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.maplink.services.GetRouteWithMapResponse getRouteWithMap(br.com.maplink.services.RouteStop[] routeStops, br.com.maplink.services.RouteOptions routeOptions, br.com.maplink.services.MapOptions mapOptions, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.maplink.com.br/GetRouteWithMap");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.maplink.com.br", "GetRouteWithMap"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {routeStops, routeOptions, mapOptions, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.maplink.services.GetRouteWithMapResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.maplink.services.GetRouteWithMapResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.maplink.services.GetRouteWithMapResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
