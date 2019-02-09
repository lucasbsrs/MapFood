package com.devwarrios.mapfood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarrios.mapfood.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

	public Cliente findByClienteId(String clienteId);
	public boolean existsByClienteId(String clienteId);
}
