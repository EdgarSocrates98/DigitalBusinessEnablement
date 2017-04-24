package br.com.fiap.entity;

import java.io.Serializable;

public class ReceitaPK implements Serializable {

	private int paciente;
	
	private int medico;

	public ReceitaPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceitaPK(int paciente, int medico) {
		super();
		this.paciente = paciente;
		this.medico = medico;
	}

	public int getPaciente() {
		return paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}

	public int getMedico() {
		return medico;
	}

	public void setMedico(int medico) {
		this.medico = medico;
	}
	
}
