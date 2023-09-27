package principal;

import controller.TarefaController;
import model.Tarefa;

public class Main {
	public static void main(String [] args) {
		TarefaController tarefaController = new TarefaController ();
		
		tarefaController.adicionarTarefa(3,"Estudar","Preciso estudar JAVA", Tarefa.Status.A);
		
	}

}
