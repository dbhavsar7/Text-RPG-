package com.albany.finalproject;

public class ghoul implements monster {
	
	int num = 0;
	int lifepoints = 2;
	int attackpoints = 1;
	String itemdrop = "ghoul's pendant";
	
	public ghoul(){
		
	}
	//this will set the lifepoints
	public void setLifePoints() {
		this.lifepoints = lifepoints;
	}
	//this will return the attack
	public int getAtt() {
		return attackpoints;
	}
	//this method will decrease the life points of the ghoul and will return if the ghoul is killed, if the lifepoints is 0 or under
	public void decLifePoints(int n) {
		num = n;
		lifepoints -= n;
		if(n <= 0) {
			System.out.println("You have killed the ghoul");
		}
		
}
	public int getLifePoints() {
		return lifepoints;
	}
//this is the overriding the generic method
	@Override
	public Object getDrop() {
		
		return "you picked up a " + itemdrop;
	}
}