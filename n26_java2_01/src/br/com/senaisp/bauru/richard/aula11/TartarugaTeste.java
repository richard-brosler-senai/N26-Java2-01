package br.com.senaisp.bauru.richard.aula11;

public class TartarugaTeste {

	public static void main(String[] args) {
		System.out.println(Tartaruga.getInstancias());
		for (int i=0;i<11;i++) {
			Tartaruga tar = 
				new Tartaruga("Tartaruga-"+(i+1), 100+i);
			System.out.println(tar);
		}
		System.out.println(Tartaruga.getInstancias());
	}

}
