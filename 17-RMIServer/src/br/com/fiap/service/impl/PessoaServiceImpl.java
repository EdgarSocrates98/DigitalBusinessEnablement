package br.com.fiap.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.fiap.bean.Pessoa;
import br.com.fiap.service.PessoaService;

public class PessoaServiceImpl extends UnicastRemoteObject 
												implements PessoaService {

	public PessoaServiceImpl() throws RemoteException {
		super();		
	}

	@Override
	public void cadastrar(Pessoa pessoa) throws RemoteException {
		//chamar o DAO
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
	}

}
