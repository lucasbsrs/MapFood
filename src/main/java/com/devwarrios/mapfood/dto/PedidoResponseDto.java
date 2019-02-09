package com.devwarrios.mapfood.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoResponseDto {

	private String pedidoId;
	private String entregador;
	private double distancia;
	private double eta;
	private double valorTotal;
	private LocalDateTime atualizadoEm;
}
