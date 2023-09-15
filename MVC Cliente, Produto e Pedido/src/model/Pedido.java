package model;

import java.util.Date;

public class Pedido {
	private int idPedido;
	private int quantidade;
	private Date data;
	private Cliente cliente;
	private Produto produto;
	
	public Pedido(int idPedido, int quantidade, Date data, Cliente cliente, Produto produto) {
		this.criarPedido(idPedido,quantidade,data,cliente, produto);
	}
	
	public Pedido() {}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void criarPedido(int idPedido, int quantidade, Date data, Cliente cliente, Produto produto) {
		this.idPedido = idPedido;
		this.quantidade = quantidade;
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
	}
	
	
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", quantidade=" + quantidade + ", data=" + data + ", cliente=" + cliente
				+ ", produto=" + produto + ", getIdPedido()=" + getIdPedido() + ", getQuantidade()=" + getQuantidade()
				+ ", getData()=" + getData() + ", getCliente()=" + getCliente() + ", getProduto()=" + getProduto()
				+ "]";
	}
	
}
