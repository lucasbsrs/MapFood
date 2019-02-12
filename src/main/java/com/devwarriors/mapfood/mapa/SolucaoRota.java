package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.model.Entregador;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SolucaoRota {

    private String problemaId;
    private Double totalDistanciaMetros;
    private Long totalTempoSegundos;
    private Entregador entregador;
}
