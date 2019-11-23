package br.com.fundatec.factory.comida;

import br.com.fundatec.factory.DogFactory;

public class DogDeLinguica extends DogFactory {

	@Override
	public void preparar() {
		System.out.println("Pegando o pão");
		System.out.println("Colocando em um saquinho");
		System.out.println("Linguiça na chapa");
	}

	@Override
	public void montar() {
		System.out.println("Colocando o molho");
		System.out.println("Colocando a linguiça");
		System.out.println("Adicionando maionese e queijo ralado");
		System.out.println("Colocando batata palha");
	}

	@Override
	public String getName() {
		return "Cachorro quente de linguiça";
	}

}
