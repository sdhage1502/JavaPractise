package com.tka.basic.inheritance;

public class SavingAccount extends Inheritance{
	
public SavingAccount (int id, String name,double bal) {
	super(id,name,bal);
	}

/*double calIntrest (int n) {
	double ans = bal*n*intrate;
	return ans;}*/

void withdraw(double amount) {
	if (bal - amount>=500)
		bal = bal - amount;
	else 
		System.out.println("no money");
	
}

	




}
