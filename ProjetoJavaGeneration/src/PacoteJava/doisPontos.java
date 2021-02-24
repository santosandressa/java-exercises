package PacoteJava;

import java.util.Scanner;

public class doisPontos {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		double  x1, y1, x2, y2, distancia, potencia;
		
		System.out.println("Qual é o primeiro valor de x?: ");
		x1 = ler.nextDouble();
		
		System.out.println("Qual é segundo valor de x?: ");
		x2 = ler.nextDouble();
		
		System.out.println("Qual é o primeiro valor de y?: ");
		y1 = ler.nextDouble();
	
		System.out.println("Qual é o segundo valor de y2?: ");
		y2 = ler.nextDouble();
		
		potencia = Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2);
		distancia = Math.sqrt(potencia);
		
		String resultado = 	"A distancia é de " + distancia;
		
		System.out.println(resultado);
	
	}

}
