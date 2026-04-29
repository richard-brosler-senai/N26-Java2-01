package br.com.senaisp.bauru.richard.aula04;

public class ExemploIncremento {

	public static void main(String[] args) {
		int vlr = 6;
		//int newVlr = (vlr++);// ++ => vlr=vlr+1
		int newVlr = ++vlr;// ++ => vlr=vlr+1
		System.out.println(vlr);
		System.out.println(newVlr);
	}

}
