package ListasEXE1;

public class NumInteiro {
	int n1=10;
    int soma=0;
	
	public int num(int n1){
	    for(int c = 1; c < n1; c++){
	        if (c % 3 == 0 || (c % 5 == 0)){
	            System.out.println(c);
	            soma += c;
	        }
	    }
	    System.out.println("__");
        return soma;
    }
}
