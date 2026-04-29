package br.com.senaisp.bauru.richard.aula11;

public class PrisioneiroTest02 {

	public static void main(String[] args) {
		Prisioneiro bubba = new Prisioneiro("Bubba",-2.08,4);
		Prisioneiro twitch = new Prisioneiro("Twitch",1.73,3);
		//imprimindo os prisioneiros
		System.out.println(bubba.mostrarDados());
		System.out.println(twitch.mostrarDados());
	}

}
