package com.albany.weapons;

//the player has-a weapon
public class weapon{
	String name = "";
	public int attack = 0;
	public weapon(){
		
	}
	
	public void description() {
		
	}
	
	public void setWeapon(String n) {
		this.name = n;
	}
	public String getWeapon() {
		return name;
	}
	public void setAttack(int a) {
		this.attack = a;
	}
	public int getAttack() {
		return attack;
	}
	
	public String toString() {
		return name + " attack: " + attack;
	}
}
