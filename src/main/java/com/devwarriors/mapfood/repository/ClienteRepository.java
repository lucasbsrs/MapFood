package com.devwarriors.mapfood.repository;

import com.devwarriors.mapfood.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
	public Cliente findByClienteId(Integer clienteId);
}
