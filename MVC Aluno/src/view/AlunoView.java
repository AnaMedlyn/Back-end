package view;

import java.util.List;
import java.util.Scanner;
import controller.AlunoController;
import model.Aluno;

public class AlunoView {
	private AlunoController alunoController;
	private Scanner scanner;

	public AlunoView() {
		alunoController = new AlunoController();
		scanner = new Scanner(System.in);
	}

	public void exibirMenu() {
		int opcao = -1;
		while (opcao != 0) {
			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar aluno");
			System.out.println("2. Listar alunos");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o ID do aluno: ");
				int id = scanner.nextInt();
				System.out.print("Digite o nome do aluno: ");
				String nome = scanner.next();
				System.out.print("Digite a idade do aluno: ");
				int idade = scanner.nextInt();
				alunoController.adicionarAluno(id, nome, idade);
				break;
			case 2:
				listarAlunos();
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Op��o Invalida.");
				break;
			}
		}
	}

	public void listarAlunos() {
		List<Aluno> aluno = alunoController.listarAlunos();
		if (aluno.isEmpty()) {
			System.out.println("Não há alunos cadastrados.");
		} else {
			System.out.println("Lista de Alunos:");
			for (Aluno alunos : aluno) {
				System.out.println(
						"ID: " + alunos.getId() + ", Nome: " + alunos.getNome() + ", Idade: " + alunos.getIdade());
			}
		}
	}
}