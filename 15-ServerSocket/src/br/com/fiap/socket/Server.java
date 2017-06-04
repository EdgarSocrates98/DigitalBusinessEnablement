package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Pessoa;

public class Server {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(123);
		
		while(true){
			System.out.println("Aguardando conexão...");
			Socket socket = server.accept();
			
			ObjectInputStream inputStream = 
						new ObjectInputStream(socket.getInputStream());
		
			try{
				Pessoa pessoa = (Pessoa) inputStream.readObject();
				System.out.println(pessoa.getNome());
				System.out.println(pessoa.getIdade());
				System.out.println(socket.getInetAddress().getHostAddress());
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//server.close();
		
	}
	
}



