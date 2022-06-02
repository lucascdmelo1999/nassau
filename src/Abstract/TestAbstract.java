package Abstract;

public class TestAbstract {
	
	public static void main(String[] args) {
			
//		Carro c = new Ferrari();
//		
//		c.cor();
//		c.FecharPorta();
//		c.ligar();
//		c.levantarVidros();
//				
//		ControleRemoto cr = new Tv();
//		
//		cr.ligarTV();
//		cr.aumentarVolume();
//		cr.trocarcanal();
		
//		try{
//		}catch(ArithmeticException e){
//			System.out.println("deu errado fi");
//		}finally {
//			//System.out.println("Fim");
//		}
		
		Pessoa p1 = new Pj("Verde Frut","00.366.849/0001-83");
		
		p1.Imprimir();
		System.out.print(p1.getNome() + " - ");
		System.out.println(p1.getCNPJ());
		
		System.out.println();
		
		Pessoa p2 = new Pf("João","654.459.929-05");
		
		p2.Imprimir();
		System.out.print(p2.getNome() + " - ");
		System.out.println(p2.getCPF());
		
		
		
	}
}