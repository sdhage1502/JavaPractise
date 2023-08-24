package com.tka.basic.encapsulatiuon;

public class PersonTest {
public static void main(String[] args) {
	
	Person1 p1 = new Person1();
	
	
	p1.setName("shreyash" );
	p1.setAge(18 );
	p1.setCountry("india");
	
	p1.setName("AISHWARYA");
p1.setAge(18);
p1.setCountry("india");
	
	
	String name = p1.getName();
	int age = p1.getAge();
	String country = p1.getCountry();
	
	
	System.out.println("NAME :- " + name);
	System.out.println( "AGE :- " + age);
	System.out.println("country :- " + country);
}
}
