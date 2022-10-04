package com.shif.fiap.on.heranca.beans;

public class CompactDisc extends Produto {
	private String gravadora;
	private String artista;

	public String getGravadora() {
		return gravadora;
	}

	public String getArtista() {
		return artista;
	}

	public CompactDisc() {
		super();
	}

	public CompactDisc(int codigo, double preco, String descricao, String gravadora, String artista) {
		super(codigo, preco, descricao);
		this.gravadora = gravadora;
		this.artista = artista;
	}

}
