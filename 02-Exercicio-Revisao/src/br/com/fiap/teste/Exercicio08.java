package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import br.com.fiap.bean.Livro;
import br.com.fiap.bean.Tablet;

public class Exercicio08 {

	public static void main(String[] args) {
		//Instanciar as classes:
		Livro livro = new Livro(1, "Código Limpo", 150, "João", "Novatec",
				new GregorianCalendar(2015, Calendar.DECEMBER, 10));

		Tablet tablet = new Tablet(2, "Lenovo XPTO", 1500, 
				"L5", "Lenovo", "Android", true);
		
		//Exibir as informações
		System.out.println(livro);
		System.out.println(tablet);
		System.out.println(tablet.calcularGarantiaEstendida());
		
	}

}


