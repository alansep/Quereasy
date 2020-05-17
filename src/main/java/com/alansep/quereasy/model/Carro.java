package com.alansep.quereasy.model;

import com.alansep.quereasy.anotations.Tabela;

@Tabela(nome = "automoveis")
public class Carro{

	private String modelo;
	private Integer ano;

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
	
	public void buzinar() {
		System.out.println("zzzzzzzzzzzzzzz!!");
	}
	
}
