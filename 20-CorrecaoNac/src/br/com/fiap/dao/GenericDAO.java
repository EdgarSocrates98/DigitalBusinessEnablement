package br.com.fiap.dao;

import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitErrorException;

public interface GenericDAO<T,K> {

	void cadastrar(T entidade);
	void excluir(K codigo) throws CodigoInvalidoException;
	void commit() throws CommitErrorException;
	void atualizar(T entidade);
	T buscar(K codigo);
	
}
