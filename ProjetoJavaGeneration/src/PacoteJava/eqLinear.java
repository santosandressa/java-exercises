package PacoteJava;

import java.util.Scanner;
public class eqLinear {

	public static void main(String[] args) {
		double A, B, C, D, E, F, x, y;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		  
		System.out.println("Digite o coeficiente A ");
		A = ler.nextDouble();
		System.out.println("Digite o coeficiente B ");
		B = ler.nextDouble();
		System.out.println("Digite o coeficiente C ");
		C = ler.nextDouble();
		System.out.println("Digite o coeficiente D ");
		D = ler.nextDouble();
		System.out.println("Digite o coeficiente E ");
		E = ler.nextDouble();
		System.out.println("Digite o coeficiente F ");
		F = ler.nextDouble();
		
		x = (C * E) - (B * F) / ( A * E) - (B * D);
		y = (A * F) - (C * D) / ( A * E) - (B * D);
		
		System.out.printf("O valor de x é: %f \nO valor de y é : %f ",x,y);

	}

}
