package br.com.fundatec.restaurantes;

import br.com.fundatec.ifood.Pedido;

public class Severo extends Restaurante {

	@Override
	protected Pedido criarPedido(String lanche) {
		switch(lanche) {
			case "bovino"
				return new HamburguerBovino();
			case "suino"
				return new HamburguerSuino();
		}
		return null;
	}

	
	

}
