package com.devwarrios.mapfood.controller;

import com.devwarrios.mapfood.model.Estabelecimento;
import com.devwarrios.mapfood.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @GetMapping("/estabelecimentos")
    public ResponseEntity<List<Estabelecimento>>getEstabelecimentos(){
        return ResponseEntity.ok((estabelecimentoService.getEstabelecimentos()));
    }

    @GetMapping("/estabelecimentos-por-cliente/{clienteId}/{raioEmKm}")
    public ResponseEntity<List<Estabelecimento>>getEstabelecimentosPorLocalizacao
            (@PathVariable Integer clienteId, @PathVariable Integer raioEmKm){
        return ResponseEntity.ok((estabelecimentoService.getEstabelecimentosPorLocalizacao(clienteId, raioEmKm)));
    }


}
