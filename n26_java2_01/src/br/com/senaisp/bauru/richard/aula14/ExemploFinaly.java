package br.com.senaisp.bauru.richard.aula14;

public class ExemploFinaly {

	public static void main(String[] args) {
		int vlr = 1;
		try {
			System.out.println(vlr); //usa para depurar
			vlr = 1 / vlr;
		} finally {
			System.out.println("Vou ser impresso mesmo com erro!");
		}
		System.out.println("Fim do programa!");
	}

}
