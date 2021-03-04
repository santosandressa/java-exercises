package polimorfismo_interface;

public class Preguica extends Animal{
	

	public Preguica() {
		super("Preguiça");
	}
	
	@Override
	public void Nome (String nome) {
		System.out.println("Nome da preguica: "+ nome);
	}
	@Override
	public void Idade (int idade) {
		System.out.println("Idade: "+ idade);
	}
	@Override
	public void Som (String som) {
		System.out.println("Aeeeeeeh....aeeeeeeeeeh...aeeee");
	}
	public void Subir () {
		System.out.println("Subindo....Subindoo");
	}
	
	
}
