package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	List<Cliente> buscarPorEstado(String estado);
	
	List<Cliente> buscarPorDiaReserva(int dias);
	
	List<Cliente> buscar(String nome, String cidade);
	
	List<Cliente> buscarPorEstado(List<String> estados);
	
	Cliente buscarPorCPF(String cpf);
	
	List<Cliente> buscarPorAnivesario(int mes);
	
	Long buscarQuantidade();
	
}
