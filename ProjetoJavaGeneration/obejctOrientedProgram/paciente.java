package obejctOrientedProgram;

public class paciente {

	private String nomePaciente;
	private int idade;
	private String pacienteRisco;
	private String sintomas;

	public paciente(String nomePaciente, int idade, String pacienteRisco, String sintomas) {
		this.nomePaciente = nomePaciente;
		this.idade = idade;
		this.pacienteRisco = pacienteRisco;
		this.sintomas = sintomas;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPacienteRisco() {
		return pacienteRisco;
	}

	public void setPacienteRisco(String pacienteRisco) {
		this.pacienteRisco = pacienteRisco;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public void info() {

		System.out.println("\nNome: " + nomePaciente + "\nIdade: " + idade + "\nPaciente de Risco:" + pacienteRisco
				+ "\nSintomas" + sintomas);
	}

}
