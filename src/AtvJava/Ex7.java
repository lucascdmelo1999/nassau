package AtvJava;

public class Ex7 {
	
	 int i;
	 String agradecimento = "Muito obrigado por usar meu sistema";
	
	public String crecente() {
		i = -1;
		while (i <= 8) {
			i++;
			System.out.println(i);
		}
		return agradecimento;
	}
	
	public int descrecente() {
		i = 10;
		while (i >= 2 ) {
			i--;
			System.out.println(i);
		}
		return (i - 1);
	}

}
