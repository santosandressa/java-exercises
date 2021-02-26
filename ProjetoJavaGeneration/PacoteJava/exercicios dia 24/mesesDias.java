package PacoteJava;

import java.util.Scanner;

public class mesesDias {
	
	public static void main (String args[]){
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int totalDias, anos, meses, dias;
		
		System.out.println("Total de dias vividos:  ");
		totalDias = ler.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias%365) / 30;
		dias = (totalDias%365) % 30;

		System.out.printf("Eu tenho %d anos, %d meses, e %d dias", anos,meses,dias);
		
	}

}
