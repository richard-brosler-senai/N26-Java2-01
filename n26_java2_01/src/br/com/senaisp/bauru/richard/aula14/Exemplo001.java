package br.com.senaisp.bauru.richard.aula14;

public class Exemplo001 {

	public static void main(String[] args) {
		int vlr = 0;
		try {
			vlr = 1 / vlr;
		}catch(Exception e) {
			System.out.println("erro:" + e.getMessage());
		//}catch(ArithmeticException e) { //isso não pode
			//porque o mais genérico é o último a ser colocado
		}
		//A forma correta do try acima
		try {
			vlr = 1 / vlr;
		}catch(ArithmeticException e) { 
			System.out.println("erro de Operação aritmética:" + 
								e.getMessage());
		}catch(Exception e) {
			System.out.println("erro Genérico:" + 
								e.getMessage());
		}
		
	}

}
