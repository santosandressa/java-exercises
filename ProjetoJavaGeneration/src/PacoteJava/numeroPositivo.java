package PacoteJava;

import java.util.Scanner;

public class numeroPositivo {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int numA, numB, numC, somaAb, somaBc;
		double r, s, d;
		
		System.out.println("Entre com o valor de A: ");
		numA= ler.nextInt();
		
		System.out.println("Entre com o valor de B: ");
		numB= ler.nextInt();
		
		System.out.println("Entre com o valor de C: ");
		numC= ler.nextInt();
		
		somaAb= numA + numB;
		somaBc= numB + numC;
		r = Math.pow(somaAb, 2);
		s = Math.pow(somaBc, 2);
		
		d = (r + s)/2;
		
		String resultado = "O resultado é: " + d;
		
		System.out.println(resultado);
	}

}
