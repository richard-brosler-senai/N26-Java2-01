package br.com.senaisp.bauru.richard.aula06;

public class Calculadora {
	private double imposto = 0.05;
	private double gorjeta = 0.15;
	private double precoOriginal = 10;
	
	public void mostrarPercGorjeta() {
		System.out.println(gorjeta);
	}
	
	public double encontrarTotal() {
		return Math.round(precoOriginal * 
							(1 + imposto + gorjeta)*100) / 100.00;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getPrecoOriginal() {
		return precoOriginal;
	}

	public void setPrecoOriginal(double precoOriginal) {
		this.precoOriginal = precoOriginal;
	}

	public void setGorjeta(double gorjeta) {
		this.gorjeta = gorjeta;
	}
}
