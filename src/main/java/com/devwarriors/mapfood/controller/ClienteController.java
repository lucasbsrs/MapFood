package com.devwarriors.mapfood.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.devwarriors.mapfood.model.Cliente;
import com.devwarriors.mapfood.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

	@GetMapping("/clientes/{clienteId}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable("clienteId") Integer id) {

		Optional<Cliente> cliente = Optional.ofNullable(clienteService.getClienteById(id));

		if (!cliente.isPresent())
			return ResponseEntity.noContent().build();

		return ResponseEntity.ok(cliente.get());
	}
}
