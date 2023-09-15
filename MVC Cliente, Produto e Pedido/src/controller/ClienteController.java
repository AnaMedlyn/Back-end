package controller;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	private ClienteView clienteView;

	public ClienteController() {
		setClienteView(new ClienteView());

	}

	public Cliente criarCliente(int idCliente, String nome, String email) {
		Cliente cliente = new Cliente(01, "Ana", "medlyn@gmail.com");
		return cliente;
	}

	public ClienteView getClienteView() {
		return clienteView;
	}

	public void setClienteView(ClienteView clienteView) {
		this.clienteView = clienteView;
	}

	public void exibirCliente(Cliente cliente) {

		clienteView.exibirCliente(cliente);
	}

}
