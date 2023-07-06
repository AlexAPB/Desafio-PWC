package challenges;

import javax.swing.JOptionPane;

import application.Main;

public class Challenge4 {
	public static void showTestCase() {
		String phrase ="hello. how are you? i'm fine, thank you.";
		
		JOptionPane.showMessageDialog(null, "Input: " + phrase + "\n\nOutput: " + getCorrect(phrase));
	}

	public static void showChallenge() {
		while(true) {
			try {
				String phrase = JOptionPane.showInputDialog("Digite a frase para a mudança de letras:").trim();
				
				if(phrase == null)
					break;
				
				if(phrase.isEmpty())
					continue;
				
				JOptionPane.showMessageDialog(null, "Input: " + phrase + "\n\nOutput: " + getCorrect(phrase));
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Houve um erro! Que tal tentar novamente?", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	

	/*
	 * Função responsável por transformar a primeira letra de cada frase em maiúscula.
	 * Irá separar a frase em letras e verificar uma por uma no laço for se a letra é especial (exclamação, ponto ou interrogação),
	 * e caso seja, irá transformar a próxima letra em maiúscula.
	 * O retorno é a transformação do array de caracteres em uma string através do laço for
	 */
	public static String getCorrect(String phrase) {
		char[] letters = phrase.toCharArray();
		boolean upper = true;
		String correctPhrase = new String();
		String conditionString = "?!.";
		
		for(int i = 0; i < letters.length; i++) {
			if(conditionString.contains(String.valueOf(letters[i]))) {
				upper = true;
			} else {
				if(upper && Character.isLetterOrDigit(letters[i])) {
					letters[i] = Character.toUpperCase(letters[i]);
					upper = false;
				}
			}
		}
		
		for(char c : letters) {
			correctPhrase += c;
		}
		
		return correctPhrase;
	}
}
