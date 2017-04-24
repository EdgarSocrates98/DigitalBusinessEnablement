package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PROJETO_AM")
@SequenceGenerator(name="seqProjeto",sequenceName="SQ_TB_PROJETO_AM",allocationSize=1)
public class ProjetoAm {

	@Id
	@Column(name="CD_PROJETO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqProjeto")
	private int codigo;
	
	@Column(name="NM_PROJETO",nullable=false,length=100)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_INICIO",nullable=false)
	private Calendar dataInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_FIM",nullable=false)
	private Calendar dataFim;
	
	@OneToOne(mappedBy="projeto",cascade={CascadeType.PERSIST,CascadeType.MERGE}, fetch=FetchType.LAZY) //Nome do atributo que mapeia o relacionamento (Na classe GrupoAm)	
	private GrupoAm grupo;

	public ProjetoAm(int codigo, String nome, Calendar dataInicio, Calendar dataFim) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public ProjetoAm() {
		super();
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

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public GrupoAm getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAm grupo) {
		this.grupo = grupo;
	}
	
}
