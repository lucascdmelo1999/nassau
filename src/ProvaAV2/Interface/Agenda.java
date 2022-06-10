package ProvaAV2.Interface;

public class Agenda implements Contato {

	static String nome;
	static String contato;
	static String tipo;
	
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getContato() {
		return contato;
	}

	@Override
	public String getTipo() {
		return tipo;
	}

}
