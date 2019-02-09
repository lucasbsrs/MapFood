package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Relatorio {

    private Long quantidadeDeEntregas;
    private Double totalQuilometragemPercorrida;
    private Double totalTempoDecorrido;

    public Relatorio() {
    }

    public Relatorio(Long quantidadeDeEntregas, Double totalQuilometragemPercorrida, Double totalTempoDecorrido) {
        this.quantidadeDeEntregas = quantidadeDeEntregas;
        this.totalQuilometragemPercorrida = totalQuilometragemPercorrida;
        this.totalTempoDecorrido = totalTempoDecorrido;
    }
}
