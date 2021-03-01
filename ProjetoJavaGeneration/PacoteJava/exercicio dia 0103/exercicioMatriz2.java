package PacoteJava;

import java.util.Scanner;

public class exercicioMatriz2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		float[][] valorA= new float[2][2];
		float[][] valorB= new float[2][2];
		float[][] valorC= new float[2][2];
		float constante=0;
					
			for(int i=0; i<valorA.length; i++) {
				for(int j=0; j<valorA.length; j++) {
					System.out.println("Digite o valor da primeira Matriz: ");
					valorA[i][j]= leia.nextFloat();
				}
			}
			
			for(int i=0; i<valorB.length; i++) {
				for(int j=0; j<valorB.length; j++) {
					System.out.println("Digite o valor da segunda Matriz:  ");
					valorB[i][j]= leia.nextFloat();
				}
			}  
			System.out.println("Escolha | 1 - Soma | | 2 - Subtração | | 3 - Adicionar Constante | ");
			int op = leia.nextInt();
			
			while(op<1 || op>3) {
				System.out.println("Escolha | 1 - Soma | | 2 - Subtração | | 3 - Adicionar Constante | ");
				op = leia.nextInt();
			}
			
			switch(op) 
			{
			case 1: 
				for(int i=0; i<valorC.length; i++) 
				{
					for(int j=0; j<valorC.length; j++) 
					{
						valorC[i][j] = valorA[i][j] + valorB[i][j];
						System.out.println("Soma: " + valorC[i][j]);
					}
				}
				break;
			case 2: 
				for(int i=0; i<valorC.length; i++) 
				{
					for(int j=0; j<valorC.length; j++) 
					{
						valorC[i][j] = valorB[i][j] - valorA[i][j] ;
						System.out.println("Subtração: " + valorC[i][j]);
					}
				} break;
			case 3: 
				System.out.println("Digite o valor da constante: ");
				constante = leia.nextFloat();
				for(int i=0; i<valorA.length; i++) 
				{
					for(int j=0; j<valorA.length; j++) 
					{
					constante = constante + valorA[i][j];	
					System.out.print("\n valor da soma da Constante: " + constante);
					}
				}
				
				for(int i=0; i<valorB.length; i++) {
					for(int j=0; j<valorB.length; j++) {
						constante= constante + valorB[i][j];
						System.out.print("\n Valor da soma da Constante: " + constante);
					}
				}
				
			}
			
			System.out.print("\nValor A: ");
			for(int i=0; i<valorA.length; i++) {
				for(int j=0; j<valorA[i].length; j++) {
					System.out.print(valorA[i][j] +" - " );
				}
			}
			
			System.out.print("\nValor B: ");
			for(int i=0; i<valorB.length; i++) {
				for(int j=0; j<valorB[i].length; j++) {
					System.out.print(valorB[i][j] +" - " );
				}
			} 
	 }
}
