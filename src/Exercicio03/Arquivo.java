package Exercicio03;

public abstract class Arquivo {
	private int kbytes;
	private double preco;
	private String autor;

	//CONSTRUTOR
	public Arquivo() {
		// TODO Auto-generated constructor stub
	}

	public Arquivo(int kbytes, double preco, String autor) {
		this.kbytes = kbytes;
		this.preco = preco;
		this.autor = autor;
	}

	//METODOS
	public String getTipo() {
		return Arquivo.class.getSimpleName();
	}

	public String getDetalhes() {
		return "Kbytes: " + kbytes + ",\nPreço: " + preco + ",\nAutor: " + autor;
	}

	public abstract void printDados();


	public void inserirDados(int kbytes, double preco, String autor) {
		kbytes = this.kbytes;
		preco = this.preco;
		autor = this.autor;
	}

	//GETS E SETS
	public int getKbytes() {
		return kbytes;
	}

	public void setKbytes(int kbytes) {
		this.kbytes = kbytes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}




}
