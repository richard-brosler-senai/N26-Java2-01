package br.com.senaisp.bauru.richard.aula05;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, 
				"Isto é somente uma mensagem, sem entrada", 
				"Titulo alterado 1", 
				JOptionPane.INFORMATION_MESSAGE);

		String input1 = (String) JOptionPane.showInputDialog(null, 
				"Qual seu idade?", 
				"Titulo alterado 2", 
				JOptionPane.QUESTION_MESSAGE, 
				null, null,
				"Type something here.");

		String[] acceptableValues = { "Choice 1", "Choice 2", "Choice 3" };
		String input2 = (String) JOptionPane.showInputDialog(null, 
				"Escolha somente a opção correta", 
				"Titulo alterado 3", 
				JOptionPane.WARNING_MESSAGE, null,
				acceptableValues, acceptableValues[1]);
		int idade = Integer.parseInt(input1);
		JOptionPane.showMessageDialog(null, "Em 2028 você terá " + 
				(idade + 2) + " anos",
				"Sua idade em 2028",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
