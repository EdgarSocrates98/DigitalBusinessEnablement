package br.com.fiap.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.fiap.service.impl.CotacaoServiceImpl;
import br.com.fiap.service.impl.PessoaServiceImpl;

public class Server {

	public static void main(String[] args) throws Exception {
		
		 Registry registry = LocateRegistry.createRegistry(123);
		 
		 //Publicar o objeto
		 registry.bind("objeto", new CotacaoServiceImpl());
		 registry.bind("pessoa", new PessoaServiceImpl());
		 
		 System.out.println("Objeto registrado!");
		
	}
	
}
