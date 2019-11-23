package br.com.fundatec.factory;

import br.com.fundatec.factory.comida.Comida;
import br.com.fundatec.factory.comida.PizzaDeCalabresa;
import br.com.fundatec.factory.comida.PizzaDeQueijo;

public class PizzaHut extends Restaurante{

	@Override
	protected Comida receberPedido(String lanche) {
		switch(lanche) {
			case "4 queijos":
				return new PizzaDeQueijo();
			case "calabresa":
				return new PizzaDeCalabresa();
		}
		return null;
	}

}
