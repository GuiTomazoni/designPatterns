package br.com.fundatec.ifood;

import br.com.fundatec.ifood.Pedido.Builder;

public class App {
	public static void main(String[] args) {
		
		try {
			Builder builder = Pedido.builder();
			Pedido pedido = builder.comComida(Comida.PIZZA)
					.comBebida(Bebida.COCA_COLA)
					.comEntrega(TaxaDeEntrega.CAVALHADA)
					.Pagamento(Pagamento.CARTAO_CREDITO)
					.build();
			
			System.out.println("Seu pedido foi realizado");
			System.out.println("Comida: " + pedido.getComida());
			System.out.println("Bebida: " + pedido.getBebida());
			System.out.println("Taxa de entrega: " + pedido.getTaxaDeEntrega());
			System.out.println("Pagamento: " + pedido.getPagamento());
			
			pedido.receberPedido();
			pedido.preparar();
			pedido.embalar();
			pedido.entregar();
			
			
		} catch (Exception e) {
			System.out.println("Pedido inválido: " + e.getMessage());
		}
	}
}
