package controller;

import dao.TarefaDAO;
import model.Tarefa;
import model.Tarefa.Status;
import view.TarefaView;

public class TarefaController {
	private TarefaView tarefaView;
	private TarefaDAO tarefaDAO;
	
	public TarefaController() {
		tarefaView= new TarefaView();
		tarefaDAO= new TarefaDAO();
	}

	public void adicionarTarefa(Integer id_tarefa, String titulo, String descricao, Status status) {
		Tarefa tarefa = new Tarefa( id_tarefa, titulo, descricao, status);
		tarefaDAO.adicionarTarefas(tarefa);
	}

	public void atualizarTarefa() {

	}

	public void finalizarTarefa() {

	}

	public void listarTarefa() {

	}
}
