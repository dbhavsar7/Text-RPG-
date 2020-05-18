package com.albany.weapons;

//it is-a weapon
public class sword extends weapon {
	 String name = "The Silverlight";
	
	public void description() {
		System.out.println("1)" + name + ": The legendary sword that helped defeat Gannon in the last tri-force war");
	}
	//sets the name
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}

}
