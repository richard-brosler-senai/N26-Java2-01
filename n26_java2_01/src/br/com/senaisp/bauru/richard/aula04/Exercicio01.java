package br.com.senaisp.bauru.richard.aula04;

public class Exercicio01 {

	public static void main(String[] args) {
		int totalEggs = 0, eggsPerChicken = 4, chickenCount = 8;
		//Na Segunda-feira 
		totalEggs = eggsPerChicken * chickenCount;
		//Na Terça-feira, ganha uma galinha
		//totalEggs = totalEggs + (eggsPerChicken * ++chickenCount); //uso do pré-incremento
		totalEggs += eggsPerChicken * ++chickenCount; //uso do pré-incremento
		//Na Quarta-feira, um animal come metade das galinhas
		totalEggs += eggsPerChicken * ( chickenCount / 2 );
		//Total de Ovos
		System.out.println("Total de Ovos: " + totalEggs);
		final double PI ;
		PI = 1515;
	}

}
