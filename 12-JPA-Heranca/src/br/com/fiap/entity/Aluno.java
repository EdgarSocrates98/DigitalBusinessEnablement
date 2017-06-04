package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa {

	@Column(name="NR_RM")
	private int rm;
	
	@Column(name="NM_CURSO")
	private String curso;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String cpf, Calendar dataNascimento, int rm, String curso) {
		super(nome, cpf, dataNascimento);
		this.rm = rm;
		this.curso = curso;
	}



	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
