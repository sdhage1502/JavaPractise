package com.tka.basic.encapsulatiuon;

public class Account {

private int acno;
private String name;
private double balance;
//getter and  setter method
public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	if(acno >122000)
   this.acno = acno;
	else 
		System.out.println("jaldi waha se hatoo");
}
public String getName() {
	return name;
}
public void setName(String name) {	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;}

@Override
public String toString() {
	return "Account [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
}

//public Account(int acno, String name, double balance) {
	//super();
	//this.acno = acno;
	//this.name = name;
	//this.balance = balance;
//}



}
