package com.devwarriors.mapfood.service;

import com.devwarriors.mapfood.exception.EstabelecimentoException;
import com.devwarriors.mapfood.model.Cliente;
import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.repository.ClienteRepository;
import com.devwarriors.mapfood.repository.EstabelecimentoRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
public class EstabelecimentoServiceTest {

	private static final String CLIENTE_ID = "2";
	private static final Double RAIO = 0.3;
	private static final Double PONTO_X = -46.640973;
	private static final Double PONTO_Y = -23.603658;
	private static final String ESTABELECIMENTO_ID = "5640f4538237d9c4aaf3b751c4d11769b3fc1e3165ed3b912c508768f7fc15fd";
	private static final LocalDate DATA_INICIAL = LocalDate.ofEpochDay(2019 - 02 - 9);
	private static final LocalDate DATA_FINAL = LocalDate.ofEpochDay(2019 - 02 - 10);

	@InjectMocks
	private EstabelecimentoService estabelecimentoService;
	@MockBean
	private EstabelecimentoRepository estabelecimentoRepository;
	@MockBean
	private RelatorioService relatorioService;
	@MockBean
	private ClienteRepository clienteRepository;
	@MockBean
	private Estabelecimento estabelecimento;
	@MockBean
	private Cliente cliente;
	@MockBean
	GeoJsonPoint point;
	private List<Estabelecimento> estabelecimentos;
	private List<Double> coordenadas;

	@Before
	public void setUp() throws Exception {
		estabelecimentos = Arrays.asList(estabelecimento);
		coordenadas = Arrays.asList(PONTO_X, PONTO_Y);

	}

	@Test
	public void teste_do_metodo_buscaEstabelecimentoPorId_deve_retornar_estancia_de_estabelecimento() {
		when(estabelecimentoRepository.findById(ESTABELECIMENTO_ID)).thenReturn(Optional.of(estabelecimento));
		assertEquals(estabelecimento, estabelecimentoService.buscaEstabelecimentoPorId(ESTABELECIMENTO_ID));
	}

	@Test(expected = EstabelecimentoException.class)
	public void teste_do_metodo_buscaEstabelecimentoPorId_deve_lançar_exception_quando_id_invalido() {
		when(estabelecimentoRepository.findById(ESTABELECIMENTO_ID)).thenReturn(Optional.empty());
		estabelecimentoService.buscaEstabelecimentoPorId(ESTABELECIMENTO_ID);
	}

	@Test
	public void teste_do_metodo_geraRelatorio_verifica_se_getRelatorio_do_servico_de_relatorio_evocado() {
		estabelecimentoService.geraRelatorio(ESTABELECIMENTO_ID, DATA_INICIAL, DATA_FINAL);
		verify(relatorioService, times(1)).geraRelatorio(ESTABELECIMENTO_ID, DATA_INICIAL, DATA_FINAL);
	}

	@Test
	public void teste_do_metodo_getEstabelecimentos_deve_retornar_lista_com_estabelecimentos() {
		when(estabelecimentoRepository.findAll()).thenReturn(estabelecimentos);

		assertEquals(1, estabelecimentoService.getEstabelecimentos().size());
	}

	@Test
	public void teste_do_metodo_getEstabelecimentosPorLocalizacao_deve_retornar_lista_estabecimentos_proximos_por_raio_de_distancia() {
		when(clienteRepository.findByClienteId(CLIENTE_ID)).thenReturn(cliente);
		when(cliente.getLocalizacao()).thenReturn(point);
		when(point.getCoordinates()).thenReturn(coordenadas);
		when(estabelecimentoRepository.findAllByLocalizacaoNear(Mockito.any(), Mockito.any()))
				.thenReturn(estabelecimentos);
		assertEquals(1, estabelecimentoService.getEstabelecimentosPorLocalizacao(CLIENTE_ID, RAIO).size());
	}

}