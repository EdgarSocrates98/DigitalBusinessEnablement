package br.com.fiap.bean;

import br.com.fiap.annotation.Coluna;


public class Pessoa {

	@Coluna(nome="NM_PESSOA")
	private String nome;
	
	@Coluna(nome="NR_IDADE")
	private int idade;
	
	
	
}
