package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_AGENCIA")
@SequenceGenerator(name="seqAgencia",sequenceName="SQ_T_AGENCIA",allocationSize=1)
public class Agencia {

	@Id
	@Column(name="NR_AGENCIA")
	@GeneratedValue(generator="seqAgencia",strategy=GenerationType.SEQUENCE)
	private int numero;
	
	@Column(name="DS_ENDERECO")
	private String endereco;

	public Agencia() {
		super();
	}

	public Agencia(String endereco) {
		super();
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
