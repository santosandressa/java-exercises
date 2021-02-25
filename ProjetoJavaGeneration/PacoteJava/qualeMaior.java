package PacoteJava;

import java.util.Scanner;

public class qualeMaior {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1> num3) {
			System.out.printf("Número: %d, é maior ", num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("Número: %d, é maior ", num2);
		} else if (num3 > num1 && num3 > num2){
			System.out.printf("Número: %d, é maior ", num3);
		}
	}
}
