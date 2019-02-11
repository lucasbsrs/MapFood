package com.devwarriors.mapfood.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class TransicaoStatusPedidoInvalidaException extends ErroResponseException {

	private static final long serialVersionUID = 1L;

	private String status;

	public String getMensagem() {
		return "Status '" + this.status + "' invalido";
	}
}
