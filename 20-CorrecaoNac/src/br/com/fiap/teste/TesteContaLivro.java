package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EditoraDAO;
import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.EditoraDAOImpl;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Editora;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteContaLivro {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		LivroDAO dao = new LivroDAOImpl(em);
		EditoraDAO editoraDao = new EditoraDAOImpl(em);
		
		Editora editora = editoraDao.buscar(1);
		long qtd = dao.contarLivros(editora);
		
		System.out.println("Quantidade de livros: " + qtd);
		
		em.close();
		System.exit(0);
	}
	
}
