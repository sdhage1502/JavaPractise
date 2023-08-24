package com.tka.basic.encapsulatiuon;
/*Write a Java program to create a class called Circle with a private instance variable radius. 
  Provide public getter and setter methods to access and modify the radius variable.
  However, provide two methods called calculateArea() and calculatePerimeter() 
  that return the calculated area and perimeter based on the current radius value
 */
public class Cricle {
 
private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}	

public double calculateArea() {
    return Math.PI * radius * radius;
  }
public double calculatePerimeter() {
	return Math.PI*2*radius*radius;
}


}



