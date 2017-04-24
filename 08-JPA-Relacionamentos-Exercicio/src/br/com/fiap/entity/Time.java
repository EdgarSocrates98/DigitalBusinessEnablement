package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.Calendar;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_TIME")
@SequenceGenerator(name="seqTime",sequenceName="SQ_TB_TIME",allocationSize=1)
public class Time {

	@Id
	@Column(name="CD_TIME")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqTime")
	private int codigo;
	
	@Column(name="NM_TIME")
	private String nome;
	
	@Column(name="DT_FUNDACAO")
	@Temporal(TemporalType.DATE)
	private Calendar dataFundacao;
	
	@Column(name="NR_TITULO")
	private int titulos;
	
	@OneToMany(mappedBy="time",cascade=CascadeType.PERSIST)
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	
	@OneToOne(cascade=CascadeType.PERSIST,fetch=FetchType.EAGER)
	@JoinColumn(name="CD_TECNICO")
	private Tecnico tecnico;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="TB_TIME_CAMPEONATO",
		joinColumns=@JoinColumn(name="CD_TIME"),
		inverseJoinColumns=@JoinColumn(name="CD_CAMPEONATO"))
	private List<Campeonato> campeonatos;
	
	//método somente para OneToMany
	public void addJogador(Jogador jogador){
		jogadores.add(jogador); //adiciona o jogador na lista
		jogador.setTime(this); // seta o time do jogador
	}

	public Time(String nome, Calendar dataFundacao, int titulos) {
		super();
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.titulos = titulos;
	}

	public Time() {
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

	public Calendar getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(List<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}
	
}
