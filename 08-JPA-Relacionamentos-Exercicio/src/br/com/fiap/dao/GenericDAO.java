package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public interface GenericDAO<T,K> {

	void create(T entity);
	void update(T entity);
	void remove(K id) throws EntityNotFoundException;
	T find(K id);
	void save() throws CommitException;
	
}
