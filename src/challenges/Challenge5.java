package challenges;

import javax.swing.JOptionPane;

import application.Main;

public class Challenge5 {
	public static void showTestCase() {
		String word = "racecar";
		String inverted = invert(word);
		
		JOptionPane.showMessageDialog(null, "Input: " + word + "\n\nOutput: " + inverted.equals(word));
	}

	public static void showChallenge() {
		while(true) {
			try {
				String word = JOptionPane.showInputDialog("Digite a frase/palavra para a verificação de anagrama: ").trim();
				String inverted = invert(word);
				
				if(word == null)
					break;
				
				if(word.isEmpty())
					continue;
				
				JOptionPane.showMessageDialog(null, "Input: " + word + "\n\nOutput: " + inverted.equals(word));
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Houve um erro! Que tal tentar novamente?", null, JOptionPane.ERROR_MESSAGE);
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
