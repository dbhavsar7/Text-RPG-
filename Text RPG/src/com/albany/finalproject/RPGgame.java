package com.albany.finalproject;
import java.util.Scanner;

import com.albany.characters.player;

public class RPGgame {
	public static void main(String[] args) {
		
	String name;
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("What is your name? ");
	name = sc.next();
	
	//Its instantiating the player
	player p = new player();
	//the input will be sent to the player class
	p.setName(name);

	//this is the start of the options and will loop if invalid input is put in
	while(true) {
	System.out.println(p.getName() + ", you're at home, the cable is out, what do you want to do?\n"
			+ "1) go outside\n"
			+ "2) try magical mushrooms");
		int x1 = sc.nextInt();
		
		if (x1 == 1) {
			System.out.println("What do you want to do now?\n"
					+ "1) go to the wizards house\n"
					+ "2) go to the cave\n"
					+ "3) go back inside\n");
			int x2 = sc.nextInt();
			
			if(x2 == 1) {
				dialogue w = new dialogue(p);
				w.diologue(x2);
				break;
			}
			else if (x2 == 2) {
				System.out.println(" you get eaten by a lion and die\n GAME OVER");
				break;
			}


		}
		else if(x1 == 2) {
			//the player class will be called
			p.decreaseLifePoints(3);
			if(p.getLifePoints() > 0) {
			System.out.println("you wasted an hour of your time getting high, and lost 3 life points, now what?");
			}
			if(p.getLifePoints() <= 0) {
				System.out.println("You're dead! \nGAME OVER");
				break;
			}
			
		}
			
			else {
				System.out.println("pick a valid option!");
				
			}
		
		}
		
}//end main
	}		
		
		
		
		

