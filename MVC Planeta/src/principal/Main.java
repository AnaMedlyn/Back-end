package principal;

import java.util.Scanner;
import controller.PlanetaController;

public class Main {
	public static void main(String[] args) {

		PlanetaController planetaController = new PlanetaController();

		Scanner scanner = new Scanner(System.in);
	

		int opcao = -1;
		while (opcao != 0) {

			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar planeta");
			System.out.println("2. Exibir lista de planeta");
			System.out.println("3. Remover planeta da lista"); // Nova funcionalidade
			System.out.println("4. Limpar lista"); 
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");

			
			try {

				opcao = scanner.nextInt();

				switch (opcao) {

				case 1:

					
					System.out.print("Digite o nome do planeta: ");
					scanner.nextLine();
					
					String nome = scanner.nextLine();

					planetaController.adicionarPlaneta(nome);
					break;

				case 2:
					planetaController.exibirListaDePaises();
					break;

				case 3:
					
					System.out.println("Digite o nome do planeta a ser removido: ");
					
					scanner.nextLine();
					
					String nomePlanetaRemover = scanner.nextLine();

					planetaController.removerPlaneta(nomePlanetaRemover);
					break;

				case 4:
					planetaController.limparListaDePlaneta();
					break;

					case 0:
					System.out.println("Saindo...");
					break;

				default:
					System.out.println("Opção inválida.");
					break;
				}
			}
		}
	
	}
}