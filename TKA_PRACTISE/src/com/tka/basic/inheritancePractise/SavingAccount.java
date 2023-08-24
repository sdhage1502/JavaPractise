package com.tka.basic.inheritancePractise;

public class SavingAccount extends  Account1 {

	public SavingAccount(String accountNo, double balance) {
		super(accountNo, balance);
		
		

	}

	@Override
	public void withdraw(double amount) {
		if(getbalance()-amount < 100  )
			System.out.println("MINIMUM BALANCE REQUIRED IS $100");
		super.withdraw(amount);
	}}
