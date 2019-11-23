package br.com.fundatec.ifood;

import br.com.fundatec.factory.comida.Comida;

public class Pedido {

	private Bebida bebida;
	private Pagamento pagamento;
	private TaxaDeEntrega taxaDeEntrega;

	public Pedido() {

	}

	public static Builder builder() {
		return new Pedido().new Builder();
	}

	public class Builder {
		Pedido pedido;

		public Builder() {
			this.pedido = new Pedido();
		}
		
		public Builder comBebida(Bebida bebida) {
			pedido.bebida = bebida;
			return this;
		}
		
		public Builder Pagamento(Pagamento pagamento) {
			pedido.pagamento = pagamento;
			return this;
		}
		
		public Builder comEntrega(TaxaDeEntrega taxaDeEntrega) {
			pedido.taxaDeEntrega = taxaDeEntrega;
			return this;
		}
		
		public Pedido build() throws Exception {
			
			if(pedido.pagamento == null) {
				throw new Exception("Pagamento não informado");
			}
			if(pedido.taxaDeEntrega == null) {
				throw new Exception("Taxa de entrega não informada");
			}
			return pedido;
		}
	}
	

	public String getBebida() {
		if(bebida == null) {
			return "sem bebida";
		}
		return bebida.getTitulo();
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public String getPagamento() {
		if(pagamento == null) {
			return "null";
		}
		return pagamento.getTitulo();
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public double getTaxaDeEntrega() {
		if(taxaDeEntrega == null) {
			return 0.0;
		}
		return taxaDeEntrega.getValor();
	}

	public void setTaxaDeEntrega(TaxaDeEntrega taxaDeEntrega) {
		this.taxaDeEntrega = taxaDeEntrega;
	}

}
