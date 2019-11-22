package br.com.fundatec.ifood;

public enum TaxaDeEntrega {

	IPANEMA(10.00),
	CAMPO_NOVO(6.00),
	VILA_NOVA(5.00),
	CAVALHADA(8.00);
	
	private double valor;
	
	TaxaDeEntrega(double valor){
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
}
