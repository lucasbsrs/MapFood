package com.devwarriors.mapfood.service;

import com.devwarriors.mapfood.model.Cliente;
import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.repository.ClienteRepository;
import com.devwarriors.mapfood.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Service;

import com.devwarriors.mapfood.exception.EstabelecimentoException;
import com.devwarriors.mapfood.model.Relatorio;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Collections;
import java.util.List;

@Service
public class EstabelecimentoService {

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;

	@Autowired
	private RelatorioService relatorioService;

	@Autowired
    private ClienteRepository clienteRepository;

	public Estabelecimento buscaEstabelecimentoPorId(String id) throws EstabelecimentoException {

		Optional<Estabelecimento> estabelecimento = estabelecimentoRepository.findById(id);

		if (!estabelecimento.isPresent())
			throw new EstabelecimentoException("Estabelecimento não encontrado.");

		return estabelecimento.get();

	}

	public Relatorio geraRelatorio(String id, LocalDate dataInicial, LocalDate dataFinal) {
		return relatorioService.geraRelatorio(id, dataInicial, dataFinal);
	}

	public List<Estabelecimento> getEstabelecimentos() {
        return estabelecimentoRepository.findAll();
    }

    public List<Estabelecimento> getEstabelecimentosPorLocalizacao(String clienteId, Double raio) {

        try {
            Cliente cliente = clienteRepository.findByClienteId(Integer.valueOf(clienteId));
            Distance distance = new Distance(raio * 1000);
            GeoJsonPoint point = new GeoJsonPoint(
                    new Point(
                            cliente.getLocalizacao().getCoordinates().get(0),
                            cliente.getLocalizacao().getCoordinates().get(1)
                    ));

            return estabelecimentoRepository.findAllByLocalizacaoNear(point, distance);

        } catch (Exception e) { e.printStackTrace(); }

        return Collections.emptyList();
    }

}
