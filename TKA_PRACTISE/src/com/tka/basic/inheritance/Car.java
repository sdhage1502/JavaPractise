package com.tka.basic.inheritance;

public class Car extends Vehicle {
public Car(int year, String model, String brand) {
		super(year, model, brand);
		// TODO Auto-generated constructor stub
	}



String mfgdate;
	public void dmfgdate() {
		System.out.println("This car mfg on" + mfgdate);
	}
	


}
