package com.devwarrios.mapfood.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class ClienteInexistenteException extends EntidadeInexistenteException {

	private static final long serialVersionUID = 1L;

	private String clienteId;
	
	public String getMensagem() {
		return "Cliente com id '" + this.clienteId + "' inexistente";
	}
}
