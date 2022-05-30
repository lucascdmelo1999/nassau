package Abstract;

public class Ferrari extends Carro{
			
	@Override
	public void ligar() {
		System.out.println("Ligado..");
		
	}

	@Override
	public void FecharPorta() {
		System.out.println("Porta fechada");
		
	}
	
	@Override
	public void levantarVidros() {
		System.out.println("Lavantando o vidro da ferrari");
	}

	@Override
	public void cor() {
		System.out.println("Azul");
	}

}
