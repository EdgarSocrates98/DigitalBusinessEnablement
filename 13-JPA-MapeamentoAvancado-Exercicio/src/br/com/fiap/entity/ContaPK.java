package br.com.fiap.entity;

import java.io.Serializable;

public class ContaPK implements Serializable {

	private int numero;
	
	private int agencia;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
}
