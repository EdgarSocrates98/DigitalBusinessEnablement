package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fiap.dao.EnderecoDAO;
import br.com.fiap.entity.Endereco;

public class EnderecoDAOImpl extends GenericDAOImpl<Endereco,Integer> implements EnderecoDAO{

	public EnderecoDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Endereco> buscarPorCep(String cep) {
		Query query = em.createNativeQuery(
				"select * from endereco where cep like :c", Endereco.class);
		query.setParameter("c", "%"+ cep + "%");
		return query.getResultList();
	}

}
