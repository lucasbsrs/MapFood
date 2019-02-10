package com.devwarrios.mapfood.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PedidoInexistenteException extends ErroResponseException {

	private static final long serialVersionUID = 1L;

	private String pedidoId;

	public String getMensagem() {
		return "Pedido com id '" + this.pedidoId + "' inexistente";
	}
}
