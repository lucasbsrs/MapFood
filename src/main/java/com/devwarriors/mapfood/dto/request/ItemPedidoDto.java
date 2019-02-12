package com.devwarriors.mapfood.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemPedidoDto {

	private String produtoId;
	private Integer quantidade;
	private String observacao;
}
