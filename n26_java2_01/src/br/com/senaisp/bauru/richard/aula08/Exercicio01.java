package br.com.senaisp.bauru.richard.aula08;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o lado a: ");
		double a = sc.nextDouble();

		System.out.println("Entre com o lado b: ");
		double b = sc.nextDouble();
		
		System.out.println("Entre com o lado c: ");
		double c = sc.nextDouble();
		//colocar as formulas abaixo
		//Math.pow(b,2) 
		double delta = Math.pow(b,2) - 4 * a * c; 
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Delta: " + delta);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		sc.close();
	}

}
