package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="TB_DISCIPLINA")
@SequenceGenerator(name="seqDisciplina",
sequenceName="SQ_TB_DISCIPLINA",allocationSize=1)
public class Disciplina {

	@Id
	@Column(name="CD_DISCIPLINA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqDisciplina")
	private int codigo;

	@Column(name="NM_DISCIPLINA",nullable=false)
	private String nome;
	
	@Column(name="DS_DISCIPLINA")
	private String descricao;
	
	@ManyToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
	@JoinTable(name="TB_DISCIPLINA_ALUNO", 
			joinColumns= @JoinColumn(name="CD_DISCIPLINA"),
			inverseJoinColumns=@JoinColumn(name="RM"))
	private List<Aluno> alunos;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}
