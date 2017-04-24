package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;
import br.com.fiap.dao.ReceitaDAO;
import br.com.fiap.entity.Receita;
import br.com.fiap.entity.ReceitaPK;

public class ReceitaDAOImpl 
					extends GenericDAOImpl<Receita, ReceitaPK>
														implements ReceitaDAO{

	public ReceitaDAOImpl(EntityManager em) {
		super(em);
	}

}
