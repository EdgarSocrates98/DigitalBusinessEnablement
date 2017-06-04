package br.com.fiap.bean;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 4764328872224708700L;

	private String nome;
	
	private int idade;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
