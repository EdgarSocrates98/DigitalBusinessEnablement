package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;
import br.com.fiap.dao.AutorDAO;
import br.com.fiap.entity.Autor;

public class AutorDAOImpl 
					extends GenericDAOImpl<Autor, Integer>
												implements AutorDAO{

	public AutorDAOImpl(EntityManager em) {
		super(em);
	}

}
