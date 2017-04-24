package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Faculdade;

public class CadastroTeste {

	public static void main(String[] args) {
		//Cadastrar uma faculdade
		
		//Código para cadastrar é 0
		Faculdade facu = new Faculdade(0,"FIAP",
				"Rua das Olimipiadas, 100","+55 (11) 87845321",
				new GregorianCalendar(1993, Calendar.JANUARY, 2));
		
		//Fabrica de gerenciador de entidades
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Gerenciador de entidades
		EntityManager em = factory.createEntityManager();
		
		//Cadastra no banco
		em.persist(facu);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
	}
	
}