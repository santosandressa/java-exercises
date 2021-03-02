package obejctOrientedProgram;

public class ProdutoEletronico {

	String eletronico;
	double valor;
	
	
	public ProdutoEletronico(String eletronico, double valor) {
		this.eletronico = eletronico;
		this.valor = valor;
	}

	public ProdutoEletronico() {
	}

	public String getEletronico() {
		return eletronico;
	}

	public void setEletronico(String eletronico) {
		this.eletronico = eletronico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void info() {
		System.out.println("\nDevice: " + eletronico + " R$: " + valor);
	}
}
