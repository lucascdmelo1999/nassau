package Abstract;

public abstract class Pessoa {
	
	public abstract String getCNPJ();
	
	public abstract String getCPF();
	
	public abstract String getNome();
	
	public abstract String TipoPessoa();
	
	public String Imprimir() {
		return "Impressão Padrão";
	}

}
