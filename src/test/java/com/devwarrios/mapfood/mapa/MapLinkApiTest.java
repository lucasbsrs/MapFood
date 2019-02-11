package com.devwarrios.mapfood.mapa;

import com.devwarriors.mapfood.mapa.MapLinkApi;
import com.devwarriors.mapfood.model.ProblemaRota;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import javax.ws.rs.core.Response;

import static junit.framework.Assert.assertEquals;

public class MapLinkApiTest {

    @Test
    public void testarConexao() {

        MapLinkApi mapLinkApi = new MapLinkApi();

        Response response = mapLinkApi.obterSolucao("5c603306c079cd0006a1492e");

        System.out.println(response.toString());
    }

    @Test
    public void enviarProblemaPraCalcularRota() {

        MapLinkApi mapLinkApi = new MapLinkApi();

        ResponseEntity<?> responseEntity = mapLinkApi.postaProblema(new ProblemaRota());

        assertEquals(200, responseEntity.getStatusCode());
        //System.out.println(responseEntity.toString());
    }

}
