package Heranca;

public class Test_pessoa3 {

	public static void main(String[] args) {
		
		Pessoa3 pj = new Pj();
		Pessoa3 pf = new Pf();
		
		//setando e imprmindo com CAST
		((Pj)pj).setCnpj("61601167000100");
		System.out.println(((Pj)pj).imprimircnpj());
		
		// imprimindo nomes destintos para a mesma Pessoa
		System.out.println(pj.getNome());
		//imprimindo denominacao destindos para a mesma Pessoa
		System.out.println(pj.denominacao());
		System.out.println();
		//imprimindo denominacao destindos para a mesma Pessoa
		System.out.println(pf.getNome());
		System.out.println(pf.denominacao());
	}

}
