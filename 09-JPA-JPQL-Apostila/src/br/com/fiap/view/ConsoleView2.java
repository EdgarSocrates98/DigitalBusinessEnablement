package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class ConsoleView2 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		try{
			Cliente cliente = dao.buscarPorCPF("50293494030");
			System.out.println(cliente.getNome());
			System.out.println(cliente.getCpf());
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Erro");
		}
		
		em.close();
		System.exit(0);
	}
	
}
