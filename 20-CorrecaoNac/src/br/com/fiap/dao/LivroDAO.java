package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Livro;

public interface LivroDAO extends GenericDAO<Livro, String>{

	List<Livro> buscarPorTitulo(String titulo);
	
	long contarLivros(Editora editora);
	
	List<Livro> buscarPorEditora(String editora);
	
}