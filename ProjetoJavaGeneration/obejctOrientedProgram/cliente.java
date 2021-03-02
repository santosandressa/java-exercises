package obejctOrientedProgram;


public class cliente {
	
	private String nomeCliente;
	private String endereco;
	private String telefone;
	
	public cliente(String nomeCliente, String endereco, String telefone) {
		this.nomeCliente = nomeCliente;
		this.endereco= endereco;
		this.telefone = telefone;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void imprimirInfo() {
		
		System.out.println("Nome: "+ nomeCliente + "\nEndereço: "+ endereco+ "\nTelefone: " + telefone);
	}
	
	

}
