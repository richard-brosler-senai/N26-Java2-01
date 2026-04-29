package br.com.senaisp.bauru.richard.aula06;

public class Carta {
	public static final String[] NAIPES = {"♦","♠","♥","♣"};
	public static final String[] NUMEROS = {"A","2","3","4","5",
										    "6","7","8","9","10","J",
										    "Q", "K" };
	private String naipe;
	private String numero;
	private int valor;
	//Constructor
	public Carta(int naipe, int numero) {
		setNaipe(naipe);
		setNumero(numero);
	}
	
	@Override
	public String toString() {
		String ret = "┌─────┐\n"
				   + "│##   │\n"
				   + "│  &  │\n"
				   + "│   ##│\n"
				   + "└─────┘\n";
		ret = ret.replaceFirst("##", numero + 
				(numero.equals("10") ? "" : " "));
		ret = ret.replace("&", naipe);
		ret = ret.replaceFirst("##", 
				(numero.equals("10") ? "" : " ") + numero);
		return ret;
	}

	public String getNaipe() {
		return naipe;
	}

	private void setNaipe(int naipe) {
		if (naipe<0 || naipe> NAIPES.length-1) {
			throw new RuntimeException(
					"Naipe deve ser entre 0 e 3");
		}
		this.naipe = NAIPES[naipe];
	}

	public String getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		if (numero<0 || numero>NUMEROS.length-1) {
			throw new RuntimeException(
					"Número deve ser entre 0 e 12");
		}
		this.numero = NUMEROS[numero];
		//operador ternário, mesmo que if
		setValor(numero>9 ? 10 : numero + 1);
	}

	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}
	
}
