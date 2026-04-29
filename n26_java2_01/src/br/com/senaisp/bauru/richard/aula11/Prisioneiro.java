package br.com.senaisp.bauru.richard.aula11;

public class Prisioneiro {
	//Propriedades - Campos - Fields
	private String nome;
	private double altura;
	private double tempoDetencao;
	//Constructor
	public Prisioneiro() {
		
	}
	//Overload de método (métodos com o mesmo nome, porém
	//Argumentos diferentes)
	public Prisioneiro(String nom, double alt, double temp) {
		nome = nom;
		altura = alt;
		tempoDetencao = temp;
	}
	//Métodos - Comportamentos
	public void pensar() {
		System.out.println("Ha ha ha. Roubar é divertido!");
	}
	//Alterando a forma como o equals se comporta
	//Polimorfismo
	@Override
	public boolean equals(Object obj) {
		return this.nome.equals( ((Prisioneiro) obj).nome );
	}
	public String mostrarDados() {
		return "Nome: " + nome + "\n"+
			   "Altura: " + altura + "\n" + 
			   "Sentença: " + tempoDetencao + " anos\n";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura<0) {
			System.out.println(
				"Erro! Altura deve ser maior que zero!");
		} else {
			this.altura = altura;
		}
	}
	public double getTempoDetencao() {
		return tempoDetencao;
	}
	public void setTempoDetencao(double tempoDetencao) {
		this.tempoDetencao = tempoDetencao;
	}
}
