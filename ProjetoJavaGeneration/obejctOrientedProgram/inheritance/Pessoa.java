package inheritance;

public class Pessoa {
	
	private String nome;
	private String address;
	private String telefone;
		
	public Pessoa(String nome, String address, String telefone) {
		super();
		this.nome = nome;
		this.address = address;
		this.telefone = telefone;
	}
	
	public Pessoa() {
		super();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
