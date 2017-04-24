package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Faculdade;

public class RemoveTeste {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = factory.createEntityManager();
		
		//Remover
		Faculdade facu = em.find(Faculdade.class, 1);
		em.remove(facu);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}
	
}
