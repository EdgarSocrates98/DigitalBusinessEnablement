package br.com.fiap.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Medico extends Pessoa {
	
	@Column(name="NR_CRM")
	private String crm;

	@Column(name="DS_ESPECIALIDADE")
	private String especialidade;

	public Medico() {
		super();
	}

	public Medico(String nome, String cpf, Calendar dataNascimento, String crm, String especialidade) {
		super(nome, cpf, dataNascimento);
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}
