package br.com.fundatec.factory;

import br.com.fundatec.factory.comida.Comida;
import br.com.fundatec.factory.comida.HamburguerBacon;
import br.com.fundatec.factory.comida.HamburguerCheedar;

public class Severo extends Restaurante{

	@Override
	protected Comida receberPedido(String lanche) {
		switch (lanche) {
		case "cheedar":
			return new HamburguerCheedar();
		case "bacon":
			return new HamburguerBacon();
		default:
			break;
		}
		return null;
	}

}
