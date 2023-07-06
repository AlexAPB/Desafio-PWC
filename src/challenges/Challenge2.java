package challenges;

import javax.swing.JOptionPane;

import application.Main;

public class Challenge2 {
	public static void showTestCase() {
		String phrase = "Hello, World!";
		
		JOptionPane.showMessageDialog(null, "Input: " + phrase + "\n\nOutput: " + remove(phrase));
	}

	public static void showChallenge() {
		while(true) {
			try {
				String phrase = JOptionPane.showInputDialog("Digite a frase para a remoção de duplicatas:");
				
				if(phrase == null)
					break;
				
				if(phrase.isEmpty())
					continue;
					
				JOptionPane.showMessageDialog(null, "Input: " + phrase + "\n\nOutput: " + remove(phrase.trim()));
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Houve um erro! Que tal tentar novamente?", null, JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	/*
	 * Função responsável por remover as letras duplicatas,
	 * irá receber a frase e separá-la em letras, e passar em um laço for
	 * para verificar se a letra já foi escrita ou não - ou se é exceção.
	 * após isso irá adicionar a letra à string caso não tenha sido usada
	 */
	public static String remove(String phrase) {
		char[] letters = phrase.toCharArray();
		String usedLetters = new String();
		
		//Neste código, será apenas considerado 'caractere' os caracteres alfabéticos e numéricos,
		//Sendo assim, espaços, pontos e caracteres especiais não serão removidos
		String allowedLetters = new String(
				"0123456789"
				+ "aáàãâbcdeéèêfghiíìîjklmnoóòõôpqrstuúùûvwxyzç"
				+ "AÁÀÃÂBCDEÉÈÊFGHIÍÌÎJKLMNOÓÒÔÕPQRSTUÚÙÛVXYZÇ"
				);
		
		String result = new String();
				
		for(char l : letters) {
			if(allowedLetters.contains(String.valueOf(l))) {
				if(!usedLetters.contains(String.valueOf(l))) {
					usedLetters += l;
					result += l;
				}
			} else {
				result += l;
			}
		}
		
		return result.trim();
	}
}
