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

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
public class EstabelecimentoControllerTest {

    private final String EXPECTED_RESPONSE = "<200 OK OK,[com.devwarriors.mapfood.model.Estabelecimento#0 bean],[]>";

    @InjectMocks
    private EstabelecimentoController controller;

    @MockBean
    private EstabelecimentoService service;

    @MockBean
    private Estabelecimento estabelecimento;

   private List<Estabelecimento> estabelecimentos;


    @Before
    public void setUp() throws Exception {
        estabelecimentos = Arrays.asList(estabelecimento);
    }

    @Test
    public void geraRelatorio() {
    }

    @Test
    public void metodo_getEstabelecimentos_deve_retornar_reponse_com_uma_lista_de_estabelecimentos() {
        PowerMockito.when(service.getEstabelecimentos()).thenReturn(estabelecimentos);
        Assert.assertEquals(EXPECTED_RESPONSE, controller.getEstabelecimentos().toString());
    }

    @Test
    public void getEstabelecimentosPorLocalizacao() {
    }
}

