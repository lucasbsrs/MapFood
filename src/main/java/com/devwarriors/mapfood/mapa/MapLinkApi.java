package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.model.ProblemaRota;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MapLinkApi {

    private static final String URL_API = "https://lbslocal-prod.apigee.net/trip/v1";
    private static final String PATH_POST_PROBLEMA = "/problems";
    private static final String PATH_GET_PROBLEMA = "/problems/%s";
    private static final String PATH_GET_SOLUCAO = "/solutions/%s";

    public MapLinkApi() {
    }

    public Response obterSolucao(String problemaId) {

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(URL_API)
                .path(String.format(PATH_GET_SOLUCAO, problemaId));

        Response response = webTarget.request().get();

        return response;

    }

    public String obterToken() {
        return "go9AUsRggAswpIyuNUGSY8JegVQa";
    }

    public Response postaProblema(ProblemaRota problemaRota) {

        String endpoint = URL_API + PATH_POST_PROBLEMA;

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(URL_API)
                .path(PATH_POST_PROBLEMA);

        Response response = webTarget.request().post(Entity.entity(problemaRota, MediaType.APPLICATION_JSON_TYPE));

        return response;
    }

    private HttpEntity<?> getHttpHeader(Object o) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "mapfood");
        //sheaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + obterToken());

        return new HttpEntity<>(headers);
    }


}
