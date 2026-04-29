package br.com.senaisp.bauru.richard.aula12;

import java.util.ArrayList;

public class Exemplo02 {

	public static void main(String[] args) {
		//para usar int
		ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
		//para usar double
		ArrayList<Double> listaDouble = new ArrayList<Double>();
		//para usar float
		ArrayList<Float> listaFloat = new ArrayList<Float>();
		//adicionando itens (autoboxing)
		listaInteiros.add(1);
		listaDouble.add(2.5);
		listaFloat.add(2.6f);
		//obter itens unboxing
		for(Integer it: listaInteiros) {
			int ele = it; //unboxing
			System.out.println(ele);
		}
		for(Double it: listaDouble) {
			double ele = it; //unboxing
			System.out.println(ele);
		}
		for(Float it: listaFloat) {
			float ele = it; //unboxing
			System.out.println(ele);
		}
		
	}

}
