package com.devwarrios.mapfood.model;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entrega {

	@Field("entregador")
	private Entregador entregador;
	
	@Field("atualizado_em")
	private LocalDate atualizadoEm;
	
	@Field("criado_em")
	private LocalDate criadoEm;
}
