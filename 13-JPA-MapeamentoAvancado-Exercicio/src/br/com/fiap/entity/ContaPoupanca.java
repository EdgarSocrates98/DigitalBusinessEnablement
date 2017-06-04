package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_POUPANCA")
public class ContaPoupanca extends Conta {

	@Column(name="VL_RENDIMENTO")
	private double rendimento;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Agencia agencia, double saldo, double rendimento) {
		super(agencia, saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
}
