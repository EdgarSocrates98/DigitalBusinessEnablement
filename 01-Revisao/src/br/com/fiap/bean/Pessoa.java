package br.com.fiap.bean;

import java.util.Calendar;

//não pode ser instanciada
public abstract class Pessoa {

	private String nome; 
	
	private Calendar dataNascimento;	
	
	private float peso;
	
	private Sexo sexo;
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, Calendar dataNascimento, float peso, Sexo sexo){		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	//pode conter métodos abstratos
	public abstract void registrar();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
}
