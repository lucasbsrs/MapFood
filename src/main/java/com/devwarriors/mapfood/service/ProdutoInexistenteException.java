package com.devwarriors.mapfood.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProdutoInexistenteException extends ErroResponseException {

	private static final long serialVersionUID = 1L;

	private String produtoId;

	public String getMensagem() {
		return "Produto com id '" + this.produtoId + "' inexistente";
	}
}
