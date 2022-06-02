package Interface;

public interface Repositorio {

	public void guarda(Pessoa p);
	
	public Pessoa recuperar(String cpf);
	
	public Pessoa primeiro();
	
	public Pessoa proximo();
	

}
