package br.com.fiap.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import br.com.fiap.bean.Pessoa;

public interface PessoaService extends Remote {

	void cadastrar(Pessoa pessoa) throws RemoteException;
	
}