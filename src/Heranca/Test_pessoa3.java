package Heranca;

public class Test_pessoa3 {

	public static void main(String[] args) {
		
		Pessoa3 pj = new Pj();
		
		((Pj)pj).setCnpj("61601167000100");
		System.out.println(((Pj)pj).imprimircnpj());

	}

}
