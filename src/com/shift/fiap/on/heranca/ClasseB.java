package com.shift.fiap.on.heranca;

public class ClasseB extends ClasseA {
	public void testeSuper() {
		super.atributo3 = 33;
		System.out.println("super.atributo3 = " + this.atributo3);
	}
}
