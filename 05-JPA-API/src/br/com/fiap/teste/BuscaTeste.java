package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Faculdade;

public class BuscaTeste {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = factory.createEntityManager();
		
										//Código da tabela
		Faculdade facu = em.find(Faculdade.class, 1);
		
		System.out.println(facu.getNome());
		
		em.close();
		factory.close();
	}
	
}