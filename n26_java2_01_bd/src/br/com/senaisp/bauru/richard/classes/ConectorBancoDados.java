package br.com.senaisp.bauru.richard.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectorBancoDados {
	private static ConectorBancoDados instancia = null;
	private String connStr;
	private Connection conn;
	//Constructor
	private ConectorBancoDados() throws SQLException {
		connStr = "jdbc:sqlite:c:\\javalibs\\dados\\banco.db";
		//criando a conexão com banco de dados
		conn = DriverManager.getConnection(connStr);
		//Criar e verificar a estrutura do banco de dados
		criarEstrutura();
	}
	private void criarEstrutura() {
		String tabela = """
				CREATE TABLE IF NOT EXISTS produto(
					id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
					descricao VARCHAR(100) NOT NULL,
					saldo NUMERIC(15,2) NOT NULL,
					preco NUMERIC(15,2) NOT NULL
				);
				""";
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(tabela);
		} catch(Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			e.printStackTrace();
		}
	}
	//Isso é chamado  pattern Singleton
	public static ConectorBancoDados getInstancia() 
			throws SQLException {
		if (instancia == null) {
			instancia = new ConectorBancoDados();
		}
		return instancia;
	}
	
	public String getConnStr() {
		return connStr;
	}
	
	public Connection getConnection() {
		return conn;
	}
}
