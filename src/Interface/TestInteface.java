package Interface;

public class TestInteface {

	public static void main(String[] args) {
		Pessoa p1 = new Pj("João","00.366.849/0001-83");
		
		System.out.println(p1.getCNPJ());
		System.out.println(p1.getNome());
		
		Pessoa p2 = new Pf("Jose","999.999.999-99");
		
		System.out.println(p2.getCPF());
		System.out.println(p2.getNome());
		
		try {
			if(p1.TipoPessoa() == p2.TipoPessoa()) {
				System.out.println(p2.getNome());
			}
		}catch(ArithmeticException e){
			System.out.println("Você não pode entrar com 2 tipos de pessoas aqui");
		}

	}

}
