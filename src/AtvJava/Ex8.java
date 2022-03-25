package AtvJava;

public class Ex8 {
	
	public Ex8 () {
		int[] x = new int[4];
		
		x[0] = 30;
		x[1] = 10;
		x[2] = 20;
		x[3] = 40;

		for(int i = x.length - 1; i >= 0 ;i--) {
			System.out.println("X -> "+ i + " = " + x[i]);
		}
	}
		
	public static void main (String [] args) {
		Ex8 c = new Ex8();
	}
}
