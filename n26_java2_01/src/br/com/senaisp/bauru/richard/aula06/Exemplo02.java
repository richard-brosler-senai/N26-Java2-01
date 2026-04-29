package br.com.senaisp.bauru.richard.aula06;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Digite seu nome: ");
		//se ocorrer nextInt, nextDouble ou algum comando com esses
		//o scanner lança o enter para a prima linha
		//para evitar o problema, usamos um nextline antes
		sc.nextLine(); //para capturar o enter
		String nome = sc.nextLine(); //recebendo o enter, ele já passa para
		//o proximo comando.
		System.out.println("Olá " + nome + " você nasceu em " + (2026 - idade));
		
		sc.close();
	}

}
