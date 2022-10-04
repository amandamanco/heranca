package com.shif.fiap.on.heranca.beans;

public class Teste {
	public static void main(String[] args) {
		Livro livro = new Livro(1, 55, "Aprenda Java", "010102", "Braufagélio");
		System.out.println("Livro Descrição: " + livro.getDescricao());
		System.out.println("Livro Autor: " + livro.getAutor());

		CompactDisc cd = new CompactDisc(1, 55, "Só as melhores", "GravaTudo", "DJ Java");
		System.out.println("CD Descrição: " + cd.getDescricao());
		System.out.println("CD Artista: " + cd.getArtista());
	}
}
