package br.com.senaisp.bauru.richard.aula09;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 10:");
		int vlr = sc.nextInt();
		switch (vlr) {
		case 1:
			System.out.println("Você ganhou um lápis");
			break;
		case 2:
			System.out.println("Você ganhou uma caneta");
			break;
		case 3:
			System.out.println("Você ganhou uma régua");
			break;
		case 4:
			System.out.println("Você ganhou uma borracha");
			break;
		case 5:
			System.out.println("Você ganhou uma calculadora");
			break;
		case 6:
			System.out.println("Você ganhou um compasso");
			break;
		case 7:
			System.out.println("Você ganhou um transferidor");
			break;
		case 8:
			System.out.println("Você ganhou um esquadro");
			break;
		case 9:
			System.out.println("Você ganhou um caderno");
			break;
		case 10:
			System.out.println("Você ganhou uma bolsa");
			break;
		default:
			System.out.println("Você perdeu tudo!!");
		}// fim do switch
		sc.close();
	}// fim do main
}// fim do class
