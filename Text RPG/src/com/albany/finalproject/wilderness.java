package com.albany.finalproject;
import java.util.Scanner;
import com.albany.AbstractsFP.*;
import com.albany.characters.player;
import com.albany.weapons.weapon;

//this is the wilderness class and will simulate the players adventure in the area
public class wilderness {
	
	Scanner swild = new Scanner(System.in);
	
	
	player p = new player();
	
	
	public void wildernessScene(int x)
	{
		 
		System.out.println(" You are now at the wilderness, what do you want to do?"
				+ "\n 1) Fight ghouls"
				+ "\n 2) Pick food from wild garden");
		int x5 = swild.nextInt();
		
		
		if(x5 == 1);
		{
		ghoul g  = new ghoul();
		weapon w = new weapon();
		p.decreaseLifePoints(g.getAtt());
		g.decLifePoints(w.attack);
	
		System.out.println("You have " + p.getLifePoints() + " lifepoints");
		}
		if (x5 == 2) {
			this.seth();
		}
		
		 }
		
		
		
		
	
	public void seth() {
		//this method will be the food selection for the player and will restore life to the player
		while(true) {
			
				System.out.println(" What type of food do you want?"
						+ "\n 1) apple"
						+ "\n 2) potato");
				int x6 = swild.nextInt();
				
				if(x6 == 1)
				{
				Apple a = new Apple();
				p.healLifePoints(a.gethp());
				System.out.println("You have " + p.getLifePoints() + " lifepoints");
				}
				if(x6 == 2)
				{
				Potato potato = new Potato();
				p.healLifePoints(potato.getHP());
				System.out.println("You have " + p.getLifePoints() + " lifepoints");
				}
				else {
					System.out.println("pick a valid option!");
				}
				}
	}
	}
