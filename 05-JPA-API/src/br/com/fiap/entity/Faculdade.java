package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="seqFacu",sequenceName="SQ_TB_FACULDADE",allocationSize=1)
public class Faculdade {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqFacu")
	@Column(name="CD_FACULDADE")
	private int codigo;
	
	@Column(length=100,nullable=false,name="NM_FACULDADE")
	private String nome;
	
	@Column(name="DS_ENDERECO")
	private String endereco;
	
	@Column(name="NR_TELEFONE",length=20)
	private String telefone;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_FUNDACAO")
	private Calendar dataFundacao;
	
	@PrePersist	
	public void log(){
		System.out.println("Cadastrando uma faculdade");
	}
	
	public Faculdade() {
		super();
	}

	public Faculdade(int codigo, String nome, String endereco, String telefone, Calendar dataFundacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataFundacao = dataFundacao;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Calendar getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
}
