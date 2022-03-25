package AtvJava;
import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner lu = new Scanner(System.in);
		
				//System.out.println("Digite seu nome: " );
				String nome = "Lucas Melo";
				
				//System.out.println("Digite sua primeira nota:" );
				Float A = 10.0f;
				
				//System.out.println("Digite sua segunda nota:" );
				Float B = 9.0f;
				Float media = (A + B) / 2;
				
				if(media < 5) {
					System.out.println( nome + " Aluno reprovado!");
				}else if(media >= 6)  {
					System.out.println(nome + " Aluno aprovados!");
				}else if(media >= 8 && media <= 9)  {
					System.out.println("Muito bom!");
				}else if(media == 10)  {
					System.out.println("Otimo!");
				}

	}

}
