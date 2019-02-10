package com.devwarrios.mapfood.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequisicaoInvalidaResponseDto {

	protected final String STATUS = "erro";
	protected String mensagem;

	public RequisicaoInvalidaResponseDto(String mensagem) {
		this.mensagem = mensagem;
	}
}
