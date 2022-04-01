package AtvJava;

public class Ex8 {
	int i;
	public Ex8 () {
		int[] x = new int[4]; // ou {1,2,3,4};
		
		x[0] = 30;
		x[1] = 10;
		x[2] = 20;
		x[3] = 40;
		
		
		
		for(int i = x.length - 1; i >= 0 ;i--) {
			System.out.println("X -> "+ i + " = " + x[i]);
		}
		System.out.println("");
		//for each so "liner" ou seja so para ++
		for(int v : x) {
			System.out.println("V -> "+ i++ + " = " + v);
			// if ternario concatenados
			System.out.println( v > 100 ? v : v >= 10 ? v : x );
		};
	}
		
	public static void main (String [] args) {
		Ex8 c = new Ex8();
		
		
	}
}
