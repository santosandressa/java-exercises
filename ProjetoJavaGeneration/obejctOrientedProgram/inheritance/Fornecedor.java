package inheritance;

import java.util.Scanner;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(String nome, String address, String telefone, double valorCredito, double valorDivida) {
		super(nome, address, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public void limparBuffer(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
        }
	}
	
	public void exibirInfo() {
		System.out.print("\nNome: " + this.getNome());
		System.out.print("\nEndereço: " + this.getAddress());
		System.out.print("\nTelefone: " + this.getTelefone());
	}
	
	public void obterSaldo() {
		this.valorCredito = valorCredito - valorDivida;
		System.out.println("\nSeu saldo é de: " + valorCredito);
	}
	

}
