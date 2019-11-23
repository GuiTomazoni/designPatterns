package br.com.fundatec.factory;

import br.com.fundatec.factory.comida.DogDeLinguica;
import br.com.fundatec.factory.comida.DogNormal;

public class Rosario extends Restaurante{

	@Override
	protected DogFactory receberPedido(String lanche) {
		switch (lanche) {
		case "salsicha":
			return new DogNormal();
		case"linguiça":
			return new DogDeLinguica();
		}
		return null;
	}

}
