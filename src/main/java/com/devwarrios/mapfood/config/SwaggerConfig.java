package com.devwarrios.mapfood.config;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
// 	private final ResponseMessage m201 = simpleMessage (201, "Recurso criado");
// 	private final ResponseMessage m204put = simpleMessage (204, "Atualizado com sucesso");
// 	private final ResponseMessage m204del = simpleMessage (204, "Excluído com sucesso");
// 	private final ResponseMessage m403 = simpleMessage (403, "Não autorizado");
// 	private final ResponseMessage m404 = simpleMessage (404, "Não encontrado");
// 	private final ResponseMessage m422 = simpleMessage (422, "Erro de validação");
// 	private final ResponseMessage m500 = simpleMessage (500, "Erro inesperado");

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.useDefaultResponseMessages(true)
				//.globalResponseMessage(RequestMethod.GET, Arrays.asList(m403, m404, m500))
				//.globalResponseMessage(RequestMethod.POST, Arrays.asList(m201, m403, m422, m500))
				//.globalResponseMessage(RequestMethod.PUT, Arrays.asList(m204put, m403, m404, m422, m500))
				//.globalResponseMessage(RequestMethod.DELETE, Arrays.asList(m204del, m403, m404, m500))
				
				
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.devwarriors.mapfood.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ResponseMessage simpleMessage(int code, String msg) {
		return new ResponseMessageBuilder().code(code).message(msg).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("Api MapFood", "A maior lista de restaurantes online em sua cidade",
				"Versão 1.0", "", new Contact("DevWarriors","",""),
				"", "", Collections.emptyList());
	}
	
}
