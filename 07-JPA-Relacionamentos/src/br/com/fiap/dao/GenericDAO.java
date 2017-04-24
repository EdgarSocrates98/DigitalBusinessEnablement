package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public interface GenericDAO<T,K> {

	void create(T entity);
	void update(T entity);
	void delete(K id) throws EntityNotFoundException;
	T findById(K id);
	void commit() throws CommitException;
	
}