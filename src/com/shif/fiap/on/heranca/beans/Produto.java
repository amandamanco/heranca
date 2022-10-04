package com.shif.fiap.on.heranca.beans;

public class Produto {
	private int codigo;
	private double preco;
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public Produto() {
		super();
	}

	public Produto(int codigo, double preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

}
