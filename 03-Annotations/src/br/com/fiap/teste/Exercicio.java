package br.com.fiap.teste;

import br.com.fiap.annotation.Tabela;
import br.com.fiap.bean.Aluno;

public class Exercicio {

	public static void main(String[] args) {
		//Recuperar a anotação @Tabela da classe Aluno
		
		Aluno aluno = new Aluno();
		
		Tabela anotacao = aluno
				.getClass().getAnnotation(Tabela.class);
		
		System.out.println("SELECT * FROM " + anotacao.nome());
	}
	
}
