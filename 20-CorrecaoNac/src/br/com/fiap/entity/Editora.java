package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_NAC_EDITORA")
@SequenceGenerator(name="seqEditora",sequenceName="SQ_T_NAC_EDITORA",allocationSize=1)
public class Editora {

	@Id
	@Column(name="CD_EDITORA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqEditora")
	private int codigo;
	
	@Column(name="NM_EDITORA",nullable=false,length=60)
	private String nome;
	
	@OneToMany(mappedBy="editora")
	private List<Livro> livros;
	
	public Editora(String nome, List<Livro> livros) {
		super();
		this.nome = nome;
		this.livros = livros;
	}

	public Editora() {
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

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
}
