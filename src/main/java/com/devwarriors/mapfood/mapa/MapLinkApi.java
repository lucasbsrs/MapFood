package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.dto.ProblemaRotaDto;
import com.devwarriors.mapfood.service.SolucaoRota;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class MapLinkApi {

    private static final String URL_API = "https://lbslocal-prod.apigee.net";
    private static final String PATH_AUTENTICACAO = URL_API + "/oauth/client_credential/accesstoken?grant_type=client_credentials";
    private static final String PATH_POST_PROBLEMA = "trip/v1/problems";
    private static final String PATH_GET_SOLUCAO = "trip/v1/solutions/%s";

    private static final String CLIENT_KEY = "8oCbEMp87iAdjmN0JlE5rFUSrs9w6MLa";
    private static final String CLIENT_SECRET = "5isHfSYHH8X4aA30";

    public MapLinkApi() {
    }

    public String obterToken() {

        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(CLIENT_KEY, CLIENT_SECRET);

        Response response = ClientBuilder.newClient()
                .register(feature)
                .target(PATH_AUTENTICACAO + "?grant_type=client_credentials")
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

    public SolucaoRota obterSolucao(String problemaId) {

        Response response = ClientBuilder.newClient()
                .target(URL_API)
                .path(String.format(PATH_GET_SOLUCAO, problemaId))
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + obterToken())
                .get();

        SolucaoRota solucaoRota = response.readEntity(SolucaoRota.class);

        return solucaoRota;
    }

    public String postaProblema(ProblemaRotaDto problemaRota) {

        Response response = ClientBuilder.newClient()
                .target(URL_API)
                .path(PATH_POST_PROBLEMA)
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + obterToken())
                .post(Entity.entity(problemaRota, MediaType.APPLICATION_JSON));

        if (response.getStatus() == 200) {
            String msg = response.readEntity(String.class);
            JsonObject jsonObject = new Gson().fromJson(msg, JsonObject.class);
            JsonElement element = jsonObject.get("id");
            return element.getAsString();
        }
        return null;
    }
}
