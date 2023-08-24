package com.tka.basic.inheritancePractise;

public class Rectangle2 extends Shape2 {
double length;
double width;
public Rectangle2(double length, double width) {
	super();
	this.length = length;
	this.width = width;
}
 
double getArea() {
	return length*width;
}


	
}