package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	//Atributo que armazena a única instância de EMF
	private static EntityManagerFactory factory;
	
	//Construtor privado
	private EntityManagerFactorySingleton() {}
	
	public static EntityManagerFactory getInstance(){
		if (factory == null){
			factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}
		return factory;
	}
	
}
