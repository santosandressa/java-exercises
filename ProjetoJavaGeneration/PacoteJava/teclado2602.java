package PacoteJava;

import java.util.Scanner;

public class teclado2602 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia =  new Scanner(System.in);
		int teclado,soma=0;
		
		System.out.println("Digite um número");
		teclado = leia.nextInt();
		
		
		do {
			
			soma = soma + teclado;
			
			System.out.println("Digite um número");
			teclado = leia.nextInt();
					
		}while(teclado!=0);
			
		System.out.printf("\nA soma é : %d ",soma);
	}
}

