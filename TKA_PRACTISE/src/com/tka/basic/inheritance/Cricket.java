package com.tka.basic.inheritance;
// Subclass: Cricket (inherits from Sports)

// TODO Auto-generated constructor stub
public 	class Cricket extends Sport {
	// Additional field specific to Cricket
	private String cricketFormat;

	// Constructor
	public Cricket(String name, int players, String cricketFormat) {
		super(); // Call the constructor of the superclass (Sports)
		this.cricketFormat = cricketFormat;
	}

	// Method to display information about the cricket format
	public void displayCricketFormat() {
		System.out.println("Cricket Format: " + cricketFormat);

	}

	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println();
	}
}


	


