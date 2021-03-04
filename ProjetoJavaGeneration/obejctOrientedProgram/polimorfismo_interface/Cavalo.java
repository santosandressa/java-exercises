package polimorfismo_interface;

public class Cavalo extends Animal{
	
	public Cavalo() {
		super("Cavalo");
	}
	
	@Override
	public void Nome (String nome) {
		System.out.println("Nome do cavalo: "+ nome);
	}
	@Override
	public void Idade (int idade) {
		System.out.println("Idade: "+ idade);
	}
	@Override
	public void Som (String som) {
		System.out.println("Hiiiiinir......hiiiiiirr");
	}
	
	public void Corre () {
		System.out.println("correndo....correndo...vuuuu");
	}
	
}