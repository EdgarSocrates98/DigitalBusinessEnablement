package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LojaDAO;
import br.com.fiap.entity.Loja;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public class LojaDAOImpl implements LojaDAO {

	private EntityManager em;
	
	public LojaDAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void create(Loja loja) {
		em.persist(loja);
	}

	@Override
	public void update(Loja loja) {
		em.merge(loja);
	}

	@Override
	public void delete(int id) throws EntityNotFoundException {
		Loja loja = findById(id);
		if (loja == null)
			throw new EntityNotFoundException("Loja não encontrada");
		em.remove(loja);
	}

	@Override
	public Loja findById(int id) {
		return em.find(Loja.class, id);
	}
	
	@Override
	public void commit() throws CommitException {
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e){
			//Valida se está ativo a transação
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException("Commit error");
		}
	}
	
}