package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Faculdade;

public class RefreshTeste {

	public static void main(String[] args) {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = factory.createEntityManager();
		
		//Buscar uma faculdade
		Faculdade facu = em.find(Faculdade.class, 1);
		
		//Imprimir o nome da faculdade
		System.out.println(facu.getNome());
		
		//Alterar no objeto o nome da faculdade
		facu.setNome("Faculdade de Informática e Administração Paulista");
		
		//Imprimir o nome
		System.out.println(facu.getNome());
		
		//Refresh
		em.refresh(facu);
		
		//Imprimir o nome
		System.out.println(facu.getNome());
		
		em.close();
		factory.close();
	}
	
}
