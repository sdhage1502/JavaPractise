package com.tka.basic.inheritance;

public class Vehicle {
 
	int year;
	String model;
	String brand;
	String date;
	
	public Vehicle(int year, String model, String brand) {
		super();
		this.year = year;
		this.model = model;
		this.brand = brand;
		this.date=date;
	}
	 public void mfgplace(String mfgplace) {
		 System.out.println("This vehicle mfg at" + year );
	 }

	 
	
	 
	
}
