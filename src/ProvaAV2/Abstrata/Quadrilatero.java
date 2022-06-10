package ProvaAV2.Abstrata;

public abstract class Quadrilatero {
	
	static float a;
	static float b;
	static float c;
	static float d;
	
	public abstract float calcularArea(float base,float h);
	
	public  float calcularPerimetro(float a,float b,float c ,float d) {
		float perimetro = (a + b) + (b + c) + (c + d) + (d + a);
		return perimetro;
	}
}
