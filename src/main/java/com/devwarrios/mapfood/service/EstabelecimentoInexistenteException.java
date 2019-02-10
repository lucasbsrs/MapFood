package com.devwarrios.mapfood.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class EstabelecimentoInexistenteException extends ErroResponseException {

	private static final long serialVersionUID = 1L;

	private String estabelecimentoId;

	public String getMensagem() {
		return "Estabelecimento com id '" + this.estabelecimentoId + "' inexistente";
	}
}
