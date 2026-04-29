package br.com.senaisp.bauru.richard.aula05;

import javax.swing.JOptionPane;

public class Exemplo06 {

	public static void main(String[] args) {
		String msg = (String) JOptionPane.showInputDialog(
				null, //Componente parente
				"Digite um valor: ", //Mensagem
				"Título da Janela", //Título
				JOptionPane.INFORMATION_MESSAGE,//Indicador do tipo de mensagem 
				null, //Ícone da Janela
				null, //Opções para escolher
				"Valor padrão"); //Valor default (padrão)
		JOptionPane.showMessageDialog(null, msg);
		String[] times = {"Corinthians","Palmeiras","São Paulo","Santos"};
		String[] favoritos = new String[times.length];
		for (int i=0;i<4;i++) 
		{
			String time = (String) JOptionPane.showInputDialog(
					null, //Componente parente
					"Escolha seu "+(i+1)+"º time favorito: ", //Mensagem
					"Escolha de Time", //Título
					JOptionPane.INFORMATION_MESSAGE,//Indicador do tipo de mensagem 
					null, //Ícone da Janela
					times, //Opções para escolher
					"Corinthians"); //Valor default (padrão)
			JOptionPane.showMessageDialog(null, time);

		}
		System.out.println("Times favoritos por ordem de escolha:");
		for (int i=0;i<favoritos.length;i++) {
			System.out.println(favoritos[i]);
		}
	}

}
