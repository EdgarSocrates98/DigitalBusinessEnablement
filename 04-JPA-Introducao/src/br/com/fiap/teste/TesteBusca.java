package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Carro;
import br.com.fiap.entity.Cliente;

public class TesteBusca {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence
				.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Buscar um carro e um cliente       //código
		Cliente cliente = em.find(Cliente.class, 1);
		Carro carro = em.find(Carro.class, "DDD1234");
		
		System.out.println("Carro: " + carro.getModelo());
		System.out.println("Cliente: " + cliente.getNome());
		
		em.close();
		fabrica.close();		
	}
	
}




