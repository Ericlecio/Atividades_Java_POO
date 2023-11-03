	package Exercicio03;

public class MP3 extends Arquivo {
	private int downloads;

	//CONSTRUTOR
	public MP3() {
	}

	public MP3(int kbytes, double preco, String autor, int downloads) {
		super(kbytes, preco, autor);
		this.downloads = downloads;
	}

	//METODOS
	@Override
	public String getTipo() {
		return MP3.class.getSimpleName();
	}

	@Override
	public String getDetalhes() {
		return super.getDetalhes() + ",\nDownloads: " + downloads + ",\n" + getTipo() + "\n----------------------------";
	}

	public void inserirDados(int kbytes, double preco, String autor, int downloads) {
		setKbytes(kbytes);
		setPreco(preco);
		setAutor(autor);
		this.downloads = downloads;
	}

	@Override
	public void printDados() {
		System.out.println(getDetalhes());		
	}

	//GETS E SETS
	public int getDownloads() {
		return downloads;
	}

	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}
}