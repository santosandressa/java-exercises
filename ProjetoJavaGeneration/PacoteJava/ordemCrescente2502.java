package PacoteJava;

import java.util.Scanner;

public class ordemCrescente2502 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3;

		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = ler.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.printf("%d %d %d", num1, num2, num3);
		} else if (num1 < num3 && num3 < num2) {
			System.out.printf("%d %d %d", num1, num3, num2);
		} else if (num2 < num1 && num1 < num3) {
			System.out.printf("%d %d %d", num2, num1, num3);
		} else if (num2 < num3 && num3 < num1) {
			System.out.printf("%d %d %d", num2, num3, num1);
		} else if (num3 < num1 && num1 < num2) {
			System.out.printf("%d %d %d", num3, num1, num2);
		} else if (num3 < num2 && num2 < num1) {
			System.out.printf("%d %d %d", num3, num2, num1);
		} else {
			System.out.printf("Digite valores diferentes");
		}
	}
}