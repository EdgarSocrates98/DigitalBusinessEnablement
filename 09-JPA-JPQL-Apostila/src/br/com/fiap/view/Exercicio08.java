package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;

public class Exercicio08 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		System.out.println("Cliente cadastrados: " + dao.buscarQuantidade());
		
		em.close();
		System.exit(0);
	}
	
}
