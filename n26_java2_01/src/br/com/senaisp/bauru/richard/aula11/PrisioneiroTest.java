package br.com.senaisp.bauru.richard.aula11;

public class PrisioneiroTest {

	public static void main(String[] args) {
		Prisioneiro bubba = new Prisioneiro();
		Prisioneiro twitch = new Prisioneiro();
		System.out.println(bubba);
		System.out.println(twitch);
		//Atribuindo o endereço de memória do twitch no bubba
		//bubba = twitch;
		//Mostrando os valores
		System.out.println(bubba);
		System.out.println(twitch);
		//Atribuindo os valores
		bubba.setNome("Bubba");
		bubba.setAltura(2.08);
		bubba.setTempoDetencao(4);

		twitch.setNome("Twitch");
		twitch.setAltura(1.73);
		twitch.setTempoDetencao(3);
		//Alterando os valores para testar
		twitch.setNome("Bubba");
		twitch.setAltura(-1.5);
		twitch.setTempoDetencao(4);
		//Testando os valores
		if (twitch == bubba) {
			System.out.println("São Iguais");
		} else {
			System.out.println("São Diferentes");
		}//fim do if
		//Comparando objetos
		if (twitch.equals(bubba)) {
			System.out.println("São Iguais");
		} else {
			System.out.println("São Diferentes");
		}//fim do if
		System.out.println(bubba.mostrarDados());
		System.out.println(twitch.mostrarDados());
	}//fim do main
}//fim do class
