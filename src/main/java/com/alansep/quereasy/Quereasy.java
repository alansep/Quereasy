package com.alansep.quereasy;

import com.alansep.quereasy.anotations.Tabela;
import com.alansep.quereasy.generators.GeradorCreateTable;

public class Quereasy implements GeradorCreateTable {

	@Override
	public String gerarQuery(Object object) {
		String query = "CREATE TABLE " + gerarNomeTabela(object) + " ( ";

		/*
		 * CREATE TABLE nome_tabela ( modelo varchar(20), ano integer );
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		// TODO Auto-generated method stub
		return query;
	}

	private String gerarNomeTabela(Object object) {
		Class<?> classe = Util.pegarClasse(object);
		if (classe.isAnnotationPresent(Tabela.class)) {
			Tabela annotation = classe.getAnnotation(Tabela.class);
			return annotation.nome();
		} else {
			return classe.getSimpleName();
		}
	}

}
