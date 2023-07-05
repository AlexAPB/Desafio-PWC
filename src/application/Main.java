package application;

import java.util.Scanner;

import challenges.Challenge1;
import challenges.Challenge2;
import challenges.Challenge3;
import challenges.Challenge4;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static int option = 0;
	
	public static void main(String[] args) {
		showIntroduction();
		
		//Enquanto o usuário não digitar 0, não sairá da função
		while(showOptions()) {
			boolean testCase = testCase();
			
			System.out.println();
			System.out.println("Ótimo! Você escolheu o Desafio " + option + ". Pressione enter apenas após obter o resultado desejado para prosseguir!");

			System.out.println("");
			switch(option) {
				case 1:
					if(testCase)
						Challenge1.showTestCase();
					else
						Challenge1.showChallenge();
					break;
				case 2:
					if(testCase)
						Challenge2.showTestCase();
					else
						Challenge2.showChallenge();
					break;
				case 3:
					if(testCase)
						Challenge3.showTestCase();
					else
						Challenge3.showChallenge();
					break;
				case 4:
					if(testCase)
						Challenge4.showTestCase();
					else
						Challenge4.showChallenge();
					break;
				case 5:
					break;
			}
			
			sc.nextLine();
			System.out.println("--------------------------------- \n");
		}
		
		System.out.println("Sistema encerrado.");
	}
	
	/*
	 * Função responsável por perguntar ao usuário se ele deseja ver o teste de caso
	 */
	public static boolean testCase() {
		boolean test = false;
		
		while(true) {
			try {
				System.out.println("Deseja ver o caso de teste? Digite 1 para Sim e 0 para Não");
				System.out.print("Escolha: ");
				test = sc.nextInt() == 1;
				
				//Irá consumir o conteúdo no buffer
				sc.nextLine();
				break;
			}catch(Exception e) {
				System.out.println("Parece que houve um erro! Tente novamente.");
				
				//Irá consumir o conteúdo no buffer
				sc.next();
			}
		}
		
		return test;
	}
		
	
	/*
	 * Função responsável por mostrar uma apresentação para o usuário
	 */
	private static void showIntroduction() {
		System.out.println("Olá, esse é o desafio de código da PWC! Que tal começar digitando o desafio que deseja ver?\n");
	}
	
	/*
	 * Função responsável por mostrar as opções da tela de console
	 */
	private static boolean showOptions() {
		System.out.println("Digite o número do desafio que queira executar!");
		System.out.println("	•Desafio 1 - Reversão de Ordem");
		System.out.println("	•Desafio 2 - Remoção de Duplicatas");
		System.out.println("	•Desafio 3 - Busca de Palíndromo");
		System.out.println("	•Desafio 4 - Correção de Letras");
		
		System.out.println("	•Digite 0 para encerrar o sistema.\n");
		
		while(true) {
			try{
				System.out.print("Opção: ");

				option = sc.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("Parece que houve um erro! Tente novamente:");
				
				//Consome o que está no buffer
				sc.next();
			}
			
		}
				
		return option != 0;
	}
}
