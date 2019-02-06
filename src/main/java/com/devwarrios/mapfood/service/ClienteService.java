package com.devwarrios.mapfood.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwarrios.mapfood.model.Cliente;
import com.devwarrios.mapfood.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> getClientes() {
		return clienteRepository.findAll();
	}

	public Optional<Cliente> getClienteById(Long id) {
		return clienteRepository.findById(id);
	}

	public Cliente criaCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
