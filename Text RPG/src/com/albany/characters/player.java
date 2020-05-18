package com.albany.characters;

public class player extends character{
		int lifepoints = 6;
		String name;
		int level = 1;
		int num = 0;
		
		public player() {
			
		}
		public void setLifePoints(int lp) {
			this.lifepoints = lp;
		}
		public void increaseLevel() {
			level++;
		}
		public void decreaseLifePoints(int n) {
			
			num = n;
			lifepoints -= n;
			if(lifepoints <= 0) {
				System.out.println("You are dead");
				System.exit(0);
			}
			
		}
		public void healLifePoints(int n) {
			num = n;
			lifepoints += n;
			if(lifepoints > 6) {
				lifepoints = 6;
			}
		}
		public int getLevel() {
			return level;
		}
		public int getLifePoints() {
			return lifepoints;
		}
	}

