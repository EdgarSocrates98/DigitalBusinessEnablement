package br.com.fiap.socket;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.bean.Pessoa;

public class Client {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("127.0.0.1",123);
		
		ObjectOutputStream outputStream = 
				new ObjectOutputStream(socket.getOutputStream());
		
		Pessoa pessoa = new Pessoa("Romero",25);
		
		outputStream.writeObject(pessoa);
		
		System.out.println("Pessoa serializada!");
		
		socket.close();
		
	}
	
}
