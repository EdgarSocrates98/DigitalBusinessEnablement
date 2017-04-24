package br.com.fiap.dao;

import br.com.fiap.entity.Loja;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public interface LojaDAO {

	// Assinatura dos métodos
	void create(Loja loja);

	void update(Loja loja);

	void delete(int id) throws EntityNotFoundException;

	Loja findById(int id);

	void commit() throws CommitException;
	
}