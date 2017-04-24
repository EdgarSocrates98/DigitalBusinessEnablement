package br.com.fiap.dao.impl;

import br.com.fiap.entity.Tecnico;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TecnicoDAO;

public class TecnicoDAOImpl extends GenericDAOImpl<Tecnico, Integer>
							implements TecnicoDAO{

	public TecnicoDAOImpl(EntityManager em) {
		super(em);
	}

}
