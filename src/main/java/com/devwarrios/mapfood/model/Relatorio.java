package com.devwarrios.mapfood.model;

import lombok.Getter;
import lombok.Setter;

import java.time.Duration;

@Getter
@Setter
public class Relatorio {

    private Long totalEntregas;
    private Double totalQuilometragem;
    private Duration totalTempo;
    private Produto produtoMaisVendido;

    public Relatorio() {
    }

    public Relatorio(Long totalEntregas, Double totalQuilometragem, Duration totalTempo, Produto produtoMaisVendido) {
        this.totalEntregas = totalEntregas;
        this.totalQuilometragem = totalQuilometragem;
        this.totalTempo = totalTempo;
        this.produtoMaisVendido = produtoMaisVendido;
    }
}
