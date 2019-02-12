package com.devwarriors.mapfood.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoAtualizadoResponseDto {

	private final String status = "ok";
	private String pedidoId;
	private String pedidoStatus;
	private LocalDateTime atualizadoEm;
}
