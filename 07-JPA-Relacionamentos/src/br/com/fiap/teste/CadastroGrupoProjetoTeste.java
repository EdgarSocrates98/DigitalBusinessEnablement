package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroGrupoProjetoTeste {

	public static void main(String[] args) {
		//Cadastrar um grupo e um projeto:
		//Instanciar um GrupoAm e um ProjetoAm
		ProjetoAm projeto = new ProjetoAm(0, "Cold orange", Calendar.getInstance(), 
				new GregorianCalendar(2017, Calendar.OCTOBER, 10));
		
		GrupoAm grupo = new GrupoAm(0, "Grupo Am", projeto); 
		
		//Obter uma instancia do EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Intanciar os DAOs
		GrupoAmDAO grupoDao = new GrupoAmDAOImpl(em);
		ProjetoAmDAO projetoDao = new ProjetoAmDAOImpl(em);
		
		//Utiliza os DAOs para cadastrar o projeto e grupo
		try {
			//projetoDao.create(projeto);
			grupoDao.create(grupo);
			//Commit
			projetoDao.commit(); //Salva os dois
		} catch (CommitException e) {
			e.printStackTrace();
		} finally {
			em.close();
			System.exit(0); //Forçar o fechamento do programa
		}
		//Sucesso!
	}
	
}
