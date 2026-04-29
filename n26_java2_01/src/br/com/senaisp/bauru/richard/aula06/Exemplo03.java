package br.com.senaisp.bauru.richard.aula06;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		//Agora vamos usar o scanner para ler arquivo
		Scanner sc = new Scanner(
				Exemplo03.class.getResourceAsStream("MOCK_DATA.csv"));
		//Extraindo o cabeçalho
		String linha = sc.nextLine();
		//substitui na impressão a , por um tab
		System.out.println(linha.replace(",", "\t")); 
		while (sc.hasNextLine()) { //verifica se há próxima linha
			linha = sc.nextLine(); //obtendo a próxima linha do arquivo
			Scanner ap = new Scanner(linha); //quebrando a linha por ,
			ap.useDelimiter(","); //indica o delimitador para usar o next
			do {
				String item = ap.next(); //obtem o próximo bloco separado por ,
				System.out.print(item + "\t"); //CUIDADO é print e não println
			} while(ap.hasNext()); //enquanto tiver próximo conjunto
			ap.close(); //fecho o apoio
			System.out.println(); //pulo uma linha no final do texto
		}
		sc.close();//fecho o arquivo
	}

}
