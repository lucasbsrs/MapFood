package com.devwarrios.mapfood.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class ProdutoInexistenteException extends EntidadeInexistenteException {

	private static final long serialVersionUID = 1L;
	
	private String produtoId;
	
	public String getMensagem() {
		return "Produto com id '" + this.produtoId + "' inexistente";
	}
}
