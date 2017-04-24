package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> listarPacotes() {
		TypedQuery<Pacote> query = em.createQuery("from Pacote",Pacote.class);
		return query.getResultList();
	}

	@Override
	public List<Pacote> buscarPorDescricao(String desc) {
		TypedQuery<Pacote> query = em.createQuery("from Pacote where descricao like :n",Pacote.class);
		query.setParameter("n", "%"+ desc + "%");
		return query.getResultList();
	}

	@Override
	public List<Pacote> buscarPorTransporte(Transporte transporte) {
		TypedQuery<Pacote> query = em.createQuery("from Pacote p where "
				+ "p.transporte = :t",Pacote.class);
		query.setParameter("t", transporte);
		return query.getResultList();
	}

	@Override
	public List<Pacote> buscarPorData(Calendar inicio, Calendar fim) {
		TypedQuery<Pacote> query = 
				em.createQuery("from Pacote p where p.dataSaida between :i and :f",Pacote.class);
		query.setParameter("i", inicio);
		query.setParameter("f", fim);
		return query.getResultList();
	}

	@Override
	public Double buscarMediaPreco() {
		TypedQuery<Double> query = 
			em.createQuery("select avg(p.preco) from Pacote p",Double.class);
		return query.getSingleResult();
	}

	@Override
	public Long buscarQuantidade(Calendar inicio, Calendar fim) {
		TypedQuery<Long> query = em.createQuery("select count(p) from Pacote p "
				+ "where p.dataSaida between :i and :f",Long.class);
		query.setParameter("i", inicio);
		query.setParameter("f", fim);
		return query.getSingleResult();
	}

	@Override
	public List<Pacote> buscarPorPrecoMaximo() {
		TypedQuery<Pacote> query = em.createQuery(
			"from Pacote p1 where p1.preco = (select max(p.preco) from Pacote p)",Pacote.class);
		return query.getResultList();
	}

}






