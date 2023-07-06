package challenges;

import application.Main;

public class Challenge5 {
	public static void showTestCase() {
		String word = "racecar";
		String inverted = invert(word);
		
		System.out.println(word + "\n" + word.equals(inverted));	
	}

	public static void showChallenge() {
		while(true) {
			try {
				System.out.print("Digite a frase/palavra para a verificação de anagrama: ");
				String word = Main.sc.nextLine().toLowerCase().trim();
				String reverted = invert(word);
				
				System.out.println(word + "\n" + reverted.equals(word));
				break;
			}catch(Exception e) {
				System.out.println("Houve um erro! Que tal tentar novamente?");
			}
		}
	}	

	/*
	 * Função responsável por separar a frase em letra por letra em um array de char.
	 * Irá transformar a frase em um array de char e percorrer ele de trás para frente no laço for, 
	 * adicionando as letras a uma string
	 */
	public static String invert(String phrase) {
		char[] letters = phrase.toCharArray();
		
		String inverted = new String();
		
		for(int i = letters.length - 1; i >= 0; i--) {
			inverted += letters[i];
		}
		
		return inverted;
	}
}
