package br.com.fiap.dao;

import java.util.List;
import br.com.fiap.entity.Endereco;

public interface EnderecoDAO extends GenericDAO<Endereco,Integer>{

	List<Endereco> buscarPorCep(String cep);
	
}