package br.com.senaisp.bauru.richard.aula12;

import java.util.Scanner;

import br.com.senaisp.bauru.richard.aula06.Carta;
import br.com.senaisp.bauru.richard.aula11.Baralho;

public class BlackJack {

	public static void main(String[] args) {
		Baralho bar = new Baralho();
		Scanner sc = new Scanner(System.in);
		Carta[] banca = new Carta[2];
		int totBanca, totPlayer;
		String nomePlayer;
		//Primeiro, Sorteamos as cartas da banca
		banca[0] = bar.sortearCarta();
		banca[1] = bar.sortearCarta();
		totBanca = banca[0].getValor() + banca[1].getValor();
		//vamos ao jogo
		totPlayer=0;
		System.out.println("Digite o nome do jogador: ");
		nomePlayer = sc.nextLine();
		//Primeira carta
		Carta ct = bar.sortearCarta();
		System.out.println(ct);
		totPlayer += ct.getValor();
		//Segunda carta
		ct = bar.sortearCarta();
		System.out.println(ct);
		totPlayer += ct.getValor();
		char conf;
		do {
			System.out.println(
					"Deseja mais uma carta? (S/N)");
			conf = sc.nextLine().charAt(0);
			if (conf=='S' || conf=='s') {
				ct = bar.sortearCarta();
				totPlayer+=ct.getValor();
				System.out.println(ct);
			}//fim se
		} while ( totPlayer<=21 && 
				  (conf=='S' || conf=='s') ); //fim while
		sc.close();
		//verificando quem ganhou
		if (totPlayer<=21 && totPlayer>totBanca) {
			System.out.println(nomePlayer + " venceu!");
		} else if (totPlayer==totBanca) {
			System.out.println("Empate!");
		} else {
			System.out.println(nomePlayer+" você perdeu!");
		}
		System.out.println("Cartas da Banca:");
		System.out.println(banca[0]);
		System.out.println(banca[1]);
	}//fim main
}//fim class
