package Exercicio02;

public class CD extends Midia {
	private int musicas;

	//CONSTRUTOR
	public CD() {
	}

	public CD(int codigo, double preco, String nome, int musicas) {
		super(codigo, preco, nome);
		this.musicas = musicas;
	}

	//METODOS
	@Override
	public String getTipo() {
		return CD.class.getSimpleName();
	}

	@Override
	public String getDetalhes() {
		return super.getDetalhes() + ", Músicas: " + musicas + ", "+ getTipo();
	}

	public void inserirDados(int codigo, double preco, String nome, int musicas) {
		setCodigo(codigo);
		setPreco(preco);
		setNome(nome);
		this.musicas = musicas;
	}

	@Override
	public void printDados() {
		System.out.println(getDetalhes());		
	}

	//GETS E SETS
	public void setMusicas(int musicas) {
		this.musicas = musicas;
	}

	public int getMusicas() {
		return musicas;
	}
}