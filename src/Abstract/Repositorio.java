package Abstract;

public abstract class Repositorio {

	public abstract void guarda(Pessoa nova);
	
	public abstract Pessoa recuperar(String cpf);
	
	public abstract Pessoa primeiro();
	
	public abstract Pessoa proximo();
	
}
