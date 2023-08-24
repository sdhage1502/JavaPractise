package com.tka.basic.encapsulatiuon;

public class CricleTest {
	public static void main(String[] args) {
		
	
 Cricle c1 =  new Cricle();
 
 c1.setRadius(2);
 
 int radius = c1.getRadius();

 double Area = c1.calculateArea();
  double Perimeter = c1.calculatePerimeter();
 
  System.out.println("RADIUS OF CIRCLE = " + radius);
  System.out.println("AREA OF CIRCLE = " + Area);
 System.out.println("PERIMETER OF CIRCLE = " + Perimeter );
 
 
}}
