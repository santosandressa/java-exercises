package PacoteJava;

import java.util.Scanner;

public class tempoEvento {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int evento, horas, segundos, minutos;
		
		System.out.println(" Qual o tempo de duração do evento em horas?: ");
		evento = ler.nextInt();

		minutos = evento * 60;
		segundos = evento * 3600;
		horas = evento;
		
		System.out.printf("A duração do evento é de: %d horas, %d minutos, e %d segundos.", horas,minutos,segundos);
		
	}

}
