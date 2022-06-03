package Heranca;

import java.security.InvalidAlgorithmParameterException;
import java.util.concurrent.ExecutionException;

import Exeception.Exeception;

public class Test_pessoa3 {

	public static void main(String[] args) throws Exception {
		
		Pessoa3 pj = new Pj();
		Pessoa3 pf = new Pf();
		
		//setando e imprmindo com CAST
		((Pj)pj).setCnpj("61601167000100");
		System.out.println(((Pj)pj).imprimircnpj());
		
		// imprimindo nomes destintos para a mesma Pessoa
		System.out.println(pj.getNome());
		//imprimindo denominacao destindos para a mesma Pessoa
		System.out.println(pj.denominacao());
		System.out.println();
		//imprimindo denominacao destindos para a mesma Pessoa
		System.out.println(pf.getNome());
		System.out.println(pf.denominacao());
		Test_pessoa3 p3 = new Test_pessoa3();
		
		try {
			int result = p3.divisao(10,0);
			System.out.println(result);
			
		}catch(ArithmeticException a) {
			System.out.println("Erro");
		}
		
		
		//TRY Com Exception checadas
		try {
			p3.lancarException(30);
		}catch(InvalidAlgorithmParameterException e1) {
			System.out.println("é 20");
			//e1.printStackTrace();
		//Aparece no console 
		}catch(IllegalArgumentException e2) {
			System.out.println("é 30");
			//e2.printStackTrace();
		}catch(Exeception e4){
			System.out.println("é 40");
			e4.printStackTrace();
		}finally {
			System.out.println("Final de Sistema");
		}
	}
	
	public int divisao(int a , int b) {
		return a / b;
	}
	
	//Exception checadas
	public void lancarException(int codigo) throws Exception,IllegalArgumentException ,InvalidAlgorithmParameterException{
		if (codigo == 20) {
			//throw new Exception("é 20");
			throw new InvalidAlgorithmParameterException("é 20");
		}else if(codigo == 30){
			throw new IllegalArgumentException("é 30");
		}else if(codigo == 40) {
			throw new Exeception("é 40");
		}
	}
}
