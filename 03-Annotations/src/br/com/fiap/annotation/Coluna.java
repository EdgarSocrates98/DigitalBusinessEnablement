package br.com.fiap.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//É possível recuperar a anotação até a execução na JVM 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //anotação somente para atributos
public @interface Coluna {

	String nome();
	
}