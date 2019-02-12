package com.devwarriors.mapfood.mapa;

import com.devwarriors.mapfood.mapa.MapLinkApi;
import junit.framework.Assert;
import org.junit.Test;

public class MapLinkApiTest {

	@Test
	public void obterTokenAutenticacao() {

		MapLinkApi mapLinkApi = new MapLinkApi();

		String token = mapLinkApi.obterToken();
		//Assert.assertNotNull(token);
		System.out.println(token);
	}
}
