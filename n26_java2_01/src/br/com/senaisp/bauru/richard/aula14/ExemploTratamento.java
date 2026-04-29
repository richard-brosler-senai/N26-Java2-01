package br.com.senaisp.bauru.richard.aula14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTratamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vlr;
		do {
			System.out.println("Digite um valor entre 0 e 100:");
			try {
				vlr = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Valor deve ser inteiro!");
				vlr = -1;
				sc.nextLine();
			}
		} while (vlr<0 || vlr>100);
		System.out.println("Fim do programa");
		sc.close();
	}

}
