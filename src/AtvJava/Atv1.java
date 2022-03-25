package AtvJava;

public class Atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 10;
		int c = 10;
		
		if( a > b && a > c ) {
			System.out.println("A é o maior: " + a );
		}else if(b > c && b > a) {
			System.out.println("B é o maior: " + b );
		}else if(c > a && c > b)  {
			System.out.println("C é o maior: " + c );
		}else if(c == a && c == b)  {
			System.out.println("todos sao iguais " + c );
		}else if(c == a)  {
			System.out.println("C e A são iguais ");
		}else if(c == b)  {
			System.out.println("C e B são iguais ");
		}else if(a == b)  {
			System.out.println("A e B são iguais ");
		}

	}

}
