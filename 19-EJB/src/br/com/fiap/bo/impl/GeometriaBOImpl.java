package br.com.fiap.bo.impl;

import javax.ejb.Stateless;
import br.com.fiap.bo.GeometriaBO;

@Stateless
public class GeometriaBOImpl implements GeometriaBO {

	@Override
	public double calcularAreaTriangulo(double base, double altura) {
		return (base*altura)/2;
	}

}
