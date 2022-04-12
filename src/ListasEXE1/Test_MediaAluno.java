package ListasEXE1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_MediaAluno {

	public static void main(String args[]) {
    //Create an array
	float[] notas = new float[2];
    notas[0] = 1;
    //Convert to ArrayList
    List<float> testList = new ArrayList<>(Arrays.asList(notas));
    
    //Print the original list 
    System.out.println("Initial ArrayList:\n"
                       + testList); 
    //Add elements to it
    testList.add("2");
    testList.add("3");
    
    //Print the list after adding elements 
    System.out.println("Modified ArrayList:\n"
                       + testList);
    
	}

}
