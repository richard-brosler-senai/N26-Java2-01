package br.com.senaisp.bauru.richard.aula10;

import java.util.Random;
import java.util.Scanner;

public class PoupancaPovoTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(PoupancaPovoTeste.class.
				getResourceAsStream("nomes.txt"));
		Poupanca[] contas = new Poupanca[30];
		Random rnd = new Random();
		int idx = 0;
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			if (linha.trim().length()>0) {
				Poupanca conta = new Poupanca();
				contas[idx++] = conta;
				conta.setNomeCorrentista(linha);
				//1234.654972355
				//123465.0 /100.00
				//1234.65
				conta.setSaldo(Math.round(
								(rnd.nextInt(200_000) + 1 +
								 rnd.nextDouble())*100.00 
								)/100.00
						       );
				conta.setTaxaJuros(rnd.nextDouble());
			}//fim do if
		}//fim do while
		for (Poupanca pop : contas) {
			System.out.println(pop);
			System.out.println("=-".repeat(15));
		}//fim do for
		sc.close();
	}//fim do main
}//fim do class
