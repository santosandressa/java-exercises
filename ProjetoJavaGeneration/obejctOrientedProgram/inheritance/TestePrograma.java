package inheritance;

import java.util.Scanner;

public class TestePrograma {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
		
			double valorCredito, valorDivida;
			Fornecedor fornecedor = new Fornecedor();
			Empregado empregado = new Empregado();
			
						
			System.out.print("Nome: ");
			String nome  = leia.nextLine();
			fornecedor.setNome(nome);
			
			System.out.print("Endereço: ");
			String address = leia.nextLine();
			fornecedor.setAddress(address);
			
			System.out.print("Telefone: ");
			String telefone = leia.nextLine();
			fornecedor.setTelefone(telefone);
			
			System.out.print("Valor do crédito: ");
			valorCredito = leia.nextDouble();
			fornecedor.limparBuffer(leia);
			fornecedor.setValorCredito(valorCredito);
			
		
			System.out.print("Valor da divida: ");
			 valorDivida  = leia.nextDouble();
			 fornecedor.limparBuffer(leia);
			fornecedor.setValorDivida(valorDivida);
						
			fornecedor.exibirInfo();
			fornecedor.obterSaldo();
			
		
			System.out.println();
			System.out.print("Código do setor: ");
			int codigoSetor = leia.nextInt();
			empregado.setCodigoSetor(codigoSetor);
			
			leia.nextLine();
			System.out.print("\nSálario base: ");
			double salarioBase = leia.nextDouble();
			empregado.setSalarioBase(salarioBase);
	
			System.out.print("\nImpostos % : ");
			double imposto = leia.nextDouble();
			empregado.setImposto(imposto);
			
			empregado.calcularImposto();	
			
			      
		    }
		}
	
}

