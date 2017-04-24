package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_GRUPO_AM")
@SequenceGenerator(name="seqGrupo",sequenceName="SQ_TB_GRUPO_AM",allocationSize=1)
public class GrupoAm {

	@Id
	@Column(name="CD_GRUPO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqGrupo")
	private int codigo;
	
	@Column(name="NM_GRUPO",length=100,nullable=false)
	private String nome;
	
	@OneToOne(cascade={CascadeType.MERGE,CascadeType.REMOVE})
	@JoinColumn(name="CD_PROJETO",nullable=false)
	private ProjetoAm projeto;
	
	@OneToMany(cascade=CascadeType.PERSIST,mappedBy="grupo")
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	//Método somente para o relacionamento OneToMany
	public void addAluno(Aluno aluno){
		alunos.add(aluno);
		aluno.setGrupo(this);
	}
	
	public GrupoAm() {
		super();
	}

	public GrupoAm(int codigo, String nome, ProjetoAm projeto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.projeto = projeto;
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

	public ProjetoAm getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoAm projeto) {
		this.projeto = projeto;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
