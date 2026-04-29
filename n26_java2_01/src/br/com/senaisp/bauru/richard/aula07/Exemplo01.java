package br.com.senaisp.bauru.richard.aula07;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		a = a.concat("12");
		a = a + 12; 
		System.out.println(a);
		String textoa = new String("Java");
		String textob = "Java";
		//esse teste de igualdade na String
		//compara endereço de memória das variáveis
		//não o conteúdo (String é um objeto)
		System.out.println(textoa == textob);
		System.out.println(textoa.equals(textob));
	}

}
