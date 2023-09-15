package controller;

import dao.PlanetaDAO;
import model.Planeta;
import view.PlanetaView;

import java.util.List;
import java.util.NoSuchElementException;

public class PlanetaController {

	private PlanetaDAO planetaDAO;

	private PlanetaView planetaView;

	public PlanetaController() {
		planetaDAO = new PlanetaDAO();
		planetaView = new PlanetaView();
	}

	public void adicionarPlaneta(String nome) {
		Planeta planeta = new Planeta(nome);
		planetaDAO.adicionarPlaneta(planeta);
	}

	public void exibirListaDePaises() {

		List<Planeta> listaDePlaneta = planetaDAO.obterListaDePlaneta();
		planetaView.exibirListaDePlaneta(listaDePlaneta);
	}

	public void removerPlaneta(String nomePlanetaRemover) {
		boolean planetaRemovido = false;

		for (Planeta planeta : planetaDAO.adicionarPlaneta(planeta)){

			if (planeta.getNome().equalsIgnoreCase(nomePlanetaRemover)) {

				planetaDAO.removerPlaneta(planeta);

				planetaRemovido = true;

				break;
			}
		}

		planetaView.removerPlaneta(planetaRemovido);
	}

	public void limparListaDePlaneta() {
		planetaDAO.limparListaDePlaneta();
		planetaView.limparListaDePlaneta();
	}
}