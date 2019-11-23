package br.com.fundatec.factory.comida;

import br.com.fundatec.factory.PizzaFactory;

public class PizzaDeCalabresa extends PizzaFactory {

	@Override
	public void pegar() {
		System.out.println("Buscando o queijo mussarela");
		System.out.println("Pegando fatias de calabresa");
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
		System.out.println("Colocando o queijo");
		System.out.println("Botando calabresa por cima");
		System.out.println("Adicionando orégano");
	}

	@Override
	public String getName() {
		
		return "Pizza de Calabresa";
	}

}
