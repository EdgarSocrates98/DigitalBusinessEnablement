package br.com.fiap.dao;

import java.util.List;
import br.com.fiap.bean.Paciente;

public interface PacienteDao {

	//Definir as assinaturas dos métodos
	void insert(Paciente paciente);
	void update(Paciente paciente);
	void delete(int codigo);
	List<Paciente> list();
	
}
