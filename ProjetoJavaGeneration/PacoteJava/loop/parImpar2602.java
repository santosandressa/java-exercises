package PacoteJava;

import java.util.Scanner;

public class parImpar2602 {

	public static void main(String[] args) {
		
		int i=10,num=0, par=0, impar=0;
		
		@SuppressWarnings("resource")
		Scanner leia =  new Scanner(System.in);
		
			
		for(i=0; i<=10; i++) {
			System.out.println("\nDigite um n�mero");
			num = leia.nextInt();
			
			if(num%2==0) {
				par++;
			
			} else {
				impar++;
			}	
		}
		System.out.printf("\n%d n�meros s�o pares", par);
		System.out.printf("\n%d n�meros s�o �mpares", impar-1);
	}

}
