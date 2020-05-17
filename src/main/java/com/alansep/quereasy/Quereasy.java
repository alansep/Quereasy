package com.alansep.quereasy;

import java.lang.reflect.Field;

import com.alansep.quereasy.anotations.Campo;
import com.alansep.quereasy.anotations.Id;
import com.alansep.quereasy.anotations.Tabela;
import com.alansep.quereasy.generators.GeradorCreateTable;

public class Quereasy implements GeradorCreateTable {

	@Override
	public String gerarQuery(Object object) {
		String query = "CREATE TABLE " + gerarNomeTabela(object) + " ( ";
		query = query + gerarCampos(object);
		return query + " );";
	}

	private String gerarCampos(Object object) {
		String queryCampos = "";
		Field[] campos = Util.pegarCampos(Util.pegarClasse(object));

		for (int i = 0; i < campos.length; i++) {
			queryCampos = queryCampos + campos[i].getName() + " " + gerarTipoColuna(campos[i]) + ", ";
		}

		return queryCampos.substring(0, queryCampos.length() - 2);
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

	private String gerarTipoColuna(Field campo) {
		String tipo = null;
		if (campo.isAnnotationPresent(Campo.class)) {
			Campo coluna = campo.getAnnotation(Campo.class);
			if (coluna.definicao().isEmpty()) {
				tipo = Util.pegarTipo(campo.getType());
			} else {
				tipo = coluna.definicao();
			}
			if (coluna.primaryKey() && campo.isAnnotationPresent(Id.class)) {
				tipo = tipo + " primary key";
			}
		} else {
			tipo = Util.pegarTipo(campo.getType());
		}
		return tipo;
	}

}
