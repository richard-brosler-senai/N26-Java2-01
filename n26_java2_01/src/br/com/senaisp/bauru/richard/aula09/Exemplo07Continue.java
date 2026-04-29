package br.com.senaisp.bauru.richard.aula09;

public class Exemplo07Continue {

	public static void main(String[] args) {
		//Exemplo com continue
		for(int i=0;i<5;i++) {
			if (i==3) continue; //salta para a linha 7
			System.out.println(i);
		}//fim for
		System.out.println("-".repeat(15));
		//Exemplo com break
		for(int i=0;i<5;i++) {
			if (i==3) break; //salta para final do for
			System.out.println(i);
		}//fim for
	}//fim main
}//fim class
