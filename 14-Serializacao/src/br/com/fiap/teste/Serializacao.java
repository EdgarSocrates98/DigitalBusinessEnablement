package br.com.fiap.teste;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Pessoa;

public class Serializacao {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("saida");
		
		ObjectOutputStream outputStream = new ObjectOutputStream(fos);
		
		Pessoa pessoa = new Pessoa("Bolsonaro", 20);
		
		outputStream.writeObject(pessoa);
		System.out.println("Objeto pessoa serializado!");
		
		outputStream.close();
		fos.close();
	}
	
}
