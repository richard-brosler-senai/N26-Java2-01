package br.com.senaisp.bauru.richard.aula08;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		boolean drivingUnderAge = idade < 18;
		System.out.println("Pode dirigir? ");
		if (drivingUnderAge) {
			System.out.println("Não pode");
		} else {
			System.out.println("Pode");
		}
		sc.close();
	}

}
