package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> buscarPorEstado(String estado) {
		TypedQuery<Cliente> query = em.createQuery("from Cliente c where "
				+ "c.endereco.cidade.uf = :es",Cliente.class);
		query.setParameter("es", estado);
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorDiaReserva(int dias) {
		TypedQuery<Cliente> query = em.createQuery(
			"select r.cliente from Reserva r where r.numeroDias = :d",Cliente.class);
		query.setParameter("d", dias);
		query.setMaxResults(50); //máximo de resultados
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscar(String nome, String cidade) {
		TypedQuery<Cliente> query = em.createQuery(
			"from Cliente c where c.nome like :n and c.endereco.cidade.nome like :c",Cliente.class);
		query.setParameter("n", "%" + nome + "%");
		query.setParameter("c", "%" + cidade + "%");
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorEstado(List<String> estados) {
		TypedQuery<Cliente> query = em.createQuery(
			"from Cliente c where c.endereco.cidade.uf in :e",Cliente.class);
		query.setParameter("e", estados);
		return query.getResultList();
	}

	@Override
	public Long buscarQuantidade() {
		TypedQuery<Long> query = 
				em.createQuery("select count(c) from Cliente c",Long.class);
		return query.getSingleResult();
	}

	@Override
	public Cliente buscarPorCPF(String cpf) {
		TypedQuery<Cliente> query = 
				em.createNamedQuery("Cliente.porCpf",Cliente.class);
		query.setParameter("cpf", cpf);
		return query.getSingleResult();
	}

	@Override
	public List<Cliente> buscarPorAnivesario(int mes) {
		TypedQuery<Cliente> query = 
				em.createNamedQuery("Cliente.porDataNascimento",Cliente.class);
		query.setParameter("mes", mes);
		return query.getResultList();
	}

}




