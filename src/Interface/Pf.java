package Interface;

public class Pf implements Pessoa , Repositorio{
	
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
	public void guarda(Pessoa p) {
		
	}

	@Override
	public Pessoa recuperar(String cpf) {
		return null;
	}

	@Override
	public Pessoa primeiro() {
		return null;
	}

	@Override
	public Pessoa proximo() {
		return null;
	}
	

}
