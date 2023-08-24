package com.tka.basic.inheritance;

public class Test {
public static void main(String[] args) {
	SavingAccount sa = new SavingAccount (201,"shreyash",20000); 
    sa.deposit(2000);
    sa.withdraw(25000);
    sa.showBalance();
sa.withdraw(20000);
sa.showBalance();
}
}
