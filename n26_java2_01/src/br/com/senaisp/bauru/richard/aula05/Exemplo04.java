package br.com.senaisp.bauru.richard.aula05;

public class Exemplo04 {

	public static void main(String[] args) {
		//Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice, taxRate, gibberish;
        shirtPrice = "15";
        taxRate = "0.05";
        gibberish = "887ds7nds87dsfs";
        //Parse shirtPrice and taxRate, and print the total tax
        double totalTax = Integer.parseInt(shirtPrice) * 
        				  Double.parseDouble(taxRate);
        System.out.println("Total Tax: " + totalTax);
        //Try to parse taxRate as an int
        System.out.println(Integer.parseInt(taxRate)); //vai dar erro
        //Try to parse gibberish as an int
        System.out.println(Integer.parseInt(gibberish)); //vai dar erro
	}
}