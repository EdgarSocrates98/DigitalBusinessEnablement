package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface GeometriaBO {

	double calcularAreaTriangulo(double base, double altura);
	
}
