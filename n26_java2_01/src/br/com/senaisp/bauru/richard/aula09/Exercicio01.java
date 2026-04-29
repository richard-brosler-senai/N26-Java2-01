package br.com.senaisp.bauru.richard.aula09;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		String senhaMaster = "JavaDuke";
		Scanner sc = new Scanner(System.in);
		int tentativas = 0;
		String senhaDig;
		do {
			System.out.println("Digite a senha master: ");
			senhaDig = sc.nextLine();
			if (!senhaDig.equals(senhaMaster)) {
				tentativas++;
				System.out.println("Senha inválida!"
						+ " Redigite!");
			}//fim if
		}while(!senhaDig.equals(senhaMaster) && 
									tentativas<3);
		if (tentativas>=3) {
			System.out.println("Acesso Bloqueado!");
		} else {
			System.out.println("Acesso Permitido!");
		}//fim if
		sc.close();
	}//fim main
} //fim class
