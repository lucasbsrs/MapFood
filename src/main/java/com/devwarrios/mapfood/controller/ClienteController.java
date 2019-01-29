package com.devwarrios.mapfood.controller;

import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> getClientes() {
	    return ResponseEntity.ok((clienteService.getClientes()));
	}

	@GetMapping("/clientes/{clienteId}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable("clienteId") Long id) {

		Optional<Cliente> cliente = clienteService.getClienteById(id);

		if (!cliente.isPresent())
			return ResponseEntity.noContent().build();

		return ResponseEntity.ok(cliente.get());
	}
}
