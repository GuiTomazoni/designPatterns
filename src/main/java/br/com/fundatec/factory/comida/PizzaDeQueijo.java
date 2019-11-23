package br.com.fundatec.factory.comida;

import br.com.fundatec.factory.PizzaFactory;

public class PizzaDeQueijo extends PizzaFactory {

	@Override
	public void pegar() {
		System.out.println("Buscando os queijos gorgonzola, suíço, cheedar e provolone");
		System.out.println("Pegando massa de pizza");
		System.out.println("Separando o molho");
	}

	@Override
	public void assar() {
		System.out.println("Colocando a pizza no forno a lenha por 30min");
	}

	@Override
	public void montar() {
		System.out.println("Colocando o molho na pizza");
		System.out.println("Colocando os queijos por cima");
		System.out.println("Adicionando orégano");
	}

	@Override
	public String getName() {
		
		return "Pizza de 4 queijos";
	}

}
