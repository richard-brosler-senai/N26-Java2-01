package br.com.senaisp.bauru.richard.aula05;

import javax.swing.JOptionPane;

public class Exemplo05 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		JOptionPane.showMessageDialog(null, "Olá " + nome + ", tudo bem?");
	}

}
