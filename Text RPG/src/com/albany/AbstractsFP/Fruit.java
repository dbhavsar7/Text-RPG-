package com.albany.AbstractsFP;

public class Fruit extends Food {
	//this is the super class, fruit
	
	public Fruit(String n, int hp) {
		super(n, hp);
		
	}
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return name;
	}
	public void setHP(int hp) {
		this.healpoints = hp;
	}
	public int gethp() {
		return healpoints;
	}
}
