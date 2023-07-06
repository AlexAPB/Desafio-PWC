package challenges;

import application.Main;

public class Challenge3 {
	public static void showTestCase() {
		String word = repeat("babad");
		
		System.out.println("Palíndromo: " + word);	
	}

	public static void showChallenge() {
		while(true) {
			try {
				System.out.print("Digite a frase/palavra para a busca do palíndromo: ");
				String word = repeat(Main.sc.nextLine().toLowerCase().trim());
				
				System.out.println("Palíndromo: " + word);
				break;
			}catch(Exception e) {
				System.out.println("Houve um erro! Que tal tentar novamente?");
			}
		}
	}
	
	/*
	 * Função responsável por buscar palíndromos em uma frase.
	 * Irá funcionar pegando a distância dos laços i e j para reconstruir a frase no laço k
	 * usando o array inverted (começando do index i e terminando no j).
	 * Após montar a palavra, irá pegar a frase construída e verificar se ela existe na frase original.
	 * 
	 * A função irá transformar todas as letras em minúsculas para aprimorar a busca
	 */
	public static String repeat(String phrase) {
		char[] inverted = invert(phrase);
		String repetition = new String();
		
		for(int i = 0; i < inverted.length; i++) {			
			for(int j = i; j < inverted.length; j++) {
				String temp = new String();

				for(int k = i; k <= j; k++) {
					temp += inverted[k];
				}
				
				if(phrase.contains(temp) && temp.length() >= repetition.length()) {
					repetition = temp;
				}
			}
		}
		
		return repetition;
	}
	

	/*
	 * Função responsável por separar a frase em letra por letra em um array de char.
	 * Irá transformar a frase em um array de char e percorrer ele de trás para frente no laço for, 
	 * adicionando as letras a um outro array
	 */
	public static char[] invert(String phrase) {
		char[] letters = phrase.toCharArray();
		
		char[] inverted = new char[letters.length];
		int index = 0;
		
		for(int i = letters.length - 1; i >= 0; i--) {
			inverted[index++] = letters[i];
		}
		
		return inverted;
	}
}
