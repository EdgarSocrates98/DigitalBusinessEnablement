package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_TECNICO")
@SequenceGenerator(name="seqTecnico",sequenceName="SQ_TB_TECNICO",allocationSize=1)
public class Tecnico {

	@Id
	@Column(name="CD_TECNICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTecnico")
	private int codigo;
	
	@Column(name="NM_TECNICO")
	private String nome;
	
	@OneToOne(mappedBy="tecnico")
	private Time time;

	public Tecnico(String nome) {
		super();
		this.nome = nome;
	}

	public Tecnico() {
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

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}
