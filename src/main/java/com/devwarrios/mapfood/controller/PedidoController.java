package com.devwarrios.mapfood.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devwarrios.mapfood.dto.PedidoRequestDto;
import com.devwarrios.mapfood.dto.factory.PedidoFactory;
import com.devwarrios.mapfood.model.Pedido;

@RestController
@RequestMapping("pedidos")
public class PedidoController {

	/*
	 * @Autowired PedidoService pedidoService;
	 */

	@PostMapping
	public ResponseEntity<?> criaPedido(@RequestBody PedidoRequestDto pedidoRequestDto) {
		Pedido pedido = PedidoFactory.criaPedido(pedidoRequestDto);

		return null;
	}
}