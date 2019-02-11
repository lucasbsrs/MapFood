package com.devwarriors.mapfood.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoUpdateRequestDto {

	private String pedidoId;
	private String status;

	@Override
	public String toString() {
		return "PedidoUpdateRequestDto [pedidoId=" + pedidoId + ", status=" + status + "]";
	}
}