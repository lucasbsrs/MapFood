package com.devwarrios.mapfood.dto;

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
	
	public PedidoRequestDto() {
		
	}

	public String getClienteId() {
		return clienteId;
	}

	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}

	public String getEstabelecimentoId() {
		return estabelecimentoId;
	}

	public void setEstabelecimentoId(String estabelecimentoId) {
		this.estabelecimentoId = estabelecimentoId;
	}

	public List<ItemPedidoDto> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedidoDto> itens) {
		this.itens = itens;
	}
	
	
}
