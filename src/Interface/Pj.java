package Interface;

public class Pj implements Pessoa , Repositorio{
	
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
	public void guarda(Pessoa p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pessoa recuperar(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa primeiro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa proximo() {
		// TODO Auto-generated method stub
		return null;
	}

}
