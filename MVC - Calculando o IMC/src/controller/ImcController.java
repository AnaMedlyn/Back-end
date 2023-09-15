package controller;

import model.Imc;
import view.ImcView;

public class ImcController {
	private Imc model;
    private ImcView view;

	public ImcController(Imc model, ImcView view) {
        this.model = model;
        this.view = view;
    }

    public void executar() {
        double altura = view.lerAltura();
        int idade = view.lerIdade();
        String sexo = view.lerSexo();

        model = new Imc(altura, idade, sexo);

        double imc = model.calcularIMC();
        String classificacao = model.classificarIMC();

        view.mostrarMensagem("Seu IMC é: " + imc);
        view.mostrarMensagem("Classificação: " + classificacao);
    }
}