package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TimeDAO;
import br.com.fiap.dao.impl.TimeDAOImpl;
import br.com.fiap.entity.Campeonato;
import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Tecnico;
import br.com.fiap.entity.Time;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		//Cadastrar todas as entidades
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		Time time = new Time("2TDSJ", new GregorianCalendar(2017, Calendar.JANUARY, 2), 1);
		
		Campeonato campeonato1 = new Campeonato("Intersalas");
		Campeonato campeonato2 = new Campeonato("Next");
		
		Jogador jogador1 = new Jogador("Italo");
		Jogador jogador2 = new Jogador("Guilhemer ubá");
		Jogador jogador3 = new Jogador("Matheus");
		
		Tecnico tecnico = new Tecnico("Gustavo");
		
		time.setTecnico(tecnico);
		time.addJogador(jogador1);
		time.addJogador(jogador2);
		time.addJogador(jogador3);
		
		List<Campeonato> lista = new ArrayList<Campeonato>();
		lista.add(campeonato1);
		lista.add(campeonato2);
		
		time.setCampeonatos(lista);
		
		//Cadastrar
		TimeDAO dao = new TimeDAOImpl(em);
		
		try {
			dao.create(time);
			dao.save();
		} catch (CommitException e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}
		
	}
	
}