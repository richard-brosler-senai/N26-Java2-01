package br.com.senaisp.bauru.richard.aula09;

public class LoopShape {
	static void createRectangle(int width, int height){
        //Draw a Rectangle
		for (int linha=0;linha<height;linha++) {
			for (int coluna=0;coluna<width;coluna++) {
				if (linha==0 || linha==height-1 || 
					coluna==0 || coluna== width-1 )
					System.out.print("#");
				else 
					System.out.print(" ");
			}//fim do for coluna
			System.out.println();
		}//fim do for linha
    }
    
    static void createTriangle(int leg){
    	for (int alt=0;alt<leg;alt++) {
    		for (int col=0;col<=alt;col++) {
    			if (alt==0 || alt==leg-1 || 
    				col==0 || col == alt )
    				System.out.print("#");
    			else
    				System.out.print(" ");
    		} //for col
    		System.out.println();
    	}//for alt
    }//fim metodo
}//fim class
