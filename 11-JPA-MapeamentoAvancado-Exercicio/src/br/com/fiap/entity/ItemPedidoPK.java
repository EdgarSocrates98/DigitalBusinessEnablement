package br.com.fiap.entity;

import java.io.Serializable;

public class ItemPedidoPK implements Serializable {

	private int pedido;
	
	private int produto;
	
	public ItemPedidoPK(int pedido, int produto) {
		super();
		this.pedido = pedido;
		this.produto = produto;
	}

	public ItemPedidoPK() {
		super();
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}
}
