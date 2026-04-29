package br.com.senaisp.bauru.richard.aula09;

public class Exemplo04For {

	public static void main(String[] args) {
		int i=0;
		for(;;) { //laço infinito
			System.out.println(i++);
			if (i==10) break;
		}
		//laço decrescente (o teste é enquanto j>0 )
		for(int j=10;j>0;j--) {
			System.out.println("J="+j);
		}
		System.out.println("For de 2 em 2");
		for (int j=0;j<=10;j+=2) {
			System.out.println(j);
		}
	}

}
