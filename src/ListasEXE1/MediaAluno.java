package ListasEXE1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediaAluno {
	
	float nota1;
	float nota2;
	float media;
	
	float[] notas = new float[2];
	
	//notas[0][0] = 10.0;
	//notas[0][1] = 10.0;
	
		
	public float Adcnotas() {
		media = media;
		if(media < 0 && media > 100) {
			System.out.println("Erro ao adicionar nota");
		}else {
			System.out.println("Notas adicionadas com sucesso!!");
		}
		return Adcnotas();
	}
	
	public float Media(float nota1 , float nota2) {
		media = (nota1 + nota2) / 2;
		return media;
	}
	
	/*public static void main(String args[]) {
    //Create an array
    String[] arr = new String[1];
    arr[0] = "1";
    //Convert to ArrayList
    List<String> testList = new ArrayList<>(Arrays.asList(arr));
    
    //Print the original list 
    System.out.println("Initial ArrayList:\n"
                       + testList); 
    //Add elements to it
    testList.add("2");
    testList.add("3");
    
    //Print the list after adding elements 
    System.out.println("Modified ArrayList:\n"
                       + testList);
    
}*/

	
	
}
