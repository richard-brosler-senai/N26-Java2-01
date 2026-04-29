package br.com.senaisp.bauru.richard.aula11;

import java.util.Random;
import br.com.senaisp.bauru.richard.aula06.Carta;

public class Baralho {
	private Carta[] cartas;
	private Random rnd;
	private int cartasASortear;
	//Constructor
	public Baralho() {
		rnd = new Random();
		cartas = new Carta[Carta.NAIPES.length * 
		                   Carta.NUMEROS.length];
		cartasASortear = cartas.length;
		//criando as cartas 0 a 51 
		for(int i=0;i<cartas.length;i++) {
			cartas[i] = new Carta(i/Carta.NUMEROS.length,
								  i%Carta.NUMEROS.length);
		}//fim do for
	}//fim do constructor
	
	public Carta sortearCarta() {
		Carta ret = null;
		if (cartasASortear>0) {
			int idx = rnd.nextInt(cartasASortear);
			ret = cartas[idx];
			//Permuta da última carta com a indice sorteado
			cartas[idx] = cartas[cartasASortear-1];
			cartas[cartasASortear-1] = ret;
			//diminuir as cartas a sortear
			cartasASortear--;
		}//fim do if
		return ret;
	}//fim do sortearCarta
}//fim da class
