package br.com.fundatec.ifood;

public enum Comida {

	HAMBURGUER("Hamburguer"),
	PIZZA("Pizza"),
	XIS("Xis"),
	CACHORRO_QUENTE("Cachorro quente"),
	FAST_FOOD("Fast food");
	
	private String titulo;
	
	Comida(String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
}
