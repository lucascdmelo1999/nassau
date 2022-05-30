package polimofismo;

public class TesteImpressora {

	public static void main(String[] args) {
		// so iria servir se o metodo da linha 19 n fosse static
		//TesteImpressora t = new TesteImpressora();
		
		Impressora ip = new Impressora();
		Impressora imp_hp = new Hp();
		Impressora imp_Ep = new Epson();
		
		// TesteImpressora.executarimprimir(new Hp());
		// TesteImpressora.executarimprimir(new Epson());
		// TesteImpressora.executarimprimir(new Impressora());
		
		// OU utilizando as variaveis.
		
		TesteImpressora.executarimprimir(imp_hp);
		TesteImpressora.executarimprimir(imp_Ep);
		TesteImpressora.executarimprimir(ip);

	}
	// metodo para imprimir todas as impressoras
	public static void executarimprimir(Impressora i) {
		i.imprimir();
	}

}
