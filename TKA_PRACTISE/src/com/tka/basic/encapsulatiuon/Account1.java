package com.tka.basic.encapsulatiuon;
//Write a Java program to create a class called BankAccount with private instance variables 
//accountNumber and balance.
//Provide public getter and setter methods to access and modify these variables.
public class Account1 {

	private int accountNumber;
	private float balance;
//getter and setter
	public  int getaccountNumber(){
	return accountNumber;
	}
 
	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public float getbalance(){
	return balance;
	}
	 
	public void setbalance(float balance) {
		this.balance = balance;
	}


	
}


