package PacoteJava;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		int num;
		double raizq;
		double potencia = 0;
		
		System.out.println("Digite um número");
		num = leia.nextInt();
		
		if(num >= 0 && num%2==0) {
			raizq = Math.sqrt(num);
			System.out.printf("É par, e sua raiz quadrada é: %f",raizq);
		} else if(num > 0 && num%2 != 0) {
			potencia = Math.pow(num, 2);
			System.out.printf("É impar, e seu número ao quadrado é: %f",potencia);
		} else {
			System.out.printf("Digite um número positivo");
		}
	}
}
