package ListasEXE1;

public class Num_soma {
	public static void main(String[] args){

        int soma_impar = 0;
        int mult_pares = 2;
        int num_total = 30;

        for(int i = 0;i <= num_total;i++) {
            if(i%2==1){
                soma_impar = soma_impar + i;

            }else{
            	if(i >= 2) {
            		mult_pares = mult_pares * i;
            	}
            	
            }

        }
        
        System.out.println("Soma de todos os impares = " + soma_impar);
        System.out.println("Multiplicação de todos os pares = " + mult_pares);

    }

}
