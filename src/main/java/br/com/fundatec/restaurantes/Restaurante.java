package br.com.fundatec.restaurantes;

import br.com.fundatec.ifood.Pedido;

public abstract class Restaurante {

	public Pedido fazerPedido(String lanche) {
		Pedido pedido = criarPedido(lanche);
		
		pedido.receberPedido();
		pedido.preparar();
		pedido.embalar();
		pedido.entregar();
		
		return pedido;
	}
	protected abstract Pedido criarPedido(String lanche);
}
