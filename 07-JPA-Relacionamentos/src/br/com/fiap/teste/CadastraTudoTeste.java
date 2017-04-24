package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ProjetoAmDAO;
import br.com.fiap.dao.impl.ProjetoAmDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Disciplina;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastraTudoTeste {

	public static void main(String[] args) {
		//Cadastrar todas as entidades
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ProjetoAmDAO dao = new ProjetoAmDAOImpl(em);
		
		ProjetoAm projeto = new ProjetoAm(0, "Alegria", Calendar.getInstance(), 
				new GregorianCalendar(2017, Calendar.OCTOBER, 1));
		GrupoAm grupo = new GrupoAm(0, "FIAP Natural", projeto);
		
		projeto.setGrupo(grupo);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Rita");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Barcelos");
		
		grupo.addAluno(aluno1);
		grupo.addAluno(aluno2);
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Digital");
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Enterprise");
		
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		disciplinas.add(disciplina1);
		disciplinas.add(disciplina2);
		
		aluno1.setDisciplinas(disciplinas);
		aluno2.setDisciplinas(disciplinas);
		
		try {
			dao.create(projeto);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}
		
	}
	
}
