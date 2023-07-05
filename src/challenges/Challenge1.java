package challenges;

import application.Main;

public class Challenge1 {
	public static void showTestCase() {
		System.out.println(revert("Hello, World! OpenAI is amazing."));
	}

	public static void showChallenge() {
		while(true) {
			try {
				System.out.println("Digite a frase a ser revertida: ");
				String phrase = Main.sc.nextLine();
				
				System.out.println(revert(phrase.trim()));
				break;
			}catch(Exception e) {
				System.out.println("Houve um erro! Que tal tentar novamente?");
			}
		}
	}
	
	/*
	 * Função responsável por reverter a ordem das frases
	 * irá separar a frase pelos espaços e passar as palavras em um for inverso para uma string
	 */
	public static String revert(String phrase) {
		String[] phrases = phrase.split(" ");
		
		String revertedPhrase = new String();
		
		for(int i = phrases.length - 1; i >= 0; i--) {
			revertedPhrase += phrases[i].concat(" ");
		}
		
		return revertedPhrase.trim();
	}

}
