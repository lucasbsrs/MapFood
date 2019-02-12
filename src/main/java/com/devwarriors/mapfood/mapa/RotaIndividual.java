package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.mapa.enums.ModoCalculoRota;
import com.devwarriors.mapfood.model.Entregador;
import com.devwarriors.mapfood.model.Pedido;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

@Getter
@Setter
public class RotaIndividual {

    @Id
    private String id;
    private Pedido pedido;
    private Entregador entregador;
    private ModoCalculoRota modoCalculoRota;
    private String problemaId;

    public RotaIndividual() {
    }

    public RotaIndividual(Pedido pedido, Entregador entregador) {
        this.pedido = pedido;
        this.entregador = entregador;
    }

    public GeoJsonPoint getLocalizacaoEntregador() {

        if (entregador == null)
            return null;

        return entregador.getLocalizacao();
    }

    public GeoJsonPoint getLocalizaoCliente() {
        if (pedido == null)
            return null;

        if (pedido.getCliente() == null)
            return null;

        return pedido.getCliente().getLocalizacao();
    }

    public GeoJsonPoint getLocalizaoEstabelecimento() {
        if (pedido == null)
            return null;

        if (pedido.getEstabelecimento() == null)
            return null;

        return pedido.getEstabelecimento().getLocalizacao();
    }

}
