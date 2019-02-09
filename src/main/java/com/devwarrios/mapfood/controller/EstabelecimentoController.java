package com.devwarrios.mapfood.controller;

import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.model.Relatorio;
import com.devwarrios.mapfood.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @GetMapping("estabelecimentos/{id}/relatorio")
    public ResponseEntity<?> geraRelatorio(@PathVariable("id") String id,
            @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dataInicial,
            @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dataFinal) {

            Estabelecimento estabelecimento = estabelecimentoService.buscaEstabelecimentoPorId(id);
            Relatorio relatorio = estabelecimentoService.geraRelatorio(id, dataInicial, dataFinal);

            return ResponseEntity.ok(relatorio);

    }
}
