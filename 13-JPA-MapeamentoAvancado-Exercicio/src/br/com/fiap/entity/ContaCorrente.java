package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_CORRENTE")
public class ContaCorrente extends Conta {

	@Column(name="VL_TARIFA",nullable=false)
	private double tarifa;
	
	@Column(name="VL_CHEQUE_ESPECIAL")
	private double chequeEspecial;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Agencia agencia, double saldo, double tarifa, double chequeEspecial) {
		super(agencia, saldo);
		this.tarifa = tarifa;
		this.chequeEspecial = chequeEspecial;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
}
