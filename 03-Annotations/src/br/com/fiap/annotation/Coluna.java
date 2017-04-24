package br.com.fiap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//� poss�vel recuperar a anota��o at� a execu��o na JVM 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //anota��o somente para atributos
public @interface Coluna {

	String nome();
	
}