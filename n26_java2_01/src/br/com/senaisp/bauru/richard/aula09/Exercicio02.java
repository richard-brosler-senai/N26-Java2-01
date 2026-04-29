package br.com.senaisp.bauru.richard.aula09;

public class Exercicio02 {

	public static void main(String[] args) {
		int lmt=5;
		for (int lin=0;lin<lmt;lin++) {
			for (int col=0;col<lmt;col++) {
				if (col>=lmt-lin-1)
					System.out.print("#");
				else
				    System.out.print(" ");
			}//fim for col
			System.out.println();
		}//fim for lin
	}//fim main
}//fim class
