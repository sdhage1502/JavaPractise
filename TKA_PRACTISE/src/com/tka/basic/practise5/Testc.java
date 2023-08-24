package com.tka.basic.practise5;

public class Testc {

	public static void main(String[] args) {
		 Integer a =  new Integer(10);
		int r = a.intValue();// Object to primitive
		r = r + 1;// Operations
		 a = new Integer(r);//primitive to object
		System.out.println (a) ;
		
		
		
	}

}
