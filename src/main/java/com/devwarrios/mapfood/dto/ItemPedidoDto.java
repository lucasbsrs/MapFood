package com.devwarrios.mapfood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ItemPedidoDto {

	private String produtoId;
	private Integer quantidade;
	private String observacao;
}
