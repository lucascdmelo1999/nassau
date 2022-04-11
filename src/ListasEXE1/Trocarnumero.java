package ListasEXE1;

public class Trocarnumero {
	
	int num_a;     
	int num_b;  
	
	public Trocarnumero(int num_a, int num_b) {         
		this.num_a = num_b;         
		this.num_b = num_a;	   
	}
	public String trocarnumero() {
		
		return this.num_a + " = A " + this.num_b + " = B";
	}

}
