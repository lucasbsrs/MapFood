package com.devwarriors.mapfood.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PedidoRequestDto implements PedidoDto {

	private Integer clienteId;
	private String estabelecimentoId;
	private List<ItemPedidoDto> itens;

}
