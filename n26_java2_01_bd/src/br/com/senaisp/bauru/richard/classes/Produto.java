package br.com.senaisp.bauru.richard.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Produto {
	private int id;
	private String descricao;
	private Double preco;
	private int saldo;
	private ConectorBancoDados bd;
	//constructor
	public Produto(ConectorBancoDados bd) {
		id = 0;
		descricao = null;
		preco = 0.0;
		saldo = 0;
		this.bd = bd;
	}
	public Produto(ConectorBancoDados bd, String desc, 
			    double preco, int saldo) {
		id = 0;
		descricao = desc;
		this.preco = preco;
		this.saldo = saldo;
		this.bd = bd;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getId() {
		return id;
	}
	public ConectorBancoDados getBd() {
		return bd;
	}
	private void setId(int value) {
		id = value;
	}
	//Criando o insert de dados (C - do Crud)
	public static Produto criarProduto(ConectorBancoDados bd) {
		Produto ret = new Produto(bd);
		return ret;
	}
	public static Produto criarProduto(ConectorBancoDados bd,
			String descricao, double preco, int saldo) {
		Produto ret = new Produto(bd, descricao, preco, saldo);
		return ret;
	}
	//Criando o read de dados (R - do Crud)
	public static Produto getProduto(ConectorBancoDados bd, 
			int id) {
		Produto ret = new Produto(bd);
		ret.carregarProduto(id);
		return ret;
	}
	private void carregarProduto(int id) {
		Connection conn = bd.getConnection();
		String sql = "select id, descricao, preco, saldo from "
				+ "produto where id=?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				this.id = rs.getInt(1);
				descricao = rs.getString(2);
				preco = rs.getDouble(3);
				saldo = rs.getInt(4);
			} else {
				throw new RuntimeException("Registro não encontrado!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Listar produtos
	public static ArrayList<Produto> 
		listarProdutos(ConectorBancoDados bd) {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		String sql = "select id, descricao, preco, saldo from "
				+ "produto order by id";
		try {
			PreparedStatement stmt = 
					bd.getConnection().prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto pr = new Produto(bd,rs.getString(2), 
										 rs.getDouble(3),
										 rs.getInt(4));
				pr.setId(rs.getInt(1));
				lista.add(pr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
