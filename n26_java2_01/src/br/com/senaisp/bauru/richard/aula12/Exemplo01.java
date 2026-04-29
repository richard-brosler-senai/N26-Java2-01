package br.com.senaisp.bauru.richard.aula12;

import java.util.ArrayList;

public class Exemplo01 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Richard");
		lista.add("Roberto");
		lista.add("Robson");
		//lista.remove(1); //removendo Roberto
		lista.add("Patricia");
		for (String it: lista) { //for-each
			System.out.println(it);
		}
		System.out.println(lista.size());
	}

}
