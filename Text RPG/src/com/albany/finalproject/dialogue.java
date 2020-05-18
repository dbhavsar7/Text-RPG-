package com.albany.finalproject;
import com.albany.AbstractsFP.*;
import com.albany.characters.player;
import com.albany.characters.wizard;
import com.albany.weapons.staff;
import com.albany.weapons.sword;
import com.albany.weapons.weapon;

import java.util.Scanner;


//this class will run the diologue for most of the game
public class dialogue {
	//creating objects of many classes through the project
	ghoul g = new ghoul();
	player p = new player();
	wizard wizard = new wizard();
	Scanner sw = new Scanner(System.in);
	weapon wp = new weapon();
	sword sword = new sword();
	staff staff = new staff();
	wilderness wilderness = new wilderness();
	
	public dialogue(player p){
		this.p = p;
	}
	
	//this is the diologue that starts from the wizards house
	public void diologue(int x){
		while (true)
		{
		System.out.println("You walk into " + wizard.getName() +" the wizard's house.....\n"
				+ p.getName()
				+ ", there is a great dusturbance in the force!! Gannon is spreading the darkness across Hyrule, I'm too old"
						+ " to fight him,\n you must choose your path. You are the only hope, would you please help us all?"
						+ "\n 1) Yes"
						+ "\n 2) No");
		 int x3 = sw.nextInt();
		if(x3 == 1) {
			System.out.println("Great!I knew you had potential, now you must pick your weapon:");
				//this is the polymorphic array
				weapon w[] = new weapon[2];
				w[0] = new sword();
				w[1] = new staff();
				
				for(int i = 0; i < 2;++i) {
					w[i].description();
				}
			//put the polymorphic array before the weapon choices
			int s1 = sw.nextInt();
			
			
			if(s1 == 1) {
				//the player will be passed the sword he now has
				p.setWeaponName(sword.getName());
				System.out.println("You have chosen the "+p.getWeaponName());//check
				//set the sword to the silverlight
			}
			if(s1 == 2) {
				//the player will be passed the staff he now has
				p.setWeaponName(staff.getName());
				System.out.println("You have chosen the "+p.getWeaponName());
				//set the staff of wind
			}
			
			
			System.out.println(p.getName()+", you must now go to the wild and gain experience, and reach a level of 3 to be able to defeat Gannon");
			this.weaponselection(x);
			break;
			
		}
		else if(x3 == 2) {
			System.out.println("You doomed Hyrule and everyone dies.....\nGAME OVER");
			break;
		}
		else{
			System.out.println("pick a valid option!\n\n");
		}
		}
	}

	public void weaponselection(int x){
	while(true) {	
		System.out.println("You are now at the wilderness, what do you want to do?" + 
				 "\n 1) Fight ghouls" + 
				 "\n 2) Pick food from wild garden");
		int y = sw.nextInt();
		
		if(y == 1) {
			ghoul g = new ghoul();
			//the ghoul will be called and it will attackl your life points
			p.decreaseLifePoints(g.getAtt());
			g.decLifePoints(wp.getAttack());
			p.increaseLevel();
			System.out.println("Life Points: " + p.getLifePoints() +" Level "+ p.getLevel());
		}
		else if(y == 2) {
			System.out.println("You are at the wild garden what would you like to pick and eat?\n1) for apple \n2)for potato");
			int y2 = sw.nextInt();
			if(y2 == 1) {
			//if the user wants an apple, there will be an object of an apple that will heal the players life	
			Apple a = new Apple();
			//call the player classes method and get 
			p.healLifePoints(a.gethp());
			System.out.println("You have " + p.getLifePoints() + " lifepoints");
			}
			else if(y2 == 2)
			{
			Potato potato = new Potato();
			p.healLifePoints(potato.getHP());
			System.out.println("You have " + p.getLifePoints() + " lifepoints");
			}
			
		
		}
		
		if(p.getLevel() >= 3) {
			System.out.println("You are a high enough level to fight Gannon");
			this.bossFight(x);
			break;
		}
	}

	}
	//this is the method that will simulate the boss fight between player and gannon
	public void bossFight(int x) {
		while(true) {
		System.out.println("Would you like to"
				+ "\n1) Go to Gannon's cave and fight him \n or \n"
				+ "2) Do some magical mushrooms from the forest ");
		int z = sw.nextInt();
		
		if (z == 1)
		{
			System.out.println("Gannon is in his layer and says: 'HAHAHA you think you can challenge me?!'");
			if(p.getWeaponName() == sword.getName()) {
			//if you chose the silverlight earlier, its magic alone banishes gannon	
				System.out.println("Gannon: '....Oh no the Silverlight sword'\n"
						+ "The magic of the Silverlight banishes Gannon to the dark realm\n and peace has been restored\n~~VICTORY!~~");
				break;
			}
			else if(p.getWeaponName() == staff.getName()) {
				//the staff does not contain the magic to kill gannon
				System.out.println("Gannon snaps your staff and you die\n GAME OVER");
				break;
			}
			else {
				System.out.println("You came without a weapon and Gannon kills you \n GAME OVER");
			}
			
		}
		else if(z == 2) {
			System.out.println(" You wasted too much time getting high and Gannon\n has used his dark force to destroy Hyrule"
					+ "\n Everyone Died"
					+ "\n GAME OVER");
			break;
		}
	}
	}
}
