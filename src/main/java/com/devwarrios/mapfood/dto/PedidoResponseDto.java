package com.devwarrios.mapfood.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PedidoResponseDto {

	protected final String STATUS = "ok";
	protected String pedidoId;
	protected String pedidoStatus;
	protected double valorTotal;
	protected LocalDateTime atualizadoEm;
}
