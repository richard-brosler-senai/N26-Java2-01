package br.com.senaisp.bauru.richard.aula04;

public class Exemplo02 {

	public static void main(String[] args) {
		int count = 15;
		int a, b, c, d;
		a = count++;
		b = count;
		c = ++count;
		d = count;
		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}

}
