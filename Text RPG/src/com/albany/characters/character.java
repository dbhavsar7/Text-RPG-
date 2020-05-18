package com.albany.characters;

import com.albany.weapons.weapon;

//this is the character class
public class character {
	int lifepoints = 6;
	String name;
	int level;
	int num = 0;
	String weaponname = "";
	weapon wp = new weapon();
	//this is the constructor
	public character() {
		
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setWeaponName(String n) {
		weaponname = n;
	}	
	public String getWeaponName() {
		return weaponname;
	}
	public void increaseLevel() {
		level++;
	}
	public void decreaseLifePoints(int n) {
		num = n;
		lifepoints -= n;
	}
	public int getLevel() {
		return level;
	}
	public int getLifePoints() {
		return lifepoints;
	}
}
