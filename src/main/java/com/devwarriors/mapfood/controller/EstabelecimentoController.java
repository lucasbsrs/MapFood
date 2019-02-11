package com.devwarriors.mapfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.model.Relatorio;
import com.devwarriors.mapfood.service.EstabelecimentoService;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EstabelecimentoController {

	@Autowired
	private EstabelecimentoService estabelecimentoService;

	@GetMapping("estabelecimentos/{id}/relatorio")
	public ResponseEntity<Relatorio> geraRelatorio(@PathVariable("id") String id,
			@RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dataInicial,
			@RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dataFinal) {

		Estabelecimento estabelecimento = estabelecimentoService.buscaEstabelecimentoPorId(id);
		Relatorio relatorio = estabelecimentoService.geraRelatorio(id, dataInicial, dataFinal);

		return ResponseEntity.ok(relatorio);

	}

	@GetMapping("/estabelecimentos")
	public ResponseEntity<List<Estabelecimento>> getEstabelecimentos() {
		return ResponseEntity.ok((estabelecimentoService.getEstabelecimentos()));
	}

	// Postman: localhost:8080/estabelecimentos/proximidade/por-cliente/1?raio=5000
	@GetMapping("/estabelecimentos/proximidade/por-cliente/{clienteId}")
	public ResponseEntity<List<Estabelecimento>> getEstabelecimentosPorLocalizacao(@PathVariable String clienteId,
			@RequestParam Double raio) {
		return ResponseEntity.ok((estabelecimentoService.getEstabelecimentosPorLocalizacao(clienteId, raio)));
	}
}
