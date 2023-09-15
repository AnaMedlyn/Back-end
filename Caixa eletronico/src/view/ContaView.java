package view;

import java.util.Scanner;
import model.Conta;
import controller.ContaController;

public class ContaView {
    public static void exibirSaldo(Conta conta) {
        System.out.println("Seu saldo atual: " + conta.getSaldo());
    }

    public void mostrarMenu(ContaController contaController) {
        Scanner lerTeclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("Caixa Eletr�nico ");
            System.out.println(" 1 - Depositar Valor");
            System.out.println(" 2 - Sacar Valor");
            System.out.println(" 3 - Exibir Saldo");
            System.out.println(" 4 - Sair do Sistema");
            System.out.println("Escolha uma op��o:");
            opcao = lerTeclado.nextInt();

            switch (opcao) {
                case 1:
                    double valorDeposito;
                    System.out.println("Digite o valor a ser depositado: ");
                    valorDeposito = lerTeclado.nextDouble();
                    contaController.depositar(valorDeposito);
                    break;

                case 2:
                     double valorSacar;
                    System.out.println("Digite o valor a ser sacado: ");
                    valorSacar = lerTeclado.nextDouble();
                    contaController.sacar(valorSacar);
                    break;
                    
                case 3:
                    contaController.exibirSaldo();
                    break;
                   

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Erro, digite o c�digo correto.");
                    break;
            }
        }

        lerTeclado.close();
    }
}