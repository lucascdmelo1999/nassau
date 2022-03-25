package nassau;


public class Pessoa {
	
	String nome;
	int idade;
	int dia;
	int mes;
	int ano;
	
	
	int informaIdade () {
		idade = (2022 - this.ano);
		return idade;
	}
	
	String informaNome () {
		return this.nome;
	}
	
	void ajustaDataDeNascimento (int dia,int mes,int ano) {
		this.dia = dia;
	    this.mes = mes;
	    this.ano = ano;	
	}
	
	Pessoa(int idade, int dia,int mes,int ano, String nome){
		this.nome = nome; 
		this.idade = idade;
		this.ajustaDataDeNascimento(dia, mes, ano);
	}
	
	@Override
    public String toString() {
        return "Nome: " + this.nome + " Idade: " + this.idade;
    }
		
}
