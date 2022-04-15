package nassau;

public class Pessoa2 {
	private String nome;
	private int idade;
	
	public Pessoa2(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	/*public String atualizarnome(String nome) {
		return nome;
	}
	
	public int atualizaridade() {
		return idade;
	}*/
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public int getidade() {
		return idade;
	}
	
	public void setnome(int idade) {
		this.idade = idade;
	}

}
