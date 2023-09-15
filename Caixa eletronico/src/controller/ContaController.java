package controller;

import model.Conta;
import view.ContaView;

public class ContaController {
    private Conta conta;

    public ContaController(Conta conta) {
        this.conta = conta;
    }

    public void exibirSaldo() {
		ContaView.exibirSaldo(conta);
    }

    public void sacar(double valor) {
        if (valor <= conta.getSaldo()) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque de " + valor + " reais feito com sucesso!");
            exibirSaldo();
        } else {
            System.out.println("Erro! O valor digitado excede o seu saldo!");
        }
    }

    public void depositar(double valor) {
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depósito de " + valor + " reais feito com sucesso!");
        exibirSaldo();
    }
}