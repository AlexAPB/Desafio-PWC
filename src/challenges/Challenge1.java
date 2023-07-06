package challenges;

import javax.swing.JOptionPane;

import application.Main;

public class Challenge1 {
	public static void showTestCase() {
		String phrase = "Hello, World! OpenAI is amazing.";
		
		JOptionPane.showMessageDialog(null, "Input: " + phrase + "\n\nOutput: " + revert(phrase));
	}

	public static void showChallenge() {
		while(true) {
			try {
				String phrase = JOptionPane.showInputDialog("Digite a frase a ser revertida:");
				
				if(phrase == null)
					break;
				
				if(phrase.isEmpty())
					continue;
					
				JOptionPane.showMessageDialog(null, "Input: " + phrase + "\n\nOutput: " + revert(phrase).trim());
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Houve um erro! Que tal tentar novamente?", null, JOptionPane.ERROR_MESSAGE);
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
