package br.com.senaisp.bauru.richard.aula06;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		//Calculando a pessoa 1
		calc.setPrecoOriginal(10);
		System.out.println("Pessoa 1: " + calc.encontrarTotal());

		calc.setPrecoOriginal(12);
		System.out.println("Pessoa 2: " + calc.encontrarTotal());
		
		calc.mostrarPercGorjeta();
		calc.setGorjeta(10);
		calc.mostrarPercGorjeta();
	}

}
