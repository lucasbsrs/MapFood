package com.devwarrios.mapfood.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoStatusResponseDto extends PedidoResponseDto {

	protected String entregadorId;
	protected double distancia;
	protected double eta;

	public PedidoStatusResponseDto(String pedidoId, String pedidoStatus, double valorTotal, LocalDateTime atualizadoEm, String entregadorId,
			double distancia, double eta) {
		super(pedidoId, pedidoStatus, valorTotal, atualizadoEm);

		this.entregadorId = entregadorId;
		this.distancia = distancia;
		this.eta = eta;
	}
}
