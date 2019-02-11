package com.devwarriors.mapfood.model;

import com.devwarriors.mapfood.model.enums.ModoCalculoRota;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class ProblemaRota {

    @Id
    private String id;
    private Pedido pedido;
    private Entregador entregador;
    private ModoCalculoRota modoCalculoRota;
    private String problemaId;

    public ProblemaRota() {
    }

    public ProblemaRota(Pedido pedido, Entregador entregador) {
        this.pedido = pedido;
        this.entregador = entregador;
    }
}
