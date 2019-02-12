package com.devwarriors.mapfood.controller;

import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.model.Relatorio;
import com.devwarriors.mapfood.service.EstabelecimentoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
public class EstabelecimentoControllerTest {

	private static final String CLIENTE_ID = "2";
	private static final String RESPONSE_LISTA_ESPERADO = "<200 OK OK,[com.devwarriors.mapfood.model.Estabelecimento#0 bean],[]>";
	private static final String RESPONSE_RELATORIO_ESPERADO = "<200 OK OK,com.devwarriors.mapfood.model.Relatorio#0 bean,[]>";
	private static final Double RAIO = 0.3;
	private static final String ESTABELECIMENTO_ID = "5640f4538237d9c4aaf3b751c4d11769b3fc1e3165ed3b912c508768f7fc15fd";
	private static final LocalDate DATA_INICIAL = LocalDate.ofEpochDay(2019 - 02 - 9);
	private static final LocalDate DATA_FINAL = LocalDate.ofEpochDay(2019 - 02 - 10);

	@InjectMocks
	private EstabelecimentoController controller;
	@MockBean
	private EstabelecimentoService service;
	@MockBean
	private Estabelecimento estabelecimento;
	@MockBean
	private Relatorio relatorio;
	private List<Estabelecimento> estabelecimentos;

	@Before
	public void setUp() throws Exception {
		estabelecimentos = asList(estabelecimento);
	}

	@Test
	public void teste_do_metodo_geraRelatorio_deve_retornar_instancia_de_relatorio_em_response() {
		when(service.buscaEstabelecimentoPorId(ESTABELECIMENTO_ID)).thenReturn(estabelecimento);
		when(service.geraRelatorio(ESTABELECIMENTO_ID, DATA_INICIAL, DATA_FINAL)).thenReturn(relatorio);
		assertEquals(RESPONSE_RELATORIO_ESPERADO,
				controller.geraRelatorio(ESTABELECIMENTO_ID, DATA_INICIAL, DATA_FINAL).toString());
	}

	@Test
	public void teste_do_metodo_getEstabelecimentos_deve_retornar_response_com_uma_lista_de_estabelecimentos() {
		when(service.getEstabelecimentos()).thenReturn(estabelecimentos);
		assertEquals(RESPONSE_LISTA_ESPERADO, controller.getEstabelecimentos().toString());
	}

	@Test
	public void teste_do_metodo_getEstabelecimentosPorLocalizacao_deve_retornar_reponse_com_uma_lista_de_estabelecimentos_por_proximidade() {
		when(service.getEstabelecimentosPorLocalizacao(CLIENTE_ID, RAIO)).thenReturn(estabelecimentos);
		assertEquals(RESPONSE_LISTA_ESPERADO,
				controller.getEstabelecimentosPorLocalizacao(CLIENTE_ID, RAIO).toString());
	}
}