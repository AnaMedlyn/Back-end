package principal;

import controller.ContaController;
import model.Conta;
import view.ContaView;

public class TesteMain {
    public static void main(String[] args) {
        Conta caixaEletronicoModel = new Conta(0);
        ContaView caixaEletronicoView = new ContaView();
        ContaController caixaEletronicoController = new ContaController(caixaEletronicoModel);

        caixaEletronicoView.mostrarMenu(caixaEletronicoController);
    }
}






