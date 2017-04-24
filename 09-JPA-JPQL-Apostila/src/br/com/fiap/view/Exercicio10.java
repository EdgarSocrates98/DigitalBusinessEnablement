package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;

public class Exercicio10 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em );
		
		Calendar inicio = new GregorianCalendar(2017, Calendar.JANUARY, 1);
		Calendar fim = new GregorianCalendar(2017, Calendar.DECEMBER, 30);
		
		System.out.println("Pacotes cadastrados: " + dao.buscarQuantidade(inicio, fim));
		
 		em.close();
		System.exit(0);
	}
	
}
