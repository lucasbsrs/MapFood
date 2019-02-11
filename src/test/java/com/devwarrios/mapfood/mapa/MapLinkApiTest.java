package com.devwarrios.mapfood.mapa;

import com.devwarriors.mapfood.mapa.MapLinkApi;
import com.devwarriors.mapfood.service.SolucaoRota;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class MapLinkApiTest {

    @Test
    public void obterTokenAutenticacao() {

        MapLinkApi mapLinkApi = new MapLinkApi();

        String token = mapLinkApi.obterToken();
        assertNotNull(token);
        System.out.println(token);
    }

    @Test
    public void enviarProblemaPraCalcularRota() {

        MapLinkApi mapLinkApi = new MapLinkApi();

      //  Response response = mapLinkApi.postaProblema(new ProblemaRota());

        //assertEquals(200, response.getStatus());
    }

    @Test
    public void buscarSolucaoDoProblemaPorId(){
        MapLinkApi mapLinkApi = new MapLinkApi();
        SolucaoRota solucaoRota = mapLinkApi.obterSolucao("5c603306c079cd0006a1492e");
        System.out.println(solucaoRota.toString());
    }

}
