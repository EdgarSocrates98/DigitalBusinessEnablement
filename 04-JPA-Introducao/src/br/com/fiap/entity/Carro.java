package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_CARRO", schema="PF0392")
public class Carro {

	@Id
	@Column(length=7,name="DS_PLACA")
	private String placa;

	@Column(nullable=false)
	private String modelo;
	
	private String marca;
	
	private String cor;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_CADASTRO",updatable=false)
	private Calendar dataCadastro;
	
	@Column(name="NR_ANO")
	private int ano;
	
	@Lob
	private byte[] foto;
	
	private Combustivel combustivel;

	public Carro(String placa, String modelo, String marca, String cor, Calendar dataCadastro, int ano, byte[] foto,
			Combustivel combustivel) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.dataCadastro = dataCadastro;
		this.ano = ano;
		this.foto = foto;
		this.combustivel = combustivel;
	}

	public Carro() {
		super();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	
}



