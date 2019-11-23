package br.com.fundatec.factory.comida;

import br.com.fundatec.factory.DogFactory;

public class DogNormal extends DogFactory {

	@Override
	public void preparar() {
		System.out.println("Pegando o pão");
		System.out.println("Colocando em um saquinho");
	}

	@Override
	public void montar() {
		System.out.println("Colocando o molho");
		System.out.println("Colocando salsicha");
		System.out.println("Adicionando maionese e queijo ralado");
		System.out.println("Colocando batata palha");
	}

	@Override
	public String getName() {
		return "Cachorro quente";
	}

}
