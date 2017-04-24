package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.Medico;
import br.com.fiap.bean.Paciente;
import br.com.fiap.bean.Pessoa;
import br.com.fiap.bean.Sexo;
import br.com.fiap.dao.PacienteDao;

public class TesteData {

	public static void main(String[] args) {
		//Criar uma vari�vel para armazenar data
		Calendar dataHoje;
		//Criar uma data para armazenar na vari�vel
		dataHoje = Calendar.getInstance(); //Data e hora atual
		//Criar uma vari�vel de data
		Calendar dataNascimento = 
						 //Ano, M�s (come�a no 0), Dia
			new GregorianCalendar(1998, Calendar.JANUARY, 30);
		
		//Exibir as datas
		//Formatador de datas
		SimpleDateFormat format = 
				new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
		
		System.out.println(format.format(dataHoje.getTime()));
		System.out.println(format.format(dataNascimento.getTime()));
		
		//Instanciar um Medico
		Medico medico = new Medico("Maria", 
				new GregorianCalendar(1980,Calendar.MARCH, 25),
				60, Sexo.FEMININO);
		//medico.setSexo(Sexo.FEMININO);
		medico.setDataNascimento(
				new GregorianCalendar(1999,Calendar.APRIL,1));
		
		//Comparar um enum 
		if (medico.getSexo() == Sexo.FEMININO){
			System.out.println("� uma m�dica");
		}else if (medico.getSexo() == Sexo.MASCULINO){
			System.out.println("� um m�dico");
		}else{
			System.out.println("Sem valor para o sexo");
		}
		
	}
	
}






