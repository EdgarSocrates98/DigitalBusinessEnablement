package br.com.fiap.teste;

import java.lang.reflect.Field;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.bean.Pessoa;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		//Recuperar as anotações da classe Pessoa:
		
		//Recupera os atributos da classe
		Field[] atributos = pessoa.getClass().getDeclaredFields();
		for (Field field : atributos) {
			//Recuperar a anotação do atributo
			Coluna anotacao = field.getAnnotation(Coluna.class);
			//Exibir o nome do atributo
			System.out.println(field.getName() + " -> " + anotacao.nome());
		}
	}
}
