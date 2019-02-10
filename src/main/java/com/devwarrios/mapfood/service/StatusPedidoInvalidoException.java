package com.devwarrios.mapfood.service;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class StatusPedidoInvalidoException extends ErroResponseException {

	private static final long serialVersionUID = 1L;

	private String status;

	public String getMensagem() {
		return "Status '" + this.status + "' invalido";
	}
}
