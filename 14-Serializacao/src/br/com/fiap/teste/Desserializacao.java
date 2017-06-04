package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Pessoa;

public class Desserializacao {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("saida");
		
		ObjectInputStream inputStream = new ObjectInputStream(fis);
		
		Pessoa pessoa =  (Pessoa) inputStream.readObject();
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		
		inputStream.close();
		fis.close();
	}
	
}
