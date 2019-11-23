package br.com.fundatec.factory;


public abstract class Restaurante {

	public DogFactory pedirDog(String lanche) {
		
		DogFactory dog = receberPedido(lanche);
		dog.preparar();
		dog.montar();
		
		return dog;
	}
	
	protected abstract DogFactory receberPedido(String lanche);
}
