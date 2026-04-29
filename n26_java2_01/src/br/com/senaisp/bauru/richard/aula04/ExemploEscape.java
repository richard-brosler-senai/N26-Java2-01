package br.com.senaisp.bauru.richard.aula04;

public class ExemploEscape {

	public static void main(String[] args) {
		String mensagem = "O aluno disse \"Olá pessoal!\"";
		System.out.println(mensagem);
		mensagem = "1234567\t1234\t56789\t0123456";
		System.out.println(mensagem);
		mensagem = "\t1\t2\t3";
		System.out.println(mensagem);
		System.out.println("Oi\npessoal\ntudo bem?");
		System.out.print("Linha 1\n");
		System.out.print("Linha 2");
	}

}
