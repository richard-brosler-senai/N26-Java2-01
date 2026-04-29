package br.com.senaisp.bauru.richard.aula10;

public class Exercicio01 {

	public static void main(String[] args) {
		System.out.println("Imprimindo Quadrado:");
		quadrado(5);

		System.out.println("Imprimindo Triângulo retângulo à esquerda:");
		trianguloAEsquerda(5);
		
		System.out.println("Imprimindo Triângulo retângulo à direita:");
		trianguloADireita(5);
		
		System.out.println("Imprimindo Triângulo retângulo invertido à esquerda:");
		trianguloInvertidoEsquerda(5);
		
		System.out.println("Imprimindo Triângulo retângulo invertido à direita:");
		trianguloInvertidoDireita(5);
		
		System.out.println("Imprimindo dois Triângulos Isósceles espelhados:");
		trianguloDuplo(5);
	}
	/**
	 * Método que Imprime um Quadrado
	 * @param altura deve ser informada a altura
	 * Exemplo:
	 *      01234 col
     * lin 0#####
	 *     1#####
	 *     2#####
	 *     3#####
	 *     4#####
	 */
	public static void quadrado(int altura) {
		for (int lin=0;lin<altura;lin++) {
			for (int col=0;col<altura;col++) {
				System.out.print("#");
			}//fim for col
			System.out.println("");
		}//fim for lin
	}//fim metodo quadrado
	/**
	 * Método que imprime um triangulo retângulo à esquerda
	 * @param altura
	 * Exemplo:
	 *      01234 col
     * lin 0#    
	 *     1##
	 *     2###
	 *     3####
	 *     4#####
	 */
	public static void trianguloAEsquerda(int altura) {
		for (int lin=0;lin<altura;lin++) {
			for (int col=0;col<altura;col++) {
				if (col<=lin)
					System.out.print("#");
				else
					System.out.print(" ");
			}//fim for col
			System.out.println("");
		}//fim for lin
	}//fim do método trianguloAEsquerda
	/**
	 * Método que imprime um triangulo retângulo à direita
	 * @param altura
	 * Exemplo:
	 *      01234 col
     * lin 0    # 5 - 1 - 0 = 4
	 *     1   ## 5 - 1 - 1 = 3,4
	 *     2  ### 5 - 1 - 2 = 2,3,4
	 *     3 #### 5 - 1 - 3 = 1,2,3,4
	 *     4##### 5 - 1 - 4 = 0,1,2,3,4 
	 */
	public static void trianguloADireita(int altura) {
		for (int lin=0;lin<altura;lin++) {
			for (int col=0;col<altura;col++) {
				if (col>=altura-1-lin)
					System.out.print("#");
				else
					System.out.print(" ");
			}//fim for col
			System.out.println("");
		}//fim for lin
	}//fim do método trianguloADireita
	/**
	 * Método que imprime um triangulo retângulo invertido à Esquerda
	 * @param altura
	 * Exemplo:
	 *      01234 col
     * lin 0##### 4
	 *     1####  3
	 *     2###   2
	 *     3##    1
	 *     4#     0
	 */
	public static void trianguloInvertidoEsquerda(int altura) {
		for (int lin=0;lin<altura;lin++) {
			for (int col=0;col<altura;col++) {
				if (col<=altura-1-lin)
					System.out.print("#");
				else
					System.out.print(" ");
			}//fim for col
			System.out.println("");
		}//fim for lin
	}//fim do método trianguloInvertidoEsquerda
	/**
	 * Método que imprime um triangulo retângulo invertido à Direita
	 * @param altura
	 * Exemplo:
	 *      01234 col
     * lin 0#####
	 *     1 ####
	 *     2  ###
	 *     3   ##
	 *     4    #
	 */
	public static void trianguloInvertidoDireita(int altura) {
		for (int lin=0;lin<altura;lin++) {
			for (int col=0;col<altura;col++) {
				if (col>=lin)
					System.out.print("#");
				else
					System.out.print(" ");
			}//fim for col
			System.out.println("");
		}//fim for lin
	}//fim do método trianguloInvertidoDireita
	/**
	 * Método que imprime dois triângulos isósceles, um inverso ao outro
	 * @param altura
	 * Exemplo:
	 *      01234 col
     * lin 0##### 
	 *     1 ### 
	 *     2  #  
	 *     3 ### 
	 *     4#####
	 *     lin col altura # teste
	 *                      col>=lin || col>=altura-1-lin
	 *                                       col<=altura-1-lin || col<= lin
 	 *     0    0    5    # (0>=0 ou 0>=4) e (0<=4 ou 0<=0)
 	 *     0    1    5    # (1>=0 ou 1>=3) e (1<=4 ou 1<=0)
 	 *     0    2    5    # (2>=0 ou 2>=3) e (2<=4 ou 2<=0)
 	 *     0    3    5    # (3>=0 ou 3>=3) e (3<=4 ou 3<=0)
 	 *     0    4    5    # (4>=0 ou 4>=3) e (4<=4 ou 4<=0)
	 *     1    0    5      (0>=1 ou 0>=3) e (0<=3 ou 0<=1)
	 *     1    1    5    # (1>=1 ou 1>=3) e (1<=3 ou 1<=1)
	 */
	public static void trianguloDuplo(int altura) {
		for (int lin=0;lin<altura;lin++) {
			for (int col=0;col<altura;col++) {
				if ( (col>=lin || col>=altura-1-lin) && 
					 (col<=altura-1-lin || col<= lin) ) //Ajustar o teste para imprimir
					System.out.print("#");
				else
					System.out.print(" ");
			}//fim for col
			System.out.println("");
		}//fim for lin
	}//fim do método trianguloDuplo
}
