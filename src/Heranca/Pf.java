package Heranca;

public class Pf extends Pessoa3 {
	private String cpf;
	
	public Pf() {
		this("nome = cpf");
	}
	
	public Pf(String nome) {
		super.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String imprimircpf() {
		return cpf;
	}
	
	@Override
	public String denominacao() {
		return "SOU CPF";
	}

}
