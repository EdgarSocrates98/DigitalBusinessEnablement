package br.com.fiap.bo.impl;

import javax.ejb.Singleton;
import br.com.fiap.bo.EnqueteBO;

@Singleton
public class EnqueteBOImpl implements EnqueteBO {

	private int doria, bolsonaro;

	@Override
	public int votarDoria() {
		return doria += 1;
	}

	@Override
	public int votarBolsonaro() {
		return bolsonaro++;
	}
	
	
	
}
