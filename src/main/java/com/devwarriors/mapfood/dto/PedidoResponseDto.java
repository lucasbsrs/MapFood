package com.devwarriors.mapfood.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PedidoResponseDto {

	private String pedidoId;
	private String entregador;
	private double distancia;
	private double eta;
	private LocalDate timestamp;
}
