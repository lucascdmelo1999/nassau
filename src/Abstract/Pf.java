package Abstract;

public class Pf extends Pessoa {
	
	private String nome;
	private String cpf;

	public Pf(String nome, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	@Override
	public String getCNPJ() {
		return null;
	}

	@Override
	public String getCPF() {
		return this.cpf;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String TipoPessoa() {
		return this.cpf;
	}
	
	@Override
	public String Imprimir() {
		return "Impressão PF - " + this.cpf ;
	}

}