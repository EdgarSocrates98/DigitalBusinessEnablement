package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ContaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		ContaDAO dao = new ContaDAOImpl(em);
		
		Agencia agencia = new Agencia("Vila Olimpia");
		ContaCorrente cc = new ContaCorrente(agencia, 10, 50, 1000);
		ContaPoupanca cp = new ContaPoupanca(agencia, 10, 0.05);
		
		try {
			dao.cadastrar(cp);
			dao.cadastrar(cc);
			dao.salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		System.exit(0);
	}
	
}



