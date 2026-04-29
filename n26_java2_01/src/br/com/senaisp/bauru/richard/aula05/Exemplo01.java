package br.com.senaisp.bauru.richard.aula05;

public class Exemplo01 {

	public static void main(String[] args) {
		int num1 = 55_555;
		int num2 = 66_666;
		long num3;
		num3 = num1 * (num2 * 1L); //Realizo promoção automatica
		//             |--------| => inteiro => longo
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(num3);
		System.out.println(num3 - Integer.MAX_VALUE);
		System.out.println(num1 * num2);
		System.out.println(Integer.MIN_VALUE + (num3 - Integer.MAX_VALUE));
		System.out.println(Integer.MAX_VALUE + 1);
		
	}

}
