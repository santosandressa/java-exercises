package PacoteJava;

import java.util.Scanner;

public class qualMaior {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if(num1 > num2 && num1> num3) {
			System.out.printf("N�mero: %d, � maior ", num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.printf("N�mero: %d, � maior ", num2);
		} else if (num3 > num1 && num3 > num2){
			System.out.printf("N�mero: %d, � maior ", num3);
		}
	}
}
