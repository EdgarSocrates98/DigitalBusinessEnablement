package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public class GenericDAOImpl<T,K> implements GenericDAO<T, K>{

	private EntityManager em;
	
	private Class<T> entidade;
	
	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		entidade = (Class<T>) ((ParameterizedType)
				getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		this.em = em;
	}

	public void create(T entity) {
		em.persist(entity);
	}

	@Override
	public void update(T entity) {
		em.merge(entity);
	}

	@Override
	public void remove(K id) throws EntityNotFoundException {
		T entity = find(id);
		if (entity == null)
			throw new EntityNotFoundException("Entidade não encontrada");
		em.remove(entity);
	}

	@Override
	public T find(K id) {
		return em.find(entidade, id);
	}

	@Override
	public void save() throws CommitException {
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch (Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException("Erro ao realizar o commit");
		}
	}

}


