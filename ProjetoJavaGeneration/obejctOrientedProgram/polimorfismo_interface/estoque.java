package polimorfismo_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class estoque {
	
	public static void main(String[] args) {
		
	try (Scanner leia = new Scanner(System.in)) {
		int stock;
		List <String> estoque = new ArrayList <String>();
		
		do {
			System.out.println("\nDigite uma opção: ");
			System.out.println("1 - Qual a produto deseja armazenar no estoque? ");
			System.out.println("2 - Qual produto deseja retirar do estoque? ");
			System.out.println("3 - Atualizar produtos do estoque");
			System.out.println("4 - Exibir estoque");
			System.out.println("5 - Sair do estoque");	
			stock = leia.nextInt();
			
		switch(stock)
		{
		case 1: 
			leia.nextLine();
			System.out.println("Produto que deseja armazenar: ");
			String products = leia.nextLine();
			estoque.add(products);
			break;
		case 2: 
			leia.nextLine();
			System.out.println("Produto que deseja retirar");
			String productsRemove =  leia.nextLine();
			
			if(estoque.contains(productsRemove)) 
			{
				estoque.remove(productsRemove);
			} else {
				System.out.println("Produto não encontrado");
			}
			break;
		case 3: 
			leia.nextLine();
			System.out.println("Produto que quer atualizar: ");
			String update = leia.nextLine();
			System.out.println("Qual o produto quer substituir " + update);
			String newProduct = leia.nextLine();
			if(estoque.contains(newProduct))
			{
				estoque.remove(update);
				estoque.add(newProduct);
			} else 
			{
				System.out.println("Produto não encontrado");
			}
			
			System.out.println(estoque);
			break;
		case 4:
			System.out.println("Os produtos do estoque: ");
			System.out.println(estoque);
			break;
		default:
			System.out.println("saiu do estoque");
		}
				
		} while(stock!=5);
	}
	
	}
	
}

