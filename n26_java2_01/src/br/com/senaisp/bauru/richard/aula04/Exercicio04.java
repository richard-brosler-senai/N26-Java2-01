package br.com.senaisp.bauru.richard.aula04;

public class Exercicio04 {

	public static void main(String[] args) {
		String nomeCliente, descItem, mensagem;
		//Montando o texto
		nomeCliente = "Alex";
		descItem = "Camiseta";
		
		double preco, imposto, quantidade, totalPreco;
		preco = 89.50;
		quantidade = 3;
		imposto = 0.18;
		totalPreco = preco * quantidade * (1 + imposto);
		
		mensagem = nomeCliente + " quer comprar " + quantidade + " " + descItem;
		System.out.println(mensagem);
		System.out.println("Total a ser pago: " + totalPreco);
	}

}
