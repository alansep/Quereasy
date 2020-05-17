package com.alansep.quereasy.model;

import com.alansep.quereasy.anotations.Campo;
import com.alansep.quereasy.anotations.Id;
import com.alansep.quereasy.anotations.Tabela;

@Tabela(nome = "automoveis")
public class Carro {

	@Id
	@Campo(primaryKey = true)
	private Integer codigo;

	private String modelo;

	private String fabricante;

	private Integer ano;

	private boolean quebrado;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public boolean isQuebrado() {
		return quebrado;
	}

	public void setQuebrado(boolean quebrado) {
		this.quebrado = quebrado;
	}

}
