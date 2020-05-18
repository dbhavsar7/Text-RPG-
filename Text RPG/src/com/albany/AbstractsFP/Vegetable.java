package com.albany.AbstractsFP;
//this is the super class of vegetable
public class Vegetable extends Food{
	
	public Vegetable(String name, int hp) {
		super(name, hp);
	}
//this nethod sets name
	public void setName(String n) {
		this.name = n;
	}
	//returns the name
	public String getName() {
		return name;
	}
	//sets hp from concrete class
	public void setHP(int hp) {
		this.healpoints = hp;
	}
	//gets the hp
	public int getHP() {
		return healpoints;
	}
}
