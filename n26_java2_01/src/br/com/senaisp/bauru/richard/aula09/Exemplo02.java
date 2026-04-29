package br.com.senaisp.bauru.richard.aula09;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 10:");
		int vlr = sc.nextInt();
		switch (vlr) {
		case 1 ->
			System.out.println("Você ganhou um lápis");
		case 2 -> {
			System.out.println("Você ganhou uma caneta");
			System.out.println("Oba!!!");
		}
		case 3 ->
			System.out.println("Você ganhou uma régua");
		case 4 ->
			System.out.println("Você ganhou uma borracha");
		case 5 ->
			System.out.println("Você ganhou uma calculadora");
		case 6 ->
			System.out.println("Você ganhou um compasso");
		case 7 ->
			System.out.println("Você ganhou um transferidor");
		case 8 ->
			System.out.println("Você ganhou um esquadro");
		case 9 ->
			System.out.println("Você ganhou um caderno");
		case 10 ->
			System.out.println("Você ganhou uma bolsa");
		default ->
			System.out.println("Você perdeu tudo!!");
		}// fim do switch
		sc.close();
	}

}
