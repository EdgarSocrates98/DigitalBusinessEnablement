package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="T_CLIENTE",schema="PF0392")
@SequenceGenerator(name="seqCliente",
sequenceName="SQ_T_CLIENTE",allocationSize=1)
public class Cliente {

	@Id
	@Column(name="CD_CLIENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqCliente")
	private int codigo;
	
	@Column(name="NM_CLIENTE",nullable=false,length=50)
	private String nome;
	
	@Transient //Não será uma coluna no BD
	private String chaveAcesso;
	
	public Cliente() {
		super();
	}

	public Cliente(int codigo, String nome, String chaveAcesso) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.chaveAcesso = chaveAcesso;
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

	public String getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(String chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}
	
}





