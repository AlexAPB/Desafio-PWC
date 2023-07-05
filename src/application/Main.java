package application;

import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static int option = 0;
	
	public static void main(String[] args) {
		showIntroduction();
		
		while(showOptions()) {
			boolean testCase = testCase();
			
			System.out.println();
			System.out.println("Ótimo! Você escolheu o Desafio " + option + ".");

			System.out.println("");
			switch(option) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
			}
			
			System.out.println("\n --------------------------------- \n");
		}
		
		System.out.println("Sistema encerrado.");
	}
	
	public static boolean testCase() {
		boolean test = false;
		
		while(true) {
			try {
				System.out.println("Deseja ver o caso de teste? Digite 1 para Sim e 0 para Não");
				System.out.print("Escolha: ");
				test = sc.nextInt() == 1;
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
		System.out.println("Olá, esse é o desafio de código da PWC! Que tal começar digitando o desafio que deseja ver?");
	}
	
	/*
	 * Função responsável por mostrar as opções da tela de console
	 */
	private static boolean showOptions() {
		System.out.println("Digite o número do desafio que queira executar!");
		System.out.println("Desafio 1 - Reversão de Ordem");
		
		System.out.println("Digite 0 para encerrar o sistema.");
		
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
