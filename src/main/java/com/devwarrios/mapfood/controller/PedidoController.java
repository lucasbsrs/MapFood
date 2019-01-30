package com.devwarrios.mapfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedidos")
public class PedidoController {

	@Autowired
	PedidoService pedidoService;
	
	@PostMapping
	public PedidoStatus criaPedido(@RequestBody PedidoRequest) {
	}
}