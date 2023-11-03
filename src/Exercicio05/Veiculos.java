package Exercicio05;

public abstract class Veiculos {
	private String modelo;
	private double preco;
	
	//CONSTRUTOR
	public Veiculos() {
		// TODO Auto-generated constructor stub
	}

	public Veiculos(String modelo, double preco) {
		super();
		this.modelo = modelo;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public abstract void printDados();

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}