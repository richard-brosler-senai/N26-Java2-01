package br.com.senaisp.bauru.richard.aula10;

public class Poupanca {
	//Campos / Fields / Propriedades
	private double saldo;
	private double taxaJuros;
	private String nomeCorrentista;
	//Constructor

	// métodos / comportamentos
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	@Override
	public String toString() {
		return "Nome Correntista: " + nomeCorrentista + "\n"+
	           "Saldo: " + saldo + "\n"+
			   "Taxa Juros: " + taxaJuros;
	}
}
