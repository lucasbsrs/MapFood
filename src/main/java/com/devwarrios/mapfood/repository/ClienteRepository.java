package com.devwarrios.mapfood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devwarrios.mapfood.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	public List<Cliente> findByClienteId(String clienteId);
}
