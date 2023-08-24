package com.tka.array.practise2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b1 = new Bike(12,"RoyalEnfiled","12july2020",151030);
Bike b2 = new Bike(13,"kawasaki","20sep2020",205063);
Bike b3 = new Bike(14,"bmw","15jan2020",689635);
Bike b4 = new Bike(15,"Splendor","12march2020",8856521);

	Bike bb []= new Bike[4];
	bb[0]=b1;
	bb[1]=b2;
	bb[2]=b3;
	bb[3]=b4;
	
	for(int i=0; i<bb.length;i++)
	System.out.println(bb[i]);
	

	
	
	}

}
