package br.com.senaisp.bauru.richard.aula08;

import java.util.Random;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner numberScanner = new Scanner(System.in);
		System.out.print("Informe um número entre 1 e 10: ");
		int userNum = numberScanner.nextInt();
		Random rnd = new Random();
		int winningNum = rnd.nextInt(10) + 1;
		System.out.println("Seu Número:"+userNum);
		System.out.println("O número vencedor é:"+ winningNum);
		numberScanner.close();
	}

}
