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
			System.out.println("1. Adicionar Pa�s");
			System.out.println("2. Exibir Lista de Pa�ses");
			System.out.println("3. Remover Pa�s");
			System.out.println("4. Limpar lista de Pa�ses");
			System.out.println("0. Sair");
			System.out.println("Escolha uma op��o:  ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do Pa�s: ");
				scanner.nextLine();
				String nome = scanner.nextLine();

				System.out.println("Digite a Capital do Pa�s: " + nome + ": ");
				String capital = scanner.nextLine();

				paisController.adicionarPais(nome, capital);
				break;

			case 2:
				paisController.exibirListaDePaises();
				break;

			case 3:
				System.out.println("Digite o nome do Pa�s que ser� removido: ");
				scanner.nextLine();
				String nomePais = scanner.nextLine();
				

				paisController.removerPais(nomePais);
				System.out.println("Pa�s removido! ");
				break;

			case 4:
				paisController.limparListaDePaises();
				break;

			case 0:
				System.out.println("Saindo... ");
				break;

			default:
				System.out.println("Op��o Invalida! ");
				break;
			}

		}
	}

}