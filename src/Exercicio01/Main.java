package Exercicio01;

public class Main {
	public static void main(String[] args) {
		//DVD
		DVD dvd = new DVD();
		dvd.inserirDados(1111, 5, "DVD", 25);
		dvd.printDados();

		CD cd = new CD();
		cd.inserirDados(2222, 10, "CD", 50);
		cd.printDados();
	}
}
