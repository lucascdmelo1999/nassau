package ListasEXE1;

public class ComparaNumero {
	
	int a;
	int b;
	int result;
	
	public int comparanumero(int a, int b) {
		if( a == b) {
			System.out.println("são iguais");
		}else {
			System.out.print("são diferentes, ");
		}if(a > b) {
			result = a;
			System.out.print("A é maior: ");
		}else if(a < b) {
			result = b;
			System.out.print("B é maior: ");
		}
		
		return result;
	}

}
