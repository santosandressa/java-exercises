package obejctOrientedProgram;

import java.util.Scanner;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico produto = new ProdutoEletronico();
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		System.out.println("Qual produto eletrônico: ");
		produto.eletronico = leia.next();

		System.out.println("Qual valor: ");
		produto.valor = leia.nextDouble();

		produto.info();
	}

}
