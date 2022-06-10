package ProvaAV2.Interface;

import java.util.Scanner;

public class TestInterface {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o Nome na Agenda: ");
		Agenda.nome= in.next();
		System.out.print("Digite o Contato: ");
		Agenda.contato= in.next();
		System.out.print("Digite o Tipo: ");
		Agenda.tipo= in.next();
		
		System.out.println("Nome na Agenda: "+Agenda.nome);
		System.out.println("Contato: "+Agenda.contato);
		System.out.println("Tipo: "+Agenda.tipo);
	}

}
