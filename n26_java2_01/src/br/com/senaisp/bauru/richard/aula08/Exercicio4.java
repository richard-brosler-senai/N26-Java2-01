package br.com.senaisp.bauru.richard.aula08;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = sc.next();
		String palavraSecreta = "Java";
		//Comparação de Strings
		if (palavra.equals(palavraSecreta)) { 
			System.out.println("Acertou a palavra!");
		} else {
			System.out.println("Xiiii, não foi dessa vez!");
		}
		sc.close();
	}

}
