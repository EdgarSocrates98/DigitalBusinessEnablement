package br.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.ItemPedidoDAO;
import br.com.fiap.dao.impl.ItemPedidoDAOImpl;
import br.com.fiap.entity.ItemPedido;
import br.com.fiap.entity.Pedido;
import br.com.fiap.entity.Produto;
import br.com.fiap.exception.DBException;

public class Console {

	public static void main(String[] args) {
		//Cadastrar o pedido, produto e item pedido
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		ItemPedidoDAO dao = new ItemPedidoDAOImpl(em);
		
		Pedido pedido = new Pedido();
		pedido.setData(Calendar.getInstance());
		
		Produto produto = new Produto();
		produto.setNome("Pastel");
		
		ItemPedido item = new ItemPedido(produto, pedido, 5, 1);
		
		try {
			dao.cadastrar(item);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
	
}
