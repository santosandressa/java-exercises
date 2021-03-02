package obejctOrientedProgram;

import java.util.Scanner;

public class testePaciente {

	public static void main(String[] args) {

		String nomePaciente = null, pacienteRisco = null, sintomas = null;
		int idade = 0;
		paciente paciente = new paciente(nomePaciente, idade, pacienteRisco, sintomas);

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		System.out.println("Nome: ");
		nomePaciente = leia.next();
		paciente.setNomePaciente(nomePaciente);

		System.out.println("idade: ");
		idade = leia.nextInt();
		paciente.setIdade(idade);

		System.out.println("Paciente Risco: ");
		pacienteRisco = leia.next();
		paciente.setPacienteRisco(pacienteRisco);

		System.out.println("Sintomas: ");
		sintomas = leia.next();
		paciente.setSintomas(sintomas);

		paciente.info();

	}

}
