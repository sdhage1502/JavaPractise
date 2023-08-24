package com.tka.basic.inheritance;

public class Inheritance {
int id;
String name;
double bal;

@Override
public String toString() {
	return "Inheritance [id=" + id + ", name=" + name + ", bal=" + bal + "]";
}
public Inheritance(int id, String name, double bal) {
	super();
	this.id = id;
	this.name = name;
	this.bal = bal;
}
	
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
 

void withdraw(double amount) 
{ if (amount>0)
	bal = bal - amount;
}

void deposit(double amount) {
	if (amount>0)
bal = bal + amount; 
}

void showBalance() {
System.out.println(bal);}

}
