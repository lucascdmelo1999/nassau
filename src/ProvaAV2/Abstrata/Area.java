package ProvaAV2.Abstrata;

public class Area extends Quadrilatero{
	static float base;
	static float h;
	
	@Override
	public float calcularArea(float base, float h) {	
		float area = base * h;
		return area;
	}

}
