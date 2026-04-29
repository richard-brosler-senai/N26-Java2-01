package br.com.senaisp.bauru.richard.aula08;

import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma data no" + 
					" formato dd/mm/yyyy:");
		String data = sc.next();
		int dia = Integer.parseInt(data.substring(0, data.indexOf("/")));

		int mes = Integer.parseInt(data.substring(data.indexOf("/") + 1, data.lastIndexOf("/")));

		int ano = Integer.parseInt(data.substring(data.lastIndexOf("/") + 1));
		// Verificando se a data é válida
		boolean dtValida = true;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia < 1 || dia > 31)
				dtValida = false;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia < 1 || dia > 30)
				dtValida = false;
			break;
		case 2:
			if (dia < 1 || dia > 29)
				dtValida = false;
			else if (dia == 29 && ano % 4 != 0)
				dtValida = false;
			else if (dia == 29 && ano % 100 == 0 && 
					 ano % 400 != 0)
				dtValida = false;
			break;
		}
		if (dtValida)
			System.out.println("Data Válida");
		else
			System.out.println("Data Inválida");
		sc.close();
	}

}
