package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.GrupoAmDAO;
import br.com.fiap.dao.impl.GrupoAmDAOImpl;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.GrupoAm;
import br.com.fiap.entity.ProjetoAm;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroGrupoProjetoAlunoTeste {

	public static void main(String[] args) {
		//Obter uma instancia do EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Instanciar o GrupoAmDAOImpl
		GrupoAmDAO dao = new GrupoAmDAOImpl(em);
		
		//Instanciar um projeto
		ProjetoAm projeto = new ProjetoAm(0, "Projeto AM", Calendar.getInstance(),
				new GregorianCalendar(2017, Calendar.OCTOBER, 10));
		
		//Instanciar um grupo
		GrupoAm grupo = new GrupoAm(0, "Grupo Am", projeto);
		
		//Instanciar os alunos
		Aluno aluno1 = new Aluno(0,"Matheus", grupo);
		Aluno aluno2 = new Aluno(0, "Guilherme", grupo);
		Aluno aluno3 = new Aluno(0, "João",grupo);
		Aluno aluno4 = new Aluno(0, "Onireves",grupo);
		
		//Adicionar os alunos no grupo (addAlunos)
		grupo.addAluno(aluno1);
		grupo.addAluno(aluno2);
		grupo.addAluno(aluno3);
		grupo.addAluno(aluno4);
		
		try{
			//Cadastrar o grupo, o resto será feito em cascata
			dao.create(grupo);
			//commit
			dao.commit();
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			//Sucesso!
			em.close();
			System.exit(0);
		}
	}
	
}
