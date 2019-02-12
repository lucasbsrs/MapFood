package com.devwarriors.mapfood.brainstorm;

public interface brainstorm {

	/**
	 * Dado que um consumidor selecionou um cachorro quente no estabelecimento X
	 * Quando o pedido for realizado Então deve-se identificar no sistema qual
	 * motoboy deve ser selecionado, qual o respectivo trajeto e informações
	 * adicionais do trajeto (ex: quilometragem, tempo de entrega…);
	 */

	// public Pedido criaPedido(Consumidor consumidor, List itens, Estabelecimento
	// estabelecimento);
	// public Entregador selecionaMotoboy(Pedido pedido);

	/**
	 * Dado que vários pedidos em localizações próximas foram solicitados em um
	 * mesmo estabelecimento e em horários próximos Quando o sistema for selecionar
	 * o motoboy e respectiva rota Então o mesmo pode levar em consideração a
	 * proximidade desses pedidos para utilizar o mesmo motoboy em tais entregas.
	 */

	// public Rota defineRotas(List Pedidos, List Motoboys);

	/**
	 * 
	 * Dado que um restaurante deseje saber o tempo/quilometragem das entregas do
	 * seu estabelecimento Quando o restaurante solicitar tais dados de determinada
	 * data Então o sistema poderá gerar um relatório para o mesmo.
	 */

	// public Relatorio geraRelatorio(List Rotas, Estabelecimento);
}
