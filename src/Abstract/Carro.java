package Abstract;

public abstract class Carro {
	
	String cor;
	String modelo;
	
	public abstract void ligar();
	
	public abstract void FecharPorta();
	
	public void levantarVidros() {
		System.out.println("Lavantando o vidro do carro");
	}

	public abstract void cor();
}