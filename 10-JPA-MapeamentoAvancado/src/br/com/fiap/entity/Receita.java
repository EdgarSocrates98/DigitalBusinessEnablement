package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_RECEITA")
@IdClass(ReceitaPK.class)
public class Receita {

	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_MEDICO")
	private Medico medico;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_PACIENTE")
	private Paciente paciente;
	
	@Column(name="DS_RECEITA",nullable=false)
	private String descricao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_RECEITA",nullable=false)
	private Calendar data;

	public Receita() {
		super();
	}

	public Receita(Medico medico, Paciente paciente, String descricao, Calendar data) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.descricao = descricao;
		this.data = data;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}	
}
