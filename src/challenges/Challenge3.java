package challenges;

import javax.swing.JOptionPane;

import application.Main;

public class Challenge3 {
	public static void showTestCase() {
		String word = "babad";
		
		JOptionPane.showMessageDialog(null, "Input: " + word + "\n\nOutput: " + repeat(word));
	}

	public static void showChallenge() {
		while(true) {
			try {
				String word = JOptionPane.showInputDialog("Digite a frase/palavra para a busca do palíndromo:")
								.toLowerCase()
								.trim();
				
				if(word == null)
					break;
				
				if(word.isEmpty())
					continue;
				
				JOptionPane.showMessageDialog(null, "Input: " + word + "\n\nOutput: " + repeat(word));
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Houve um erro! Que tal tentar novamente?", null, JOptionPane.ERROR_MESSAGE);
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
		String invertedPhrase = invert(phrase);
		char[] inverted = invert(phrase).toCharArray();
		String repetition = new String();
		
		for(int i = 0; i < inverted.length; i++) {			
			for(int j = i; j < inverted.length; j++) {
				String temp = invertedPhrase.substring(i, j+1);

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
	public static String invert(String phrase) {
		char[] letters = phrase.toCharArray();
		
		String inverted = new String();
		
		for(int i = letters.length - 1; i >= 0; i--) {
			inverted += letters[i];
		}
		
		return inverted;
	}
}
