package principal;

import java.util.Scanner;

import controller.PaisController;

public class TesteMain {
	public static void main (String[] args) {
	PaisController paiscontroller = new PaisController();
	Scanner scanner = new Scanner (System.in);
	
	int opcao = -1;
	while(opcao != 0) {
		System.out.println("== Menu ==");
		System.out.println("1. Adicionar País");
		System.out.println("2. Exibir Lista de Países");
		System.out.println("0. Sair");
		System.out.println("Escolha uma opção:  ");
		opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1: 
			System.out.println("Digite o nome do País: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			System.out.println("Digite a Capital do País: " + nome + ": ");
			String capital = scanner.nextLine();
		
			
			paiscontroller.adicionarPais(nome, capital);
			break;
		
		case 2: 
			paiscontroller.exibirListaDePaises();
			break;
			
		case 0: 
			System.out.println("Saindo... ");
			break;
			
		default:
		    System.out.println("Opção Invalida! ");
		    break;
			}
		
		}
	}
}