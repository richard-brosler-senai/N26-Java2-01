package br.com.senaisp.bauru.richard.aula07;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		/* Solicite uma expressão matemática de 
		 * uma operação de soma de inteiros, ou seja, 
		 * possua 2 números e um operador + 
		 * você deve separar os dois operandos
		 * para somar.
		 * use substring para separar os numeros 
		 * converta com Integer.parseInt() e some-os 
		 * Exemplo: 5+3 ou 5 + 3 deve resultar em 8 
		 * Para solicitar pode usar JoptionPane ou Scanner */
		String exp = JOptionPane.
				showInputDialog("Digite a expressão: ");
		//"2+5"
		int op01 = Integer.parseInt(exp.substring(0,exp.indexOf("+"))); //falta separar
		int op02 = Integer.parseInt(exp.substring(exp.indexOf("+")+1)); //falta separar
		JOptionPane.showMessageDialog(null, "A soma de "+
		       op01 + " + " + op02 + " = " + (op01+op02));
		JOptionPane.showMessageDialog(null, "Texto" + 1+2);
		
	}

}
