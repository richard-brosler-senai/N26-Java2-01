package br.com.senaisp.bauru.richard.teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import br.com.senaisp.bauru.richard.classes.Produto;

public class ProdutoTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			mostrarMenu();
			System.out.println("Escolha uma opção: ");
			op = sc.nextInt();
			// para capturar o enter depois do inteiro
			sc.nextLine();
			switch (op) {
			case 1 -> inserirItens(sc);
			case 2 -> listarItens(sc);
			case 3 -> consultarItens(sc);
			case 4 -> alterarItens(sc);
			case 5 -> excluirItens(sc);
			}
		} while (op != 9);
		sc.close();
	}

	private static void excluirItens(Scanner sc) {
		Produto pr = pesquisarItem(sc);
		if (pr != null) {
			System.out.println(pr);
			System.out.println("Tem certeza que quer excluir? (S/N)");
			char opc = sc.nextLine().charAt(0);
			if (opc=='S' || opc=='s') {
				pr.apagar();
			}
		} else {
			System.out.println("Item não encontrado!");
		}
		System.out.println("Digite algo e depois enter "
							+ "para continuar");
		sc.nextLine();	
	}

	private static void alterarItens(Scanner sc) {
		Produto pr = pesquisarItem(sc);
		if (pr != null) {
			editarDados(sc,pr);
		} else {
			System.out.println("Item não encontrado!");
		}
		System.out.println("Digite algo e depois enter "
							+ "para continuar");
		sc.nextLine();	
	}

	private static void consultarItens(Scanner sc, ArrayList<Produto> lista) {
		int id = pesquisarItem(sc, lista);
		if (id>=0) {
			System.out.println("Item encontrado na posição " 
								+ id);
			System.out.println(lista.get(id));
		} else {
			System.out.println("Item não encontrado!");
		}
		System.out.println("Digite algo e depois enter "
							+ "para continuar");
		sc.nextLine();
	}

	private static int pesquisarItem(Scanner sc, ArrayList<Produto> lista) {
		int pos = -1, idx=0;
		Iterator<Produto> it = lista.iterator();
		System.out.println("Digite a descrição a ser "
				+ "pesquisada:");
		String desc = sc.nextLine();
		while (it.hasNext() && pos==-1) {
			Produto pr = it.next();
			if (pr.getDescricao().equalsIgnoreCase(desc)) {
				pos=idx;
			}//fim do if
			idx++;
		}//fim do while
		return pos;
	}//fim pesquisa

	private static void listarItens(Scanner sc, ArrayList<Produto> lista) {
		System.out.println("Listagem Produtos");
		System.out.println("=-".repeat(10));
		System.out.println("Id\tDescr.\tPreço");
		for (Produto pr : lista) {
			System.out.print(pr.getId()+"\t");
			System.out.print(pr.getDescricao()+"\t");
			System.out.print(pr.getPreco()+"\n");
		}//fim do for
		System.out.println("=-".repeat(10));
		System.out.println("Digite enter para continuar");
		sc.next();
	}//fim do listarItens

	private static void inserirItens(Scanner sc, ArrayList<Produto> lista) {
		char cont;
		do {
			Produto pr = new Produto();
			pr.editarDados(sc);
			if (pr.getDescricao()!=null && 
				!pr.getDescricao().isEmpty()) {
				lista.add(pr);
			}//fim if
			System.out.println("Deseja continuar? (S/N)");
			cont = sc.nextLine().charAt(0);
		} while (cont == 'S' || cont == 's'); //fim while
	}//fim inserir

	private static void mostrarMenu() {
		System.out.println("Menu");
		System.out.println("1 - Inserir Itens");
		System.out.println("2 - Listar Itens");
		System.out.println("3 - Consultar Itens");
		System.out.println("4 - Alterar Itens");
		System.out.println("5 - Excluir Itens");
		System.out.println("9 - Fim");
	}

}
