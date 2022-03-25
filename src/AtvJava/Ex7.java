package AtvJava;

public class Ex7 {
	
	int cres;
	int descre;
	int i;
	
	public int crecente(int cres) {
		i = 0;
		while (i <= cres ) {
			i++;
			System.out.println(i);
		}
		return i ;
	}
	
	public int descrecente(int descre) {
		i = 10;
		while (i >= descre ) {
			i--;
			System.out.println(i);
		}
		return i ;
	}

}
