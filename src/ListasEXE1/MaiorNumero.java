package ListasEXE1;

public class MaiorNumero {
	
	// Crie uma classe java MaiorNumero que contenha um método que receba 
	// dois números inteiros e imprima o maior entre eles.
	
	int a;
	int b;
	int result;
	
	public MaiorNumero() {
		
	}
	
	
	public int maiornumero(int a, int b) {
		if(a > b) {
			result = a;
			System.out.println("A é maior");
		}else if(a == b) {
			result = a;
			System.out.println("A e B são iguais");
		}else {
			result = b;
			System.out.println("B é maior");
		}
		return result;
	}

}
