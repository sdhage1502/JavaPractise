package com.tka.basic.inheritancePractise;
//Write a Java program to create a class known as "BankAccount" with methods called deposit() 
//and withdraw().Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance 
//falls below one hundred.
public class Account1 {
String accountNo;
double balance;




public Account1(String accountNo, double balance) {
	super();
	this.accountNo = accountNo;
	this.balance = balance;
}

public void deposit(double amount) {
	balance += amount;
}
 public void withdraw(double amount) {
 if(balance <= amount) {
	 balance -= amount;}
 else {
 System.out.println("Insuffient Balance");
 }
  
 
 }
 
  public double getbalance() {
     return balance;
 }
 
 }









