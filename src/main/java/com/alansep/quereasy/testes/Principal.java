package com.alansep.quereasy.testes;

import com.alansep.quereasy.Quereasy;
import com.alansep.quereasy.model.Carro;

public class Principal {

	public static void main(String[] args) {

		Quereasy quereasy = new Quereasy();
		System.out.println(quereasy.gerarQuery(new Carro()));
		
	}
}
