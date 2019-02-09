package com.devwarriors.mapfood.service;

import java.util.List;

import com.devwarriors.mapfood.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwarriors.mapfood.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> getClientes() { return clienteRepository.findAll();	}

	public Cliente getClienteById(Integer id) { return clienteRepository.findByClienteId(id);	}

	public Cliente criaCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
