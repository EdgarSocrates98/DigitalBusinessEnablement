package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class Exercicio11 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em);
		
		List<Pacote> lista = dao.buscarPorPrecoMaximo();
		
		for (Pacote pacote : lista) {
			System.out.println(pacote.getDescricao() + " R$" + pacote.getPreco());
		}
		
		em.close();
		System.exit(0);
	}
	
}
