package br.com.senaisp.bauru.richard.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.senaisp.bauru.richard.classes.ConectorBancoDados;

public class ConectorBancoDadosTest {

	public static void main(String[] args) {
		try {
			ConectorBancoDados conectorBD = 
					ConectorBancoDados.getInstancia();
			Connection conn = conectorBD.getConnection();
			String sql = "INSERT INTO produto(descricao,preco,saldo)"
					+ " values(?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			//Passando os valores
			stmt.setString(1, "Produto 1");
			stmt.setDouble(2, 15.40);
			stmt.setInt(3, 50);
			//Executando o comando
			int numLinhas = stmt.executeUpdate();
			System.out.println("Foram afetadas " + numLinhas + 
					" Linhas");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
