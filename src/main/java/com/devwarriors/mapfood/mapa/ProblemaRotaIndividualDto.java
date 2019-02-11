package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.mapa.enums.ModoCalculoRota;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProblemaRotaIndividualDto implements Serializable {

    private ModoCalculoRota calculationMode;

    //@JsonProperty("points")
    private List<Coordenada> points = new ArrayList<>();

    //@JsonProperty("profileName")
    private String profileName = "BRAZIL";

    //@JsonProperty("startDate")
    private int startDate = 0;

    public void preencheRotas(ProblemaRotaIndividual problemaRota) {
        points.add(new Coordenada(problemaRota.getLocalizacaoEntregador().getX(), problemaRota.getLocalizaoCliente().getY(), problemaRota.getEntregador().getEntregadorId()));
        points.add(new Coordenada(problemaRota.getLocalizaoEstabelecimento().getX(), problemaRota.getLocalizaoEstabelecimento().getY(), problemaRota.getPedido().getEstabelecimento().getEstabelecimentoId()));
        points.add(new Coordenada(problemaRota.getLocalizaoCliente().getX(), problemaRota.getLocalizaoCliente().getY(), problemaRota.getPedido().getCliente().getClienteId()));
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    private class Coordenada {
        private Double latitude;
        private Double longitude;
        private String siteId;
    }
}


