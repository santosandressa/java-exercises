package polimorfismo_interface;

public class Cachorro extends Animal {

	public Cachorro() {
		super("Cachorro");
	}

	@Override
	public void Nome(String nome) {
		System.out.println("Nome do cachorro: " + nome);
	}

	@Override
	public void Idade(int idade) {
		System.out.println("Idade: " + idade);
	}

	@Override
	public void Som(String som) {
		System.out.println("Auuuu Auuuuuuuuu ");
	}

	public void Corre() {
		System.out.println("correndo.....correndo....vuuuuu");
	}

}
