package br.com.fiap.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Livro;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteBuscaLivroEditora {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		LivroDAO dao = new LivroDAOImpl(em);
		
		List<Livro> lista = dao.buscarPorEditora("a");
		
		for (Livro livro : lista) {
			System.out.println(livro.getTitulo() + " - " +
										livro.getEditora().getNome());
		}
		
		em.close();
		System.exit(0);
	}
	
}
