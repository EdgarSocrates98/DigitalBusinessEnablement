package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class Exercicio02 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		PacoteDAO dao = new PacoteDAOImpl(em);
		TransporteDAO transporteDao = new TransporteDAOImpl(em);
		
		Transporte transporte = transporteDao.pesquisar(3);
		List<Pacote> lista = dao.buscarPorTransporte(transporte);
		
		for (Pacote pacote : lista) {
			System.out.println(pacote.getDescricao() + 
								" " + pacote.getTransporte().getEmpresa());
		}
		
		em.close();
		System.exit(0);
	}
	
}
