package com.devwarriors.mapfood.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PedidoRequestDto implements PedidoDto {

	private String clienteId;
	private String estabelecimentoId;
	private List<ItemPedidoDto> itens;

}
