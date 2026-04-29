package br.com.senaisp.bauru.richard.aula12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		int op;
		do {
			mostrarMenu();
			System.out.println("Escolha uma opção: ");
			op = sc.nextInt();
			//para capturar o enter depois do inteiro
			sc.nextLine();
			switch(op) {
			case 1 -> inserirItens(sc,lista);
			case 2 -> listarItens(sc,lista);
			case 3 -> consultarItens(sc,lista);
			case 4 -> alterarItens(sc,lista);
			case 5 -> excluirItens(sc,lista);
			case 6 -> listarItensDesc(sc,lista);
			}
		}while (op!=9);
		sc.close();
	}

	private static void excluirItens(Scanner sc, ArrayList<String> lista) {
		int id = pesquisarItem(sc, lista);
		if (id>=0) {
			System.out.println("Item encontrado na posição " + id);
			System.out.println("Deseja Excluir? (S/N)");
			char op = sc.nextLine().charAt(0);
			if (op=='S' || op=='s') {
				lista.remove(id); //removendo o item
				System.out.println("Item excluído com sucesso!");
			}//fim do if op
		}//fim do if id
		System.out.println("Digite algo e o enter para continuar");
		sc.nextLine();		
	}//fim do excluirItens

	private static void alterarItens(Scanner sc, ArrayList<String> lista) {
		int id = pesquisarItem(sc, lista);
		if (id>=0) {
			System.out.println("Item encontrado na posição " + id);
			System.out.println("Deseja alterar? (S/N)");
			char op = sc.nextLine().charAt(0);
			if (op=='S' || op=='s') {
				System.out.println("Digite o valor a ser alterado: ");
				String vlr = sc.nextLine();
				lista.set(id, vlr); //substituindo o item
				System.out.println("Item alterado com sucesso!");
			}//fim do if op
		}//fim do if id
		System.out.println("Digite algo e o enter para continuar");
		sc.nextLine();
	}//fim do alterarItens

	private static void consultarItens(Scanner sc, ArrayList<String> lista) {
		int id = pesquisarItem(sc, lista);
		if (id>=0) {
			System.out.println("Item encontrado na posição " 
								+ id);
			System.out.println(lista.get(id));
		}
		System.out.println("Digite algo e depois enter "
							+ "para continuar");
		sc.nextLine();
	}

	private static void listarItensDesc(Scanner sc, ArrayList<String> lista) {
		List<String> listaRev = lista.reversed();
		ListIterator<String> it = listaRev.listIterator();
		System.out.println("Listando Itens Decrescente");
		System.out.println("-".repeat(15));
		while (it.hasNext()) {
			System.out.println(it.next());
		}//fim while
		System.out.println("-".repeat(15));
		System.out.println("Precione algo e dê enter para continuar");
		sc.next();
	}//fim listaItensDesc

	private static void listarItens(Scanner sc, ArrayList<String> lista) {
		Iterator<String> it = lista.iterator();
		System.out.println("Listando itens");
		System.out.println("-".repeat(15));
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-".repeat(15));
		System.out.println("Precione algo e dê enter para continuar");
		sc.next();
	}

	private static void inserirItens(Scanner sc, ArrayList<String> lista) {
		char op;
		do {
			System.out.println("Digite o item a ser"
					+ " colocado na lista:");
			String it = sc.nextLine();
			lista.add(it);
			System.out.println("Deseja adicionar mais? (S/N)");
			op = sc.nextLine().charAt(0);
		}while (op=='S' || op=='s');
	}

	private static void mostrarMenu() {
		System.out.println("Menu");
		System.out.println("1 - Inserir Itens");
		System.out.println("2 - Listar Itens");
		System.out.println("3 - Consultar Itens");
		System.out.println("4 - Alterar Itens");
		System.out.println("5 - Excluir Itens");
		System.out.println("6 - Listar Itens Decrescente");
		System.out.println("9 - Fim");
	}

	private static int pesquisarItem(Scanner sc, 
			ArrayList<String> lista) {
		System.out.println("Digite o item a ser pesquisado:");
		String it = sc.nextLine();
		int ret = lista.indexOf(it);
		if (ret<0) {
			System.out.println("Item não encontrado!");
		}
		return ret;
	}
}
