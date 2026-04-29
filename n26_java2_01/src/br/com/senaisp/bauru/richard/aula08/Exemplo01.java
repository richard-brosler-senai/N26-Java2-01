package br.com.senaisp.bauru.richard.aula08;

import java.util.Random;

public class Exemplo01 {

	public static void main(String[] args) {
		Random rnd = new Random();
		double chance = rnd.nextDouble();
		if (chance>0.50) {
			System.out.println("inferior " + chance);
		} else {
			System.out.println("superior " + chance);
		}
	}

}
