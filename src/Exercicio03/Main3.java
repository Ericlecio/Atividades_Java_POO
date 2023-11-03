package Exercicio03;

import java.util.Random;

public class Main3 {
	public static void main(String[] args) {
		Random randomMP3 = new Random();
		Random randomMP4 = new Random();

		Random randomNome = new Random();
		String[] primeirosNomes = {"João", "Maria", "Pedro", "Ana", "Carlos"};
		String[] sobrenomes = {"Silva", "Santos", "Oliveira", "Pereira", "Costa"};

		Random random = new Random();
		int escolha = random.nextInt(2); // Gera 0 ou 1 aleatoriamente

		if( escolha == 0) {
			System.out.println("MP3");
			for (int i = 1; i <= 4; i++) {
				MP3 mp3 = new MP3();

				//MP3 Aleatorio
				System.out.println(i);
				int kbytesMP3 = randomMP3.nextInt(1000);
				double precoMP3 = randomMP3.nextDouble() * 100;
				String autorMP3 = primeirosNomes[randomNome.nextInt(primeirosNomes.length)] + " " + sobrenomes[randomNome.nextInt(sobrenomes.length)];
				int downloadsMP3 = randomMP3.nextInt(10000);

				mp3.inserirDados(kbytesMP3, precoMP3, autorMP3,downloadsMP3 );
				mp3.printDados();

				if (downloadsMP3 > 5000) {	
					double acrescimo = (5 * precoMP3) / 100;
					double precoMP3acrecimo = precoMP3 + acrescimo;
					System.out.println("Acrescimo de: " + acrescimo);
					System.out.println("Preco com Acrecimo: " + precoMP3acrecimo);
					System.out.println("----------------------🠕--------------------");
				}
			}

		} else {
			System.out.println("MP4");
			for (int i = 1; i <= 4; i++) {
				MP4 mp4 = new MP4();

				//MP4 Aleatorio
				System.out.println(i);
				int kbytesMP4 = randomMP4.nextInt(1000);
				double precoMP4 = randomMP4.nextDouble() * 100;
				String autorMP4 = primeirosNomes[randomNome.nextInt(primeirosNomes.length)] + " " + sobrenomes[randomNome.nextInt(sobrenomes.length)];

				int visitasMP4 = randomMP4.nextInt(20000);

				mp4.inserirDados(kbytesMP4, precoMP4, autorMP4, visitasMP4);
				mp4.printDados();

				if (visitasMP4 > 10000) {	
					double acrescimo = (8 * precoMP4) / 100;
					double precoMP4acrecimo = precoMP4 + acrescimo;
					System.out.println("Acrescimo de: " + acrescimo);
					System.out.println("Preco com Acrecimo: " + precoMP4acrecimo);
					System.out.println("-------------------------------------------");
				}
			}
		}
	}
}
