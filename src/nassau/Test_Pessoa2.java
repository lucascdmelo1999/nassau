package nassau;

public class Test_Pessoa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa2 p2 = new Pessoa2("jose",17);
		
		//System.out.println(p2.nome + p2.idade);
		
		//System.out.println(p2.atualizarnome("lucas melo"));
		
		p2.setnome("lucas melo");
		System.out.println(p2.getnome());

	}

}
