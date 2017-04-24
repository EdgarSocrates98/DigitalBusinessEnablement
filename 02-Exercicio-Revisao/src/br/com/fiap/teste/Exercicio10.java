package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.Livro;

public class Exercicio10 {

	public static void main(String[] args) {
		
		List<Livro> livros = new ArrayList<Livro>();
		
		//Adicionar 3 livros na lista
		
		livros.add(new Livro(1, "Senhor dos anéis - A sociedade do anel", 100, "Token",
			"Elfo", new GregorianCalendar(2000, Calendar.JANUARY,2)));
		
		livros.add(new Livro(2, "Senhor dos anéis - As duas torres", 100, "Token",
			"Elfo", new GregorianCalendar(2000, Calendar.JUNE,20)));
		
		livros.add(new Livro(3, "Senhor dos anéis - Retorno do rei", 100, "Token",
			"Elfo", new GregorianCalendar(2000, Calendar.AUGUST,5)));
		
		//Exibir os elementos da lista de livros
		for (Livro livro : livros){
			System.out.println(livro);
			System.out.println("*******");
		}
		
	}
	
}
