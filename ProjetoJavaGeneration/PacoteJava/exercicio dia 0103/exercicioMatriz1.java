package PacoteJava;

import java.util.Scanner;

public class exercicioMatriz1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);	
		int[][] matriz3 = new int[3][3];
		
		for(int i=0; i<matriz3.length; i++) {		
			for(int j=0; j<matriz3[i].length; j++) {
				System.out.println("Digite o valor da matriz: " + i + " " + j);
				matriz3[i][j]= leia.nextInt();				
			}			
		} 

		int cont=0;
		for(int i=0; i<matriz3.length; i++) {	
			for(int j=0; j<matriz3.length; j++) {
				
				if(matriz3[i][j] > 10) {
					
					cont++;
				}
				
			}			
		} 	System.out.printf("\n Existem %d números maiores que 10 ", cont);
		
	}

}
