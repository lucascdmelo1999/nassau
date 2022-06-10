package ProvaAV2.Abstrata;

import java.util.Scanner;

public class TestPAV2 {

	public static void main(String[] args) throws InterruptedException {
		Quadrilatero qa = new Area();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da base do quadrilatero: ");
		Area.b = in.nextFloat();
		System.out.print("Digite o tamanho da altura do quadrilatero: ");
		Area.h = in.nextFloat();
		
		System.out.println("Area do quadrilatero: "+qa.calcularArea(Area.b,Area.h)+" M²");
		
		
		
		System.out.print("Digite o tamanho do lado do quadrilatero: ");
		Quadrilatero.a = in.nextFloat();
		System.out.print("Digite o tamanho do outro lado do quadrilatero: ");
		Quadrilatero.b = in.nextFloat();
		System.out.print("Digite o tamanho do outro lado do quadrilatero: ");
		Quadrilatero.c = in.nextFloat();
		System.out.print("Digite o tamanho do outro lado do quadrilatero: ");
		Quadrilatero.d = in.nextFloat();
		
		System.out.println("Perimetro do quadrilatero: "+ ((Area)qa).calcularPerimetro(10,10,10,10)+ " <- Soma dos lados");

	}

}