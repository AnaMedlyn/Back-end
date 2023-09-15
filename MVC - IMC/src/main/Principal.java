package main;

import controller.ImcController;
import model.Imc;
import view.ImcView;

public class Principal {
	  public static void main(String[] args) {
	        Imc model = new Imc(0, 0, "");
	        ImcView view = new ImcView();
	        ImcController controller = new ImcController(model, view);

	        controller.executar();
	 }
}






