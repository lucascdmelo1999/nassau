package Abstract;

import Interface.ControleRemoto;
import Interface.Tv;

public class TestAbstract {
	
	public static void main(String[] args) {
			
		Carro c = new Ferrari();
		
		c.cor();
		c.FecharPorta();
		c.ligar();
		c.levantarVidros();
				
		ControleRemoto cr = new Tv();
		
		cr.ligarTV();
		cr.aumentarVolume();
		cr.trocarcanal();
		
		try{
		}catch(ArithmeticException e){
			System.out.println("deu errado fi");
		}finally {
			//System.out.println("Fim");
		}
	}
}