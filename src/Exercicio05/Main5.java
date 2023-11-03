package Exercicio05;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Deseja Inserir Moto ou Carro ?\nInforme 1 = MOTO ou 2 = Carro: ");
		int numero = scanner.nextInt();


		if (numero == 1) {
			System.out.print("Informe o modelo: ");
			String modelo = scanner.next();
			System.out.print("Informe o preco: ");
			double preco = scanner.nextDouble();
			System.out.print("Informe o ano: ");
			int ano = scanner.nextInt();

			Moto moto = new Moto();
			moto.insertData(modelo, preco, ano);
			moto.printDados();
			if (ano >= 2008) {	
				double acrescimo = (10 * preco) / 100;
				double precoMotoacrecimo = preco + acrescimo;
				System.out.println("Acrescimo de: " + acrescimo);
				System.out.println("Preco com Acrecimo: " + precoMotoacrecimo);
				System.out.println("----------------------🠕--------------------");
			}else {
				System.out.println("-----------------------------------------------------");
			}
		} 

		if (numero == 2) {
			System.out.print("Informe o modelo: ");
			String modelo = scanner.next();
			System.out.print("Informe o preco: ");
			double preco = scanner.nextDouble();
			System.out.print("Informe o ano: ");
			int km = scanner.nextInt();

			Carro carro = new Carro();
			carro.insertData(modelo, preco, km);
			carro.printDados();
			if (km > 100000) {	
				double acrescimo = (8 * preco) / 100;
				double precoCarroacrecimo = preco - acrescimo;
				System.out.println("Acrescimo de: " + acrescimo);
				System.out.println("Preco com Acrecimo: " + precoCarroacrecimo);
				System.out.println("----------------------🠕--------------------");
			}else {
				System.out.println("-----------------------------------------------------");
			}
		}
		else {
			System.out.println("Por favor, escolha apenas entre 1 = Moto Ou 2 = Carro.");
		}
	}
}