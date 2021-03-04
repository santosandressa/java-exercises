package polimorfismo_interface;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica= new Preguica();
		
		try (Scanner leia = new Scanner(System.in)) {
			
			
			System.out.print("Qual é o seu bichinho de estimação? ");
			System.out.print("|1 - Cachorro| 2 - Cavalo| 3 - Preguiça| ");
			int especie = leia.nextInt();
			
			@SuppressWarnings("unused")
			Animal animal = null;
			animal = cachorro;
			
			do {
				
			if (especie==1) {
				System.out.print("Qual o nome do seu doggo?");
				String nome = leia.next();
				System.out.print("Idade?");
				int idade = leia.nextInt();
				String som = null;
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Som(som);
				cachorro.Corre();
			}
			
			if (especie==2) {
				System.out.print("Qual o nome do Cavalo?");
				String nome = leia.next();
				System.out.print("Idade?");
				int idade = leia.nextInt();
				String som = null;
				cavalo.Nome(nome);
				cavalo.Idade(idade);
				cavalo.Som(som);
				cavalo.Corre();
			}
			if (especie==3) {
				System.out.print("Qual o nome da Preguiça?");
				String nome = leia.next();
				System.out.print("Idade?");
				int idade = leia.nextInt();
				String som = null;
				preguica.Nome(nome);
				preguica.Idade(idade);
				preguica.Som(som);
				preguica.Subir();
			}
			}while(especie<=0 || especie>3);
			
		
	
		
		
}
	}
}