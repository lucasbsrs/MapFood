package com.devwarrios.mapfood.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ClienteInexistenteException extends ErroResponseException {

	private static final long serialVersionUID = 1L;

	private String clienteId;

	public String getMensagem() {
		return "Cliente com id '" + this.clienteId + "' inexistente";
	}
}
