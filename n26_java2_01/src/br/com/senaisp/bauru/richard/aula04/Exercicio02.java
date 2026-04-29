package br.com.senaisp.bauru.richard.aula04;

public class Exercicio02 {

	public static void main(String[] args) {
		int totOvos = 0;
		float mediaDiaria = 0, mediaMensal = 0, lucroMensal = 0;
		// Na Segunda-feira recolhe 100 ovos
		totOvos += 100;
		// Na Terça-feira recolhe 121 ovos
		totOvos += 121;
		// Na Quarta-feira recolhe 117 ovos
		totOvos += 117;
		// Calculando a média diária
		mediaDiaria = totOvos / 3.0f; //3 dias
		mediaMensal = mediaDiaria * 30; //estimar a média mensal
		lucroMensal = mediaMensal * 0.18f; //total de ganho
		System.out.println("Total de Ovos: " + totOvos);
		System.out.println("Média Diária de Ovos: " + mediaDiaria);
		System.out.println("Média Mensal de Ovos: " + mediaMensal);
		System.out.println("Lucro Médio Mensal de Ovos: " + lucroMensal);
	}

}
