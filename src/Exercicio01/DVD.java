package Exercicio01;

public class DVD extends Midia{
	private int faixas;

	//CONSTRUTOR
	public DVD() {
	}

	public DVD(int codigo, double preco, String nome, int faixas) {
		super(codigo, preco, nome);
		this.faixas = faixas;
	}

	//METODOS
	@Override
	public String getTipo() {
		return DVD.class.getSimpleName();
	}

	@Override
	public String getDetalhes() {
		return super.getDetalhes() + ", Faixas: " + this.faixas + ", "+ getTipo();
	}

	@Override
	public void inserirDados(int codigo, double preco, String nome, int faixas) {
		setCodigo(codigo);
		setPreco(preco);
		setNome(nome);
		this.faixas = faixas;
	}

	@Override
	public void printDados() {
		System.out.println(getDetalhes());
	}

	//GETS E SETS
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public int getFaixas() {
		return faixas;
	}
}