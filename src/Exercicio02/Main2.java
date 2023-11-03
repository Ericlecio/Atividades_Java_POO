package Exercicio02;

import java.util.Random;

public class Main2 {
	public static void main(String[] args) {
		Random randomcd = new Random();
		Random randomdvd = new Random();
		
		Random randomNome = new Random();
		String[] primeirosNomes = {"João", "Maria", "Pedro", "Ana", "Carlos"};
		String[] sobrenomes = {"Silva", "Santos", "Oliveira", "Pereira", "Costa"};
		
		
		CD cd = new CD();
		DVD dvd = new DVD();

		
		//DVD Aleatorio
		String nomeDVD = primeirosNomes[randomNome.nextInt(primeirosNomes.length)] + " " + sobrenomes[randomNome.nextInt(sobrenomes.length)];
		
		int codigoDVD = randomdvd.nextInt(1000);
		double precoDVD = randomdvd.nextDouble() * 100;
		int faixasDVD = randomdvd.nextInt(30);

		dvd.inserirDados(codigoDVD, precoDVD, nomeDVD, faixasDVD);

		//CD Aleatorio
		String nomeCD = primeirosNomes[randomNome.nextInt(primeirosNomes.length)] + " " + sobrenomes[randomNome.nextInt(sobrenomes.length)];
		int codigoCD = randomcd.nextInt(1000);
		double precoCD = randomcd.nextDouble() * 100;
		int musicasCD = randomcd.nextInt(20);

		cd.inserirDados(codigoCD, precoCD, nomeCD, musicasCD);

		cd.printDados();
		dvd.printDados();
	}
}
