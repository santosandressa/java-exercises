package obejctOrientedProgram;

public class airplane {
	
	private String nomeCliente;
	private int numeroPassagem;
	private int poltrona;
	private String classe;
	
	public airplane(String nomeCliente, int numeroPassagem, int poltrona, String classe)
	{
		this.nomeCliente = nomeCliente;
		this.numeroPassagem= numeroPassagem;
		this.poltrona = poltrona;
		this.classe = classe;	
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroPassagem() {
		return numeroPassagem;
	}

	public void setNumeroPassagem(int numeroPassagem) {
		this.numeroPassagem = numeroPassagem;
	}

	public int getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(int poltrona) {
		this.poltrona = poltrona;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome: "+ nomeCliente + "\nNúmero da Passagem: "+ numeroPassagem+ "\nPoltrona " + poltrona + "\nClasse: " + classe);
	}

}
