package br.com.senaisp.bauru.richard.aula11;

public class Exemplo01 {

	public static void main(String[] args) {
		String s1 = new String("Teste");
		String s2 = new String("Teste");
		//Verificando se são iguais
		if (s1==s2) {
			System.out.println("São Iguais");
		} else {
			System.out.println("São Diferentes");
		}
		//Comparação correta de string
		if (s1.equals(s2)) {
			System.out.println("São Iguais");
		} else {
			System.out.println("São Diferentes");
		}
	}

}
