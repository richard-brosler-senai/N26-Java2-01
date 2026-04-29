package br.com.senaisp.bauru.richard.aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 valores inteiros: ");
		int soma = sc.nextInt();
		soma += sc.nextInt();
		soma += sc.nextInt();
		System.out.println("Soma dos 3 números é " + soma);
		sc.close();
	}

}
