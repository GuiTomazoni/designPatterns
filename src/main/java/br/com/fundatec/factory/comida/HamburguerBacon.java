package br.com.fundatec.factory.comida;

import br.com.fundatec.factory.HamburguerFactory;

public class HamburguerBacon extends HamburguerFactory {

	@Override
	public void pegar() {
		System.out.println("Pegando carne de 150g");
		System.out.println("Separado o queijo suíçor");
		System.out.println("Buscando o bacon");
	}

	@Override
	public void cozinhar() {
		System.out.println("Colocando seu hamburguer na chapa");
		System.out.println("8 fatias de bacon acabam de  cair na chapa");
	}

	@Override
	public void montar() {
		System.out.println("Colocando seu hamburguer no pão");
		System.out.println("Adicionando bacon");
		System.out.println("Adicionando queijo suíço");
		System.out.println("Colocando mais bacon");
	}
	
	@Override
	public String getName() {
		return "Hamburguer de bacon";
	}

}
