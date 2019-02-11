package com.devwarriors.mapfood.controller;

import com.devwarriors.mapfood.model.Estabelecimento;
import com.devwarriors.mapfood.service.EstabelecimentoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.when;

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
public class EstabelecimentoControllerTest {

    private static final String CLIENTE_ID = "2";
    private static final String EXPECTED_RESPONSE = "<200 OK OK,[com.devwarriors.mapfood.model.Estabelecimento#0 bean],[]>";
    private static final Double RAIO = 0.3;

    @InjectMocks
    private EstabelecimentoController controller;
    @MockBean
    private EstabelecimentoService service;
    @MockBean
    private Estabelecimento estabelecimento;
    private List<Estabelecimento> estabelecimentos;

    @Before
    public void setUp() throws Exception {
        estabelecimentos = asList(estabelecimento);
    }

    @Test
    public void geraRelatorio() {
    }

    @Test
    public void metodo_getEstabelecimentos_deve_retornar_reponse_com_uma_lista_de_estabelecimentos() {
        when(service.getEstabelecimentos()).thenReturn(estabelecimentos);
        assertEquals(EXPECTED_RESPONSE, controller.getEstabelecimentos().toString());
    }

    @Test
    public void getEstabelecimentosPorLocalizacao() {
        when(service.getEstabelecimentosPorLocalizacao(CLIENTE_ID, RAIO)).thenReturn(estabelecimentos);
        assertEquals(EXPECTED_RESPONSE, controller.getEstabelecimentosPorLocalizacao(CLIENTE_ID, RAIO).toString());
    }
}

