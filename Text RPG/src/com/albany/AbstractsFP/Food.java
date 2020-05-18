package com.albany.AbstractsFP;

public class Food {
	protected String name;
	protected int healpoints;
	
	public Food(String n, int hp) {
		this.name = n;
		this.healpoints = hp;
	}
	
	@Override
	 public String toString() {
	  return name + healpoints;
	 }

}
