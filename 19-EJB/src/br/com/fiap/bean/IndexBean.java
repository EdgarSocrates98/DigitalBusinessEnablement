package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.CarrinhoBO;
import br.com.fiap.bo.EnqueteBO;
import br.com.fiap.bo.GeometriaBO;

@ManagedBean
@SessionScoped
public class IndexBean {

	private double altura, base, area, total, valor;
	private int bolsonaro, doria;
	
	@EJB
	private GeometriaBO bo;
	
	@EJB
	private CarrinhoBO carrinhoBo;
	
	@EJB
	private EnqueteBO enqueteBo;
	
	public void votarDoria(){
		doria = enqueteBo.votarDoria();
	}
	
	public void votarBolsonaro(){
		bolsonaro = enqueteBo.votarBolsonaro();
	}
	
	public void adicionar(){
		total = carrinhoBo.adicionar(valor); 
	}
	
	//método para clique do botão
	public void calcular(){
		area = bo.calcularAreaTriangulo(base, altura);
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDoria() {
		return doria;
	}

	public void setDoria(int doria) {
		this.doria = doria;
	}

	public int getBolsonaro() {
		return bolsonaro;
	}

	public void setBolsonaro(int bolsonaro) {
		this.bolsonaro = bolsonaro;
	}
	
}
