package ListasEXE1;

public class ComparaNumero {
	
	int a;
	int b;
	int result;
	
	public int comparanumero(int a, int b) {
		if( a == b) {
			System.out.println("s�o iguais");
		}else {
			System.out.print("s�o diferentes, ");
		}if(a > b) {
			result = a;
			System.out.print("A � maior: ");
		}else if(a < b) {
			result = b;
			System.out.print("B � maior: ");
		}
		
		return result;
	}

}
