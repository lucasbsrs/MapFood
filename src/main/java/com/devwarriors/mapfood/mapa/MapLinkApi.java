package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.model.ProblemaRota;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MapLinkApi {

    private static final String URL_API = "https://lbslocal-prod.apigee.net/trip/v1";
    private static final String URL_AUTENTICACAO = "https://lbslocal-prod.apigee.net/oauth/client_credential/accesstoken";
    private static final String CLIENT_KEY = "8oCbEMp87iAdjmN0JlE5rFUSrs9w6MLa";
    private static final String CLIENT_SECRET = "5isHfSYHH8X4aA30";

    private static final String PATH_POST_PROBLEMA = "/problems";
    private static final String PATH_GET_PROBLEMA = "/problems/%s";
    private static final String PATH_GET_SOLUCAO = "/solutions/%s";

    public MapLinkApi() {
    }

    public String obterToken() {

        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(CLIENT_KEY, CLIENT_SECRET);

        Response response = ClientBuilder.newClient()
                .register(feature)
                .target(URL_AUTENTICACAO + "?grant_type=client_credentials")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(new Form(), MediaType.APPLICATION_JSON));

        if (response.getStatus() == 200) {
            String msg = response.readEntity(String.class);
            JsonObject jsonObject = new Gson().fromJson(msg, JsonObject.class);
            JsonElement element = jsonObject.get("access_token");
            return element.getAsString();
        }
        return null;
    }

    public Response obterSolucao(String problemaId) {

        Response response = ClientBuilder.newClient()
                .target(URL_API)
                .path(String.format(PATH_GET_SOLUCAO, problemaId))
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + null)
                .get();

        return response;
    }

    public String postaProblema(ProblemaRota problemaRota) {

        Response response = ClientBuilder.newClient()
                .target(URL_API)
                .path(PATH_POST_PROBLEMA)
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + null)
                .post(Entity.entity(problemaRota, MediaType.APPLICATION_JSON));

        if (response.getStatus() == 200) {
            String msg = response.readEntity(String.class);
            JsonObject jsonObject = new Gson().fromJson(msg, JsonObject.class);
            JsonElement element = jsonObject.get("id");
            return element.getAsString();
        }
        return null;
    }

    private HttpEntity<?> getHttpHeader(Object o) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "mapfood");
        headers.add("Authorization", "Bearer " + obterToken());

        return new HttpEntity<>(headers);
    }


}
