package com.devwarrios.mapfood.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoInvalidoResponseDto {

	protected final String STATUS = "erro"; 
	protected String mensagem;

	public PedidoInvalidoResponseDto(String mensagem) {
		this.mensagem = mensagem;
	}
}
