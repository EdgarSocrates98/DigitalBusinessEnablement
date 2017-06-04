package br.com.fiap.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CotacaoService extends Remote {

	double converterRealDolar(double real) throws RemoteException ;
	
}
