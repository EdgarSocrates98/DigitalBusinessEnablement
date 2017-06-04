package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_PEDIDO")
@SequenceGenerator(name="seqPedido",sequenceName="SQ_T_PEDIDO",allocationSize=1)
public class Pedido {

	@Id
	@Column(name="CD_PEDIDO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqPedido")
	private int codigo;
	
	@Column(name="DT_PEDIDO",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
	
}
