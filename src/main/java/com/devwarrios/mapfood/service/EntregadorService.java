package com.devwarrios.mapfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devwarrios.mapfood.model.Entregador;
import com.devwarrios.mapfood.repository.EntregadorRepository;

@Service
public class EntregadorService {

	@Autowired
	private EntregadorRepository entregadorRepository;
	
	public void decrementaCapacidadeDisponivel(String entregadorId, int decremento)
			throws CapacidadeDoEntregadorInvalidaException {
		Entregador entregador = this.entregadorRepository.findByEntregadorId(entregadorId);
		
		int capacidadeAtual = entregador.getCapacidadeDisponivel();
		if (capacidadeAtual < decremento) {
			throw new CapacidadeDoEntregadorInvalidaException();
		}
		
		entregador.setCapacidadeDisponivel(entregador.getCapacidadeDisponivel() - decremento);
		
		this.entregadorRepository.save(entregador);
	}
}
