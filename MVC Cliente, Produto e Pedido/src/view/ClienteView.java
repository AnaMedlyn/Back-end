package view;

import model.Cliente;

public class ClienteView {
	public static void exibirCliente(Cliente cliente) {
		System.out.println("== Detalhes do Cliente ==");
		System.out.println("ID: " + cliente.getIdCliente());
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("E-mail: " + cliente.getEmail());
		System.out.println("-------------");
	}

}
