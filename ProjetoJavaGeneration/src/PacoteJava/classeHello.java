package PacoteJava;

import java.util.Scanner;

public class classeHello {
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		String nome;
		
		System.out.println("Qual é o seu nome? ");
		nome = ler.next();
		
		System.out.println(nome);
		
	}
}
