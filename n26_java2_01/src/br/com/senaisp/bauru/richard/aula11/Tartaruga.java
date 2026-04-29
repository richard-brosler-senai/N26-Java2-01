package br.com.senaisp.bauru.richard.aula11;

public class Tartaruga {
	private static int instancias = 0;//campo estático
	private static final int LIMITE = 10; //constante
	private int id;
	private String nome;
	private int idade;
	//constructor
	public Tartaruga(String nome, int idade) {
		if (instancias>=LIMITE) {
			//Criando um erro
			throw new RuntimeException("Limite Excedido!");
		}
		id = ++instancias;
		this.nome = nome;
		this.idade = idade;
	}
	//Métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "ID: " + id + "\n"+
			   "Nome: " + nome + "\n"+
			   "Idade: " + idade + "\n"+
			   "=-".repeat(15)+"\n";
	}
	public static int getInstancias() {
		return instancias;
	}
}
