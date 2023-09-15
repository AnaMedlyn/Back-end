package dao;

import model.Planeta;
import java.util.ArrayList;
import java.util.List;

public class PlanetaDAO {
	private List<Planeta> listaDePlaneta;

	public PlanetaDAO() {

		listaDePlaneta = new ArrayList<>();
	}

	public void adicionarPlaneta(Planeta planeta) {

		listaDePlaneta.add(planeta);
	}

	public List<Planeta> obterListaDePlaneta() {

		return listaDePlaneta;
	}

	public void removerPlaneta(Planeta planeta) {

		listaDePlaneta.remove(planeta);
	}

	public void limparListaDePlaneta() {

		listaDePlaneta.clear();
	}
}
