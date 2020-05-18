package com.albany.weapons;

//it is-a weapon
public class staff extends weapon {
	String name = "Staff of wind";
	
	public void description() {
		System.out.println("2)" + name + ": the staff that moved chickens out");
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}

}
