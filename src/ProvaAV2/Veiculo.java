package ProvaAV2;

public class Veiculo {
	
	private String Cor;
	private String Chassi;
	private String Placa;
	
	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getChassi() {
		return Chassi;
	}

	public void setChassi(String chassi) {
		Chassi = chassi;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public void emitirGuiaSeguro() {
		System.out.println("Guia veiculo");
	}
	
}
