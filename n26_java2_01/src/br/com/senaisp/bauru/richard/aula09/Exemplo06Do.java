package br.com.senaisp.bauru.richard.aula09;

import java.util.Scanner;

public class Exemplo06Do {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vlr;
		do {
			System.out.println("Digite um valor entre 1 e 10:");
			vlr = sc.nextInt();
		}while (vlr<1 || vlr>10);
		System.out.println("Fim");
		sc.close();
	}

}
