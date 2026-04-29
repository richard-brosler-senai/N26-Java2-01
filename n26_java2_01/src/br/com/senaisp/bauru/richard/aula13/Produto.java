package br.com.senaisp.bauru.richard.aula13;

import java.util.Scanner;

public class Produto {
	private static int ultId = 0;
	//campos
	private int id;
	private String descricao;
	private double preco;
	//constructor padrão
	public Produto() {
		id = ++ultId;
		descricao = null;
		preco = 0;
	}
	public Produto(String descricao, double preco) {
		id = ++ultId;
		this.descricao = descricao;
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	
	public void editarDados(Scanner sc) {
		String desc;
		double prec;
		char conf;
		System.out.println("Digite a descrição: ");
		desc = sc.nextLine();
		System.out.println("Digite o preço: ");
		prec = sc.nextDouble();
		//capturando o enter do double
		sc.nextLine();
		System.out.println("Confirma edição? (S/N)");
		conf = sc.nextLine().charAt(0);
		if (conf=='S' || conf=='s') {
			setPreco(prec);
			setDescricao(desc);
		}//fim if
	}//fim edicao
	
	@Override
	public String toString() {
		return "Id : " + getId() + "\n"+
	           "Descrição : " + getDescricao() + "\n"+
			   "Preço : " + getPreco() + "\n";
	}//fim do toString
}//fim class
