package br.com.senaisp.bauru.richard.aula10;

public class PoupancaTest {

	public static void main(String[] args) {
		Poupanca pop01 = new Poupanca();
		pop01.setSaldo(150_000.00);
		pop01.setTaxaJuros(1.50);
		pop01.setNomeCorrentista("Joaquim");
		
		System.out.println(pop01);
	}

}
