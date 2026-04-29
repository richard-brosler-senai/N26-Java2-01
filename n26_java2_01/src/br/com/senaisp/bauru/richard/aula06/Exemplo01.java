package br.com.senaisp.bauru.richard.aula06;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		//useLocale força o scanner a usar o padrão de números e horas
		//do local indicado
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine(); 
		String sobrenome = sc.next(); //vai até o token que é espaço em branco
		System.out.println("Seu nome completo é " + nome + " " + sobrenome);
		//Capturando valores com o scanner
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Você nasceu no ano " + (2026 - idade));
		System.out.println("Digite o valor de um salgado na cantina: ");
		double valor = sc.nextDouble();
		System.out.println("O valor do salgado na cantina é " + valor);
		
		
		sc.close();
	}

}
