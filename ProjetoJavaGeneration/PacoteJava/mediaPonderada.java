package PacoteJava;

import java.util.Scanner; 

public class mediaPonderada {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		int peso1 = 2, peso2 = 3, peso3 = 5;
		
		System.out.println("Escreva a sua primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Escreva a sua segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Escreva a sua terceira nota: ");
		nota3 = ler.nextDouble();
		
		media = ((nota1 * peso1) + ( nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

		System.out.printf("A sua média ponderada é de: %f ",media);
				
	}
	
}
