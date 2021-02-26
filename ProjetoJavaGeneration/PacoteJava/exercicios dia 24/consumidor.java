package PacoteJava;

import java.util.Scanner;

public class consumidor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double custoFabrica, custoConsumidor, distribuidor, impostos;
		
		System.out.println("Qual o custo de fabrica?");
		custoFabrica = ler.nextDouble();
		
		distribuidor = custoFabrica * (28 / 100.0);
		impostos = custoFabrica * (45 / 100.0);
		
		custoConsumidor = custoFabrica + distribuidor + impostos;  
		
		System.out.println(custoConsumidor);

	}

}
