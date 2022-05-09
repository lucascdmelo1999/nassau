package nassau;


public class Carro {
	
	private String cor ;
	private String modelo ;
	private String marca;
	private int ano;
	
	public Carro(String cor, String modelo, String marca,int ano) {
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
