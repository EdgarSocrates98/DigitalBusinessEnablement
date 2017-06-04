package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PRODUTO")
@SequenceGenerator(name="seqProduto",sequenceName="SQ_T_PRODUTO",allocationSize=1)
public class Produto {

	@Id
	@Column(name="CD_PRODUTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqProduto")
	private int codigo;
	
	@Column(name="NM_PRODUTO",nullable=false)
	private String nome;

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
