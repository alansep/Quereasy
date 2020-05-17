package com.alansep.quereasy;

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
	
}
