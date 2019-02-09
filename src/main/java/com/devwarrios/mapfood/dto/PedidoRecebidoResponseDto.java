package com.devwarrios.mapfood.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoRecebidoResponseDto extends PedidoResponseDto {

	public PedidoRecebidoResponseDto(String pedidoId, double valorTotal, LocalDateTime atualizadoEm) {
		super(pedidoId, valorTotal, atualizadoEm);
	}
}