package br.com.senaisp.bauru.richard.aula14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		try {
			int vlr = sc.nextInt();
			System.out.println("Valor digitado foi " + vlr);
			int res = 1 / vlr;
			System.out.println("A conta de 1/" + vlr + " = " + res);
		} catch (InputMismatchException e) {
			System.out.println("O valor deve ser inteiro!");
		} catch (ArithmeticException e) {
			System.out.println("Divisão por zero!");
		}
		System.out.println("Fim do programa!");
		sc.close();
	}

}
