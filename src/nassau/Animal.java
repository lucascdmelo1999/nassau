package nassau;

public class Animal {
	
	 String nome;
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
	}
	

}
