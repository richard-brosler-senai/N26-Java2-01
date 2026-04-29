package br.com.senaisp.bauru.richard.aula08;

import java.util.Random;

public class Exemplo03 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int vlr = rnd.nextInt(3);
		if (vlr==0) {
			System.out.println("pedra");
		} else if (vlr==1) {
			System.out.println("papel");
		} else {
			System.out.println("tesoura");
		}
	}

}
