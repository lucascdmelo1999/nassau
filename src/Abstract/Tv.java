package Abstract;

public class Tv  implements ControleRemoto{

	@Override
	public void ligarTV() {
		System.out.println("TV LIGADA");
	}

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentado volume...");
		
	}

	@Override
	public void trocarcanal() {
		System.out.println("Canal trocado");
		
	}

}
