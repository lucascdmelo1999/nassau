package Abstract;

public class Pj extends Pessoa{
	
	private String nome;
	private String cnpj;
	
	public Pj(String nome, String cnpj) {
		this.cnpj = cnpj;
		this.nome = nome ;
	}
	
	@Override
	public String getCNPJ() {	
		return this.cnpj;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getCPF() {
		return null;
	}

	@Override
	public String TipoPessoa() {
		return this.cnpj;
	}
	
	@Override
	public String Imprimir() {
		return "Impressão PJ - " + this.cnpj;
	}

}
