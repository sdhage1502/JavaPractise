package com.tka.basic.inheritance;

public class Sport {


	// Main class: Sports
	class Sports {
		// Fields
		String name;
		int players;

		// Constructor
		public Sports(String name, int players) {
			this.name = name;
			this.players = players;
		}

		// Method to display information about the sport
		public void displayInfo() {
			System.out.println("Sport: " + name);
			System.out.println("Number of players: " + players);
		}
	}




}


