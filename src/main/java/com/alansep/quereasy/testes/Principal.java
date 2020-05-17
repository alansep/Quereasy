package com.alansep.quereasy.testes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.alansep.quereasy.model.Carro;

public class Principal {

	public static void main(String[] args) {

		// System.out.println(new Quereasy().isNumber(null));

		Carro carro = new Carro();

		// System.out.println(numero);

		Class<?> klass = carro.getClass();

		Method[] metodos = klass.getMethods();
		
		Field[] atributos = klass.getDeclaredFields();
		
		for (int i = 0; i < metodos.length; i++) {
		//	System.out.println(metodos[i].getName() + " - " + metodos[i].getReturnType());
		}
		
		for (int i = 0; i < atributos.length; i++) {
			System.out.println(atributos[i].getType().getSimpleName() + " - " + atributos[i].getName());
		}
		
	
	
	}
}
