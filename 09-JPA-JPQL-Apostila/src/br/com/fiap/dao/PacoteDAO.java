package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{

	List<Pacote> listarPacotes();
	
	List<Pacote> buscarPorDescricao(String descs);
	
	List<Pacote> buscarPorTransporte(Transporte transporte);
	
	List<Pacote> buscarPorData(Calendar inicio, Calendar fim);
	
	Double buscarMediaPreco();
	
	Long buscarQuantidade(Calendar inicio, Calendar fim);
	
	List<Pacote> buscarPorPrecoMaximo();
	
}
