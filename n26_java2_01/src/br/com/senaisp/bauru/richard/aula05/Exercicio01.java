package br.com.senaisp.bauru.richard.aula05;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		//Criar um JOptionPane.
        //Guardar a entrada em uma string e mostrar o valor.
        String valor = JOptionPane.showInputDialog("Digite um valor:");
        JOptionPane.showMessageDialog(null, "Valor digitado: " + valor);
        
        //Converter a entrada em inteiro.
        //Imprimir valor +1
        int vlr = Integer.parseInt(valor) + 1;
        JOptionPane.showMessageDialog(null, "Valor acrescido em 1: " + vlr);
        
        //Tente criar um diálog, converter a entrada em inteiro e 
		// mostrar esse valor em uma única linha
		// usando somente um ;.
        JOptionPane.showMessageDialog(null, "Valor convertido: " + 
        		Integer.parseInt(
        			JOptionPane.showInputDialog("Digite outro valor:")));
	}

}
