package br.com.senaisp.bauru.richard.aula09;

import java.util.Scanner;

public class Exemplo03For {

	public static void main(String[] args) {
		//Utilizando for
		Scanner sc = new Scanner(System.in);
		double nota = 0;
		double media = 0;
		final int NUM_ALUNOS = 10;
		/*      +------------- Inicializador
		 *      |      +------ Condição    
		 *      |      |    +- Atualizador
		 *      |      |    |
		 *   +-----+ +---+ +-+
		     |     | |   | | |*/
		for (int i=1;i<=NUM_ALUNOS;i++) {
			System.out.println("Digite a nota do aluno "+i+":");
			nota = sc.nextDouble();
			media += nota;
		}//fim do for
		System.out.println("A media da classe foi " + 
							(media/NUM_ALUNOS));
		sc.close();
	}//fim do main
}//fim do class
