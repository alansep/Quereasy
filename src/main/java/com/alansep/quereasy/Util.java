package com.alansep.quereasy;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Util {

	public static Map<Class<?>, String> getTipos() {
		Map<Class<?>, String> dados = new HashMap<>();
		dados.put(Boolean.class, "BIT");
		dados.put(Byte.class, "INTEGER");
		dados.put(Short.class, "INTEGER");
		dados.put(Integer.class, "INTEGER");
		dados.put(Float.class, "FLOAT");
		dados.put(Double.class, "DOUBLE");
		dados.put(Character.class, "VARCHAR(1)");
		dados.put(boolean.class, "BIT");
		dados.put(byte.class, "INTEGER");
		dados.put(short.class, "INTEGER");
		dados.put(int.class, "INTEGER");
		dados.put(float.class, "FLOAT");
		dados.put(double.class, "DOUBLE");
		dados.put(char.class, "VARCHAR(1)");
		dados.put(String.class, "VARCHAR(100)");
		return dados;
	}

	public static String pegarTipo(Class<?> classe) {
		String retorno = null;
		Map<Class<?>, String> tipos = getTipos();
		for (Class<?> classeIterada : tipos.keySet()) {

			if (classeIterada.getSimpleName().toUpperCase().equals(classe.getSimpleName().toUpperCase())) {
				retorno = tipos.get(classeIterada);
			}
		}
		return retorno;
	}

	public static Class<?> pegarClasse(Object object) {
		return object.getClass();
	}

	public static Field[] pegarCampos(Class<?> klass) {
		return klass.getDeclaredFields();
	}

}
