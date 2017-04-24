package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class BuscaProjetoTeste {

	public static void main(String[] args) {
		//Buscar um projeto e exibir o nome do grupo:
		//Obter uma instancia do EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Instanciar um ProjetoDAOImpl
		ProjetoAmDAO dao = new ProjetoAmDAOImpl(em);
		
		//Buscar o projeto de código 1
		ProjetoAm projeto = dao.findById(1);
		
		//Exibir o nome do projeto e o nome do grupo
		System.out.println(projeto.getNome());
		System.out.println(projeto.getGrupo().getNome());
		
		//Sucesso!
		em.close();
		System.exit(0);
	}
	
}
