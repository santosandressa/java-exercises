package PacoteJava;

import java.util.Scanner;

public class idade2602 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia =  new Scanner(System.in);
		int idade,menor21=0, maior50=0;
		
		System.out.println("Entre com sua idade: ");
		idade = leia.nextInt();
		
		while(idade>=1 && idade<=99) {
			System.out.println("Entre com sua idade: ");
			idade = leia.nextInt();
			
			if(idade<21) {
				menor21++;
				
			} else if(idade>=50) {
				maior50++;	
			}		
		}
		System.out.printf("Pessoas menor de 21 anos: %d ", menor21);
		System.out.printf("\nPessoas maior que 50 anos: %d ", maior50);
	}
}
