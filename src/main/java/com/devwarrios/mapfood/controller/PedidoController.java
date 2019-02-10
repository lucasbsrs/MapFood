package com.devwarrios.mapfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devwarrios.mapfood.dto.PedidoAtualizadoResponseDto;
import com.devwarrios.mapfood.dto.PedidoRequestDto;
import com.devwarrios.mapfood.dto.PedidoResponseDto;
import com.devwarrios.mapfood.dto.PedidoUpdateRequestDto;
import com.devwarrios.mapfood.dto.RequisicaoInvalidaResponseDto;
import com.devwarrios.mapfood.service.ErroResponseException;
import com.devwarrios.mapfood.service.PedidoService;

@RestController
@RequestMapping
public class PedidoController {

	@Autowired
	PedidoService pedidoService;

	@PostMapping("/marketplace/pedido")
	@ResponseBody
	public ResponseEntity<?> criaPedido(@RequestBody PedidoRequestDto pedidoRequestDto) {
		try {
			PedidoResponseDto pedidoResponseDto = pedidoService.criaPedido(pedidoRequestDto);

			return ResponseEntity.ok(pedidoResponseDto);
		} catch (ErroResponseException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new RequisicaoInvalidaResponseDto(e.getMensagem()));
		}
	}

	@GetMapping("/marketplace/pedido/{id}")
	@ResponseBody
	public ResponseEntity<?> criaPedido(@PathVariable("id") String id) {
		try {
			PedidoResponseDto pedidoStatusResponseDto = pedidoService.buscaPedido(id);

			return ResponseEntity.ok(pedidoStatusResponseDto);
		} catch (ErroResponseException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new RequisicaoInvalidaResponseDto(e.getMensagem()));
		}
	}

	@PutMapping("/management/pedido")
	@ResponseBody
	public ResponseEntity<?> atualizaPedido(@RequestBody PedidoUpdateRequestDto pedidoUpdateRequestDto) {
		try {
			PedidoAtualizadoResponseDto pedidoAtualizadoResponseDto;
			pedidoAtualizadoResponseDto = pedidoService.atualizaPedido(pedidoUpdateRequestDto);

			return ResponseEntity.ok(pedidoAtualizadoResponseDto);
		} catch (ErroResponseException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new RequisicaoInvalidaResponseDto(e.getMensagem()));
		}
	}
}