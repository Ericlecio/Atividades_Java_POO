package Exercicio01;

public abstract class Midia {
	private int codigo;
	private double preco;
	private String nome;

	//CONSTRUTOR
	public Midia() {
	}

	public Midia(int codigo, double preco, String nome) {
		codigo = this.codigo;
		preco = this.preco;
		nome = this.nome;
	}

	//METODOS
	public String getTipo() {
		return Midia.class.getSimpleName();
	}

	public String getDetalhes() {
		return  "Nome: " + nome + ", Preço: " + preco + ", Código: " + codigo;
	}

	public abstract void printDados();


	public void inserirDados(int codigo, double preco, String nome) {
		codigo = this.codigo;
		preco = this.preco;
		nome = this.nome;
	}

	public void inserirDados(int codigo, double preco, String nome, int musicas) {
	}

	//GETS E SETS
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}