package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Livro;

public class LivroDAOImpl 
				extends GenericDAOImpl<Livro, String>
							implements LivroDAO{

	public LivroDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Livro> buscarPorTitulo(String titulo) {
		return em.createQuery("from Livro li where li.titulo like :titulo"
				,Livro.class).setParameter("titulo", "%" +  titulo + "%")
				.setMaxResults(50).getResultList();
	}

	@Override
	public long contarLivros(Editora editora) {
		return em.createQuery("select count(li) from Livro li where "
				+ "li.editora = :e",Long.class)
				.setParameter("e", editora).getSingleResult();
	}

	@Override
	public List<Livro> buscarPorEditora(String editora) {
		return em.createQuery("from Livro li where li.editora.nome like :e"
				,Livro.class).setParameter("e","%"+editora+"%")
				.getResultList();
	}
	
	/*@Override
	public List<Livro> buscarPorTitulo(String titulo) {
		TypedQuery<Livro> query = em.createQuery("from Livro li where "
				+ "li.titulo like :titulo",Livro.class);
		query.setParameter("titulo", "%" +  titulo + "%");
		query.setMaxResults(50);
		return query.getResultList();
	}*/

}




