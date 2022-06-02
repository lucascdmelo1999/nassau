package Heranca;

public class Pj extends Pessoa3 {
	private String cnpj ;

	public Pj() {
		this("nome = cnpj");
	}
	
	public Pj(String nome) {
		super.nome = nome;
	}
	            	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String imprimircnpj() {
		return cnpj;
	}
	
	@Override
	public String denominacao() {
		return "SOU CNPJ";
	}

}
