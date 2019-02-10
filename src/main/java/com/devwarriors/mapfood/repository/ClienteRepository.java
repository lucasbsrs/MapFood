package com.devwarriors.mapfood.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devwarriors.mapfood.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
	public Cliente findByClienteId(Integer clienteId);
}
