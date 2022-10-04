package com.shif.fiap.on.heranca.beans;

public class Livro extends Produto {
	private String isbn;
	private String autor;

	public String getIsbn() {
		return isbn;
	}

	public String getAutor() {
		return autor;
	}

	public Livro() {
		super();
	}

	public Livro(int codigo, double preco, String descricao, String isbn, String autor) {
		super(codigo, preco, descricao);
		this.isbn = isbn;
		this.autor = autor;
	}

}
