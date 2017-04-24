package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class ConsoleView {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		PacoteDAO dao = new PacoteDAOImpl(em);

		List<Pacote> pacotes = dao.listarPacotes();
		
		for (Pacote pacote : pacotes) {
			System.out.println(pacote.getDescricao() + " R$" + pacote.getPreco());
		}
				
		List<Pacote> pacotesDesc = dao.buscarPorDescricao("a");
		
		for (Pacote pacote : pacotesDesc) {
			System.out.println(pacote.getDescricao() + " R$" + pacote.getPreco());
		}
		
		em.close();
		System.exit(0);
	}

}
