package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class Exercicio07 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		List<String> estados = new ArrayList<>();
		estados.add("SP");
		estados.add("PR");
		
		List<Cliente> lista = dao.buscarPorEstado(estados);
		
		for (Cliente cliente : lista) {
			System.out.println(cliente.getNome() + " " +
						cliente.getEndereco().getCidade().getUf());
		}
		
		em.close();
		System.exit(0);
	}
	
}
