package br.com.senaisp.bauru.richard.aula07;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		/* Solicitar um e-mail, separar o e-mail e o domínio 
		 * Exemplo: abc.def@mail.com ficará:
		 * e-mail = acb.def
		 * dominío = mail.com
		 * Solicitar a entrada via JoptionPane.showInput
		 * Mostra o dominio e o e-mail usando JoptionPane.showmessage
		 * */
		String mail = JOptionPane.showInputDialog("Digite seu e-mail");
		String email = mail.substring(0,mail.indexOf("@"));
		String dominio = mail.substring(mail.indexOf("@")+1);
		JOptionPane.showMessageDialog(null,
							"E-mail : " + email + "\nDomínio:" + 
							dominio);
	}

}
