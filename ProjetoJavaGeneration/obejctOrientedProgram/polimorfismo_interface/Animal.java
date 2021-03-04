package polimorfismo_interface;

public abstract class Animal {
	
	private String especie;
	
	public Animal (String especie) {
		this.especie = especie;
	}
	
	abstract public void Nome (String nomea);
	abstract public void Idade (int idade);
	abstract public void Som (String som);


	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
		
}

	

