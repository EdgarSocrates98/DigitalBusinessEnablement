package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_LOJA")
@SequenceGenerator(name="seqLoja",sequenceName="SQ_TB_LOJA",allocationSize=1)
public class Loja {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqLoja")
	private int codigo;
	
	private String nome;

	public Loja() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loja(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
