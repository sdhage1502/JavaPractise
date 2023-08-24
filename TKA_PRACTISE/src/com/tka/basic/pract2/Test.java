package com.tka.basic.pract2;

import java.util.ArrayList;
public class Test {
 public static void main(String[]args) {
	
	Hospital h1 = new Hospital (151,"Shreyash", "cold",1250,1000);
	Hospital h2 = new Hospital (152,"gopi", "cold" ,1255,1200);
	Hospital h3 = new Hospital (153,"Shreyash", "cold",1260,1400); 
	
	System.out.println(h1);
	System.out.println(h2);
	System.out.println(h3);
        
    ArrayList<Hospital>hh  = new ArrayList<Hospital>();	
	hh.add(h1);
	hh.add(h2);
	hh.add(h3);
 
 {

	}
	}
}
