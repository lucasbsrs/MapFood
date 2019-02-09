package com.devwarrios.mapfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devwarrios.mapfood.dto.PedidoInvalidoResponseDto;
import com.devwarrios.mapfood.dto.PedidoRequestDto;
import com.devwarrios.mapfood.dto.PedidoResponseDto;
import com.devwarrios.mapfood.service.EntidadeInexistenteException;
import com.devwarrios.mapfood.service.PedidoService;

@RestController
@RequestMapping
public class PedidoController {

	@Autowired
	PedidoService pedidoService;

	@PostMapping("/app/pedido")
	@ResponseBody
	public ResponseEntity<?> criaPedido(@RequestBody PedidoRequestDto pedidoRequestDto) {
		try {
			PedidoResponseDto pedidoResponseDto = pedidoService.criaPedido(pedidoRequestDto);
			
			return ResponseEntity.ok(pedidoResponseDto);
		}
		catch (EntidadeInexistenteException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new PedidoInvalidoResponseDto(e.getMensagem()));
		}
	}
	
	@PutMapping("/admin/pedido")
	@ResponseBody
	public ResponseEntity<?> atualizaPedido(@RequestBody PedidoUpdateDto pedidoUpdateDto) {
		try {
			PedidoResponseDto pedidoResponseDto = pedidoService.criaPedido(pedidoRequestDto);
			
			return ResponseEntity.ok(pedidoResponseDto);
		}
		catch (EntidadeInexistenteException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new PedidoInvalidoResponseDto(e.getMensagem()));
		}
	}
}