package ListasEXE1;

public class MaiorNumero {
	
	// Crie uma classe java MaiorNumero que contenha um m�todo que receba 
	// dois n�meros inteiros e imprima o maior entre eles.
	
	int a;
	int b;
	int result;
	
	public MaiorNumero() {
		
	}
	
	
	public int maiornumero(int a, int b) {
		if(a > b) {
			result = a;
			System.out.println("A � maior");
		}else if(a == b) {
			result = a;
			System.out.println("A e B s�o iguais");
		}else {
			result = b;
			System.out.println("B � maior");
		}
		return result;
	}

}
