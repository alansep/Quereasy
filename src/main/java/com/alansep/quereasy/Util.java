package com.alansep.quereasy;

import java.lang.reflect.Field;

public class Util {

	public static boolean isNumber(Object object) {
		Number valor = null;
		try {
			valor = (Number) object;
		} catch (ClassCastException ex) {
			return false;
		}
		return valor instanceof Number;
	}
	
	public static Class<?> pegarClasse(Object object){
		return object.getClass();
	}
	
	public static Field[] pegarCampos(Class<?> klass) {
		return klass.getDeclaredFields();
	}
	
}
