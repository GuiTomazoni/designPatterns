package br.com.fundatec.ifood;

public class Pedido extends Lanche {

	private Bebida bebida;
	private Comida comida;
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
		
		public Builder comComida(Comida comida) {
			pedido.comida = comida;
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
			if(pedido.bebida == null) {
				throw new Exception("Bebida não informada");
			}
			if(pedido.comida == null) {
				throw new Exception("Comida não informada");
			}
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
			return "null";
		}
		return bebida.getTitulo();
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}

	public String getComida() {
		if(comida == null) {
			return "null";
		}
		return comida.getTitulo();
	}

	public void setComida(Comida comida) {
		this.comida = comida;
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

	@Override
	public void receberPedido() {
		System.out.println("Recebendo o pedido");
	}

	@Override
	public void preparar() {
		System.out.println("Preparando Pedido");
	}

	@Override
	public void embalar() {
		System.out.println("Embalando para não esfriar");
	}

	@Override
	public void entregar() {
		System.out.println("Entregador saiu para entrega");
	}
}
