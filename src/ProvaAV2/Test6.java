package ProvaAV2;

public class Test6 {

	public static void main(String[] args) {
		
		Veiculo ca = new Carro();
		Veiculo mo = new Moto();
		
		Test6.executarimprimir(ca);
		Test6.executarimprimir(mo);

	}
	public static void executarimprimir(Veiculo c) {
		c.emitirGuiaSeguro();
	}

}
