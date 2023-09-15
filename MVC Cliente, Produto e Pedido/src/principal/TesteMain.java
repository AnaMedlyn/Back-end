package principal;

import model.Cliente;
import model.Pedido;
import model.Produto;
import java.util.Date;

import controller.ClienteController;
import controller.PedidoController;
import controller.ProdutoController;

public class TesteMain {
	public static void main(String[] args) {

		// Cria um objeto Controller PedidoCliente
		ClienteController clienteController = new ClienteController();
		Cliente cliente = clienteController.criarCliente(01, "Ana", "medlyn@gmail.com");
		clienteController.exibirCliente(cliente);

		// Cria um objeto Controller
		ProdutoController produtoController = new ProdutoController();
		Produto produto = produtoController.criarProduto(101, "Celular", 1999.99);
		produtoController.exibirProduto(produto);

		// Cria um objeto data
		Date data = new Date();

		// Cria um objeto Controller
		PedidoController pedidoController = new PedidoController();
		Pedido pedido = pedidoController.criarPedido(01, 101, data, cliente, produto);
		pedidoController.exibirDetalhesPedido(pedido);
		
	}

}

		// Cria um objeto Cliente
		// Cliente cliente = new Cliente(01,"Ana", "medlyn@gmail.com");

		// Cria um objeto Produto
		// Produto produto = new Produto(101, "Celular", 1999.99);

		// Cria um objeto Pedido
		// Pedido pedido = new Pedido (01,101,data,cliente,produto);

		// PedidoView pw = new PedidoView();
		// pw.exibirPedido(pedido);
		// pedido.exibirPedido(pedido);

