package com.devwarriors.mapfood.mapa;

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

    private static String token;

    public MapLinkApi() {
    }

    public String obterToken() {

        if (token != null)
            return token;

        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(CLIENT_KEY, CLIENT_SECRET);

        Response response = ClientBuilder.newClient()
                .register(feature)
                .target(PATH_AUTENTICACAO)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(new Form(), MediaType.APPLICATION_JSON));

        if (response.getStatus() == 401) {
            token = null;
            return obterToken();
        }

        if (response.getStatus() == 200) {
            String msg = response.readEntity(String.class);
            JsonObject jsonObject = new Gson().fromJson(msg, JsonObject.class);
            JsonElement element = jsonObject.get("access_token");
            token = element.getAsString();
            return token;
        }
        return null;
    }

    public SolucaoRota retornaSolucaoDeRotaPorId(String id) {

        Response response = ClientBuilder.newClient()
                .target(URL_API)
                .path(String.format(PATH_GET_SOLUCAO, id))
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + obterToken())
                .get();

        if (response.getStatus() == 200) {
            String msg = response.readEntity(String.class);
            JsonObject jsonObject = new Gson().fromJson(msg, JsonObject.class);
            String problemaId = jsonObject.get("id").getAsString();
            Long totalTempo = jsonObject.get("totalNominalDuration").getAsLong();
            Double totalDistancia = jsonObject.get("totalDistance").getAsDouble();

            return new SolucaoRota(problemaId, totalDistancia, totalTempo);
        }

        return null;
    }

    public String criaProblemaDeRota(RotaIndividualDto problemaRota) {

        Response response = ClientBuilder.newClient()
                .target(URL_API)
                .path(PATH_POST_PROBLEMA)
                .request(MediaType.APPLICATION_JSON)
                .header("Authorization", "Bearer " + obterToken())
                .post(Entity.json(new Gson().toJson(problemaRota)));

        if (response.getStatus() == 201) {
            String msg = response.readEntity(String.class);
            JsonObject jsonObject = new Gson().fromJson(msg, JsonObject.class);
            JsonElement element = jsonObject.get("id");
            return element.getAsString();
        }
        return null;
    }
}
