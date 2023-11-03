package Exercicio03;

public class MP4 extends Arquivo {
	private int visitas;

	//CONSTRUTOR
	public MP4() {
	}

	public MP4(int kbytes, double preco, String autor, int visitas) {
		super(kbytes, preco, autor);
		this.visitas = visitas;
	}

	//METODOS
	@Override
	public String getTipo() {
		return MP4.class.getSimpleName();
	}

	@Override
	public String getDetalhes() {
		return super.getDetalhes() + ",\nVisitas: " + visitas + ",\n"+ getTipo() + "\n----------------------------";
	}

	public void inserirDados(int kbytes, double preco, String autor, int visitas) {
		setKbytes(kbytes);
		setPreco(preco);
		setAutor(autor);
		this.visitas = visitas;
	}

	@Override
	public void printDados() {
		System.out.println(getDetalhes());		
	}

	//GETS E SETS
	public int getVisitas() {
		return visitas;
	}

	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}

}
