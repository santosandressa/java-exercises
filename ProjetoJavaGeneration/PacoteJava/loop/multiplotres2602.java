package PacoteJava;

import java.util.Scanner;

public class multiplotres2602 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia =  new Scanner(System.in);
		
		int num, soma=0, cont=0;
		double media=0;
		
		System.out.println("Digite um número");
		num = leia.nextInt();
		
		
		do {
			
			if(num!=0) 
			{
				if(num%3==0) {
				soma = soma + num;
				cont++;
				}
			}
				
		}while(num != 0);
		
		if(cont==0){
			System.out.printf("\nnão existe divisão por 0");
		}else {
			media= soma/cont;
			System.out.printf("A média é: %f", media);
		}
		
	
		
		
	}		

}
