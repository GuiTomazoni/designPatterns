package br.com.fundatec.ifood;

import br.com.fundatec.factory.DogFactory;
import br.com.fundatec.factory.HamburguerFactory;
import br.com.fundatec.factory.PizzaFactory;
import br.com.fundatec.factory.PizzaHut;
import br.com.fundatec.factory.Restaurante;
import br.com.fundatec.factory.Rosario;
import br.com.fundatec.factory.Severo;
import br.com.fundatec.ifood.Pedido.Builder;

public class App {
	public static void main(String[] args) {
		
		try {
			
			Restaurante severo = new Severo();
			HamburguerFactory hamburguerCheedar = severo.pedirComida("cheedar");
			
			Builder builder = Pedido.builder();
			Pedido hamburguer = builder.comComida(hamburguerCheedar)
					.comBebida(Bebida.CERVEJA)
					.comEntrega(TaxaDeEntrega.CAVALHADA)
					.Pagamento(Pagamento.CARTAO_CREDITO)
					.build();
			
			informacoesDoPedido(hamburguer);
			
			System.out.println("");
			
			Restaurante pizzaHut = new PizzaHut();
			PizzaFactory pizzaCalabresa = pizzaHut.pedirComida("calabresa");
			
			builder = Pedido.builder();
			Pedido pizza = builder.comComida(pizzaCalabresa)
					.comBebida(Bebida.COCA_COLA)
					.comEntrega(TaxaDeEntrega.VILA_NOVA)
					.Pagamento(Pagamento.DINHEIRO)
					.build();
			
			informacoesDoPedido(pizza);
			
			System.out.println("");
			
			Restaurante rosario = new Rosario();
			DogFactory dogLinguica = rosario.pedirComida("linguiça");
			
			builder = Pedido.builder();
			Pedido dog = builder.comComida(dogLinguica)
					.comBebida(Bebida.GUARANA_ANTARTICA)
					.comEntrega(TaxaDeEntrega.IPANEMA)
					.Pagamento(Pagamento.CARTAO_DEBITO)
					.build();
			
			informacoesDoPedido(dog);

			
			
		} catch (Exception e) {
			System.out.println("Pedido inválido: " + e.getMessage());
		}
		
	}
	
	public static void informacoesDoPedido(Pedido pedido) {
		System.out.println("===== Seu pedido está pronto ======");
		System.out.println("Bebida: " + pedido.getBebida());
		System.out.println("Taxa de entrega: " + pedido.getTaxaDeEntrega());
		System.out.println("Pagamento: " + pedido.getPagamento());	
	}
}
