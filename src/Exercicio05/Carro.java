package Exercicio05;

public class Carro extends Veiculos {
	private double km;

	//CONSTRUTOR
	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public Carro(double km) {
		super();
		this.km = km;
	}

	//METODOS
	public void insertData(String modelo, double preco, double km) {
		setModelo(modelo);
		setPreco(preco);
		this.km = km;
	}

	@Override
	public void printDados() {
		System.out.println(Carro.class.getSimpleName());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Preço: " + getPrecoCarro());
		System.out.println("Km: " + this.getKm());
	}
	
	public double getPrecoCarro() {
		return getPreco();
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
}
