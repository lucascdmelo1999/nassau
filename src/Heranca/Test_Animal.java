package Heranca;

public class Test_Animal {
	public static void main(String[] args) {
		/*Terrestre tr = new Terrestre("gato", 30);
		
		System.out.println(tr.idade + " " + tr.nome);
		*/
		Animal an = new Animal();
		Cachorro cho = new Cachorro();
		Gato gat = new Gato();
		
		Animal ch = new Cachorro();
		System.out.println(ch.getNome() + " " +ch.getRaca());
		Animal gt = new Gato();
		System.out.println(gt.getNome() + " " + gt.getRaca());
		
		//System.out.println(cho.late());
		
		//TESTE DE INSTANCIA COM CAST
		/*if (ch instanceof Cachorro) {
		 	// ##CAST
		 	((Cachorro)ch).late();
			System.out.println("é um cachorro");
		}
		if (gt instanceof Cachorro) {
			System.out.println("é um gato");
		}*/
	}
} 
