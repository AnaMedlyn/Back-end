package view;

import model.Produto;

public class ProdutoView {
	public void exibirProduto(Produto produto) {
		System.out.println("== Detalhes do Produto ==");
		System.out.println("ID: " + produto.getIdProduto());
		System.out.println("Nome do Produto: " + produto.getNome());
		System.out.println("Valor: " + produto.getPreco());
		System.out.println("-------------");
	}

}
