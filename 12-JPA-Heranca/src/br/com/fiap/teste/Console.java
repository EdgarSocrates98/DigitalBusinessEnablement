package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.MedicoDAO;
import br.com.fiap.dao.impl.MedicoDAOImpl;
import br.com.fiap.entity.Medico;
import br.com.fiap.exception.DBException;

public class Console {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		Medico medico = new Medico("Dr. José fina", "13213131313", 
				new GregorianCalendar(1975, Calendar.JANUARY, 2), 
				"132131", "Geral");
		
		MedicoDAO dao = new MedicoDAOImpl(em);
		
		try {
			dao.cadastrar(medico);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
	
}
