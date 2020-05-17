package com.alansep.quereasy;

import com.alansep.quereasy.definitions.QuereasyInterface;

public class Quereasy implements QuereasyInterface {

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isNumber(Object object) {
		Number valor = null;
		try {
			valor = (Number) object;
		} catch (ClassCastException ex) {
			return false;
		}
		return valor instanceof Number;
	}

}
