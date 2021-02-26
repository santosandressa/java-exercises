package PacoteJava;

import java.util.Scanner;

public class numeroPositivo {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double numA, numB, numC, somaAb, somaBc;
		double r, s, d;
		
		System.out.println("Entre com o valor de A: ");
		numA= ler.nextDouble();
		
		System.out.println("Entre com o valor de B: ");
		numB= ler.nextDouble();
		
		System.out.println("Entre com o valor de C: ");
		numC= ler.nextDouble();
		
		somaAb= numA + numB;
		somaBc= numB + numC;
		r = Math.pow(somaAb, 2);
		s = Math.pow(somaBc, 2);
		
		d = (r + s)/2;
		
		
		System.out.printf("O resultado é: %f", d);
	}

}
