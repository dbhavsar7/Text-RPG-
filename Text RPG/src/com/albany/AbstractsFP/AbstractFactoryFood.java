package com.albany.AbstractsFP;
//this follows the abstract factory design
public abstract class AbstractFactoryFood {

	public abstract Fruit getApple();
	public abstract Vegetable getPotato();
	public Fruit getFruit() {
		return null;
	}
}
