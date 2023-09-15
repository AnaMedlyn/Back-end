package controller;

import java.util.NoSuchElementException;
import dao.PaisDao;
import exception.MenosDeQuatroItensException;
import model.Pais;
import view.PaisView;

public class PaisController {
	private PaisDao paisDAO;
	private PaisView paisView;

	public PaisController() {
		paisView = new PaisView();
		paisDAO = new PaisDao();
	}

	public void adicionarPais(String nome, String capital) {
		Pais pais = new Pais(nome, capital);
		paisDAO.adicionarPais(pais);
	}

	public void exibirListaDePaises() {
		paisView.exibirListaDePaises(paisDAO.obterListaDePaises());
	}

	public void removerPais(String nomePaisRemover) {
		boolean paisRemovido = paisDAO.removerPais(nomePaisRemover);
		paisView.removerPais(paisRemovido);
	}

	public void limparListaDePaises() {
		paisDAO.limparListaDePaises();
		paisView.limparListaDePaises();
	}
	
	public void primeiro() {
		try {
			Pais pais = paisDAO.getPrimeiroPais();
			paisView.exibirPais(pais);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}

	public void terceiro() {
		try {
			Pais pais = paisDAO.getTerceiroPais();
			paisView.exibirPais(pais);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}

	public void quarto() {
		try {
			Pais pais = paisDAO.getQuartoPais();
			paisView.exibirPais(pais);
		} catch (MenosDeQuatroItensException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
