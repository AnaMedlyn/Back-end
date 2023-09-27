package principal;

import java.util.Scanner;

import controller.PaisController;

public class TesteMain {
	public static void main(String[] args) {
		PaisController paisController = new PaisController();
		Scanner scanner = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("== Menu ==");
			System.out.println("1. Adicionar País");
			System.out.println("2. Exibir Lista de Países");
			System.out.println("3. Remover País");
			System.out.println("4. Limpar lista de Países");
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

				paisController.adicionarPais(nome, capital);
				break;

			case 2:
				paisController.exibirListaDePaises();
				break;

			case 3:
				System.out.println("Digite o nome do País que será removido: ");
				scanner.nextLine();
				String nomePais = scanner.nextLine();
				

				paisController.removerPais(nomePais);
				System.out.println("País removido! ");
				break;

			case 4:
				paisController.limparListaDePaises();
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