package br.com.senaisp.bauru.richard.aula05;

public class Exemplo02 {

	public static void main(String[] args) {
		int num1 = 128 * 2;
		byte num2 = (byte)num1; //forço ser byte 
		// Chamamos isso de cast
		System.out.println(num2);
		double num3 = 4.9;
		int num4 = (int)num3;
		System.out.println(num4);
	}

}
