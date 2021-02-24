package PacoteJava;

import java.util.Scanner;

public class entradaSaida {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int a,b,soma;
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Entre com o valor de B: 5");
		b = ler.nextInt();
		
		soma = a + b;
		System.out.println(soma);
		

	}

}
