package view;

import java.util.Scanner;

public class ImcView {

	private Scanner scanner;

    public ImcView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public double lerAltura() {
        System.out.print("Digite a altura (em metros): ");
        return scanner.nextDouble();
    }

    public int lerIdade() {
        System.out.print("Digite a idade: ");
        return scanner.nextInt();
    }

    public String lerSexo() {
        System.out.print("Digite o sexo (masculino ou feminino): ");
        return scanner.next();
    }
}