package br.com.fundatec.factory.comida;

import br.com.fundatec.factory.HamburguerFactory;

public class HamburguerCheedar extends HamburguerFactory {

	@Override
	public void pegar() {
		System.out.println("Pegando carne de 150g");
		System.out.println("Separado o queijo cheedar");
		System.out.println("Buscando o bacon");
	}

	@Override
	public void cozinhar() {
		System.out.println("Colocando seu hamburguer na chapa");
		System.out.println("Bacon indo para a chapa");
	}

	@Override
	public void montar() {
		System.out.println("Colocando seu hamburguer no pão");
		System.out.println("Adicionando bacon");
		System.out.println("Colocando queijo cheedar");
	}

	@Override
	public String getName() {
		return "Hamburguer de cheedar";
	}

}
