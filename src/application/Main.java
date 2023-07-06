package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

import challenges.Challenge1;
import challenges.Challenge2;
import challenges.Challenge3;
import challenges.Challenge4;
import challenges.Challenge5;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static int option = 0;
		
	public static void main(String[] args) {
		//console();
		application();
	}
	
	//Aplicação gráfica
	public static void application() {		
		//Enquanto o usuário não digitar 0, não sairá da função
		while(showOptions()) {
			int testCase = testCase();
			
			if(testCase != -1)
				switch(option) {
					case 1:
						if(testCase == 1)
							Challenge1.showTestCase();
						else
							Challenge1.showChallenge();
						break;
					case 2:
						if(testCase == 1)
							Challenge2.showTestCase();
						else
							Challenge2.showChallenge();
						break;
					case 3:
						if(testCase == 1)
							Challenge3.showTestCase();
						else
							Challenge3.showChallenge();
						break;
					case 4:
						if(testCase == 1)
							Challenge4.showTestCase();
						else
							Challenge4.showChallenge();
						break;
					case 5:
						if(testCase == 1)
							Challenge5.showTestCase();
						else
							Challenge5.showChallenge();
						break;
			}
		}
	}
	
	/*
	 * Função responsável por mostrar as opções da tela de console
	 */
	private static boolean showOptions() {				
		while(true) {
			try{
				String optionString = JOptionPane.showInputDialog(
						"Digite o número do desafio que queira executar!" + "\n" + "\n" +
						"Desafio 1 - Reversão de Ordem" + "\n" +
						"Desafio 2 - Remoção de Duplicatas" + "\n" +
						"Desafio 3 - Busca de Palíndromo" + "\n" +
						"Desafio 4 - Correção de Letras" + "\n" +
						"Desafio 5 - Anagrama de Palíndromo" + "\n "
					);
				
				if(optionString == null) {
					option = 0;
					break;
				}
				
				option = Integer.parseInt(optionString);

				break;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Parece que houve um erro, tente novamente!", null, JOptionPane.ERROR_MESSAGE);
			}
			
		}
				
		return option != 0;
	}
	
	/*
	 * Função responsável por perguntar ao usuário se ele deseja ver o teste de caso
	 */
	public static int testCase() {
		int test = 0;
		
		while(true) {
			try {
				String input = JOptionPane.showInputDialog("Deseja ver o caso de teste? \n1 - Sim\n0 - Não");
				
				if(input == null) {
					test = -1;
					break;
				}
					
				test = Integer.parseInt(input);

				break;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Parece que houve um erro, tente novamente!", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		
		return test;
	}
}
