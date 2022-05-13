package Heranca;

public class Animal {
	
	/* String nome;
	 int idade;
	 
	 public Animal() {
		 this("gato");
	 }
	 
	public Animal (String nome) {
		this.nome = nome;		
	}
	public Animal (String nome,int idade) {
		this.nome = nome; 
		this.idade = idade; 
	}*/
	
	private String nome;
	private String raca;
	
	public Animal() {
		
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String Caminha() {
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
