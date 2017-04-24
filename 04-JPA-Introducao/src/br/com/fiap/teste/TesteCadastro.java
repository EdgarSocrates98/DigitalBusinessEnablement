package br.com.fiap.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Carro;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Combustivel;

public class TesteCadastro {

	public static void main(String[] args) {
		//Obter um EntityManagerFactory
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Obter um EntityManager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um carro e cliente
		Carro carro = new Carro("DDD1234", "Hb20", "Hyundai",
			"Prata", Calendar.getInstance(), 2017, null, 
			Combustivel.FLEX);
		
		Cliente cliente = new Cliente(0, "Thiago", "123456");
		
		//Persistir o carro e cliente
		em.getTransaction().begin();

		em.persist(cliente);
		em.persist(carro);
		
		//Commit
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}
	
}




