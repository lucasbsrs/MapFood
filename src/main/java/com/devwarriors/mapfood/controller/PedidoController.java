package com.devwarriors.mapfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devwarriors.mapfood.dto.PedidoRequestDto;
import com.devwarriors.mapfood.dto.PedidoResponseDto;
import com.devwarriors.mapfood.service.PedidoService;

@RestController
@RequestMapping("pedido")
public class PedidoController {

	@Autowired
	PedidoService pedidoService;

	@PostMapping
	@ResponseBody
	public ResponseEntity<?> criaPedido(@RequestBody PedidoRequestDto pedidoRequestDto) {
		PedidoResponseDto pedidoResponseDto = pedidoService.criaPedido(pedidoRequestDto);

		return ResponseEntity.ok(pedidoResponseDto);
	}
}