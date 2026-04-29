package br.com.senaisp.bauru.richard.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		            // 012345678901234
		            // RICHARD BROSLER
		            // aaaaaaa@aaa.vvv.dd
		String primeiroNome = nome.substring(0,nome.indexOf(" "));
		String sobreNome = nome.substring(nome.indexOf(" ")+1);
		
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		System.out.println("Seu sobrenome é: " + sobreNome);
		sc.close();
	}

}
