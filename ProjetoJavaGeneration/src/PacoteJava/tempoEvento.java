package PacoteJava;

import java.util.Scanner;

public class tempoEvento {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int evento, horas, segundos, minutos, horario;
		
		System.out.println(" Qual o tempo de dura��o do evento em horas?: ");
		evento = ler.nextInt();

		minutos = evento * 60;
		segundos = evento * 3600;
		horas = evento;
		
		String resultado = "A dura��o do evento � de: " + horas + " horas, ou " + minutos + " minutos, ou " + segundos +" segundos.";

		System.out.println(resultado);
		
	}

}
