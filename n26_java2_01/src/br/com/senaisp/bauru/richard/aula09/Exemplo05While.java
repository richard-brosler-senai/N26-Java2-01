package br.com.senaisp.bauru.richard.aula09;

public class Exemplo05While {

	public static void main(String[] args) {
		int i=0;
		while(i<10) {//o teste é feito antes de entrar no ciclo
			System.out.println(i++);
		}
		//Equivalente em for
		for(int j=0;j<10;j++) {
			System.out.println(j);
		}
	}

}
