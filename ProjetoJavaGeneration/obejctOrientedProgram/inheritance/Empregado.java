package inheritance;



public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado() {
		super();
	}

	public Empregado(String nome, String address, String telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, address, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	public void calcularImposto() {
		this.imposto = salarioBase * (imposto /100);
		this.salarioBase = salarioBase - imposto;
		System.out.print("\nR$" + imposto + " reais de imposto");
		System.out.print("\nSeu novo salário é: R$" + salarioBase + " reais");
	}
	
	
}
