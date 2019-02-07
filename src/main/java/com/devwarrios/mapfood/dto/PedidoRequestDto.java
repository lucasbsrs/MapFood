package com.devwarrios.mapfood.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoRequestDto implements PedidoDto {

	private String clienteId;
	private String estabelecimentoId;
	private List<ItemPedidoDto> itens;
}
