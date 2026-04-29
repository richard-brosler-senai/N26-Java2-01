package br.com.senaisp.bauru.richard.aula08;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 10:");
		int valor = sc.nextInt();
		//Operador % é resto da divisão
		if (valor % 2 == 0) {
			System.out.println("O valor " + valor + " é Par");
		} else {
			System.out.println("O valor " + valor + " é Impar");
		}
		sc.close();
	}

}
