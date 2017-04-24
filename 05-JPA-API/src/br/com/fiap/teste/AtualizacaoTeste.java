package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Faculdade;

public class AtualizacaoTeste {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = factory.createEntityManager();
		
		//Atualizar uma faculdade
		Faculdade facu = em.find(Faculdade.class, 1);
		facu.setTelefone("+55 (11) 45613654646");
		
		em.merge(facu); //Atualizar 
		
		System.out.println(facu.getTelefone());
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		factory.close();
	}
	
}
