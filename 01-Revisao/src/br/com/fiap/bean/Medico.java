package br.com.fiap.bean;

import java.util.Calendar;

public class Medico extends Pessoa{

	private int crm;
	
	private String especialidade;
	
	public Medico(){
		
	}
	
	public Medico(String nome, Calendar dataNascimento, float peso, Sexo sexo){
		super(nome, dataNascimento, peso, sexo);
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;	
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public void registrar() {
		System.out.println("Registro de ponto");
	}
	
}
