package com.devwarrios.mapfood.controller;

import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping("/clientes")
	public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente) {

		Cliente clienteCriado = clienteService.criaCliente(cliente);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();

		return ResponseEntity.created(uri).body(clienteCriado);
	}

	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> getClientes() {
		return ResponseEntity.ok((clienteService.getClientes()));
	}

	@GetMapping("/clientesl/{clienteId}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable("clienteId") String id) {

		Optional<Cliente> cliente = clienteService.getClienteById(id);

		if (!cliente.isPresent())
			return ResponseEntity.noContent().build();

		//teste

		return ResponseEntity.ok(cliente.get());
	}
}
