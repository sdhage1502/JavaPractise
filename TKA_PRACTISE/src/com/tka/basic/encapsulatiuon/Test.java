package com.tka.basic.encapsulatiuon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Movie m1 = new Movie(120,"kgf","yash");
 Movie m2 = new Movie(120,"rrr","rrr");
 m2.setMid(123);
 
System.out.println(m2.getMid());
System.out.println(m2);

	}

}
