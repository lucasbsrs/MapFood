package com.devwarrios.mapfood.controller;

import com.devwarrios.mapfood.model.Produto;
import com.devwarrios.mapfood.model.Relatorio;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
public class EstabelecimentoController {

    @GetMapping("estabelecimentos/{id}/relatorio/")
    public ResponseEntity<Relatorio> geraRelatorio(@PathVariable("id") ObjectId id,
                                                   @RequestParam("dataInicial") String dataIncial, @RequestParam("dataFinal") String dataFinal) {

        return ResponseEntity.ok(new Relatorio(10L, 100.50, Duration.ofHours(10), new Produto()));

    }

}
