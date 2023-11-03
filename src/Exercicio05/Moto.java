package Exercicio05;

public class Moto extends Veiculos {
	private int ano;

	//CONSTRUTOR
	public Moto() {
		// TODO Auto-generated constructor stub
	}

	public Moto(int ano) {
		super();
		this.ano = ano;
	}

	//METODOS
	public void insertData(String modelo, double preco, int ano) {
		setModelo(modelo);
		setPreco(preco);
		this.ano = ano;
	}

	@Override
	public void printDados() {
		System.out.println(Moto.class.getSimpleName());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Preço: " + getPrecoMoto());
		System.out.println("Ano: " + this.getAno());
	}
	
	
	public double getPrecoMoto() {
		return getPreco();
	}
	
	//GETS E SETS
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}


}