package PacoteJava;

import java.util.Scanner;

public class exercicioVetor2 {

	public static void main(String[] args) {
		int[] num = new int[6];
		int somaPar=0, impar=0;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		for (int i=0; i<num.length; i++) {
			System.out.println("Digite um n�mero");
			num[i] = leia.nextInt();
			
			if(num[i]%2==0) {
				System.out.println("O n�mero: " + num[i] + " � par...");
			somaPar = somaPar + num[i];
			} else {
				System.out.println("O n�mero: " + num[i] + " � �mpar...");
			impar++;
			}
		} System.out.println("\nSoma dos pares: " + somaPar);
			System.out.println("Quantidade de �mpares: " + impar);
	}
}
