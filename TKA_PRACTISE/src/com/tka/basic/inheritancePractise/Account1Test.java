package com.tka.basic.inheritancePractise;

public class Account1Test {
public static void main(String[] args) {
//    System.out.println("Create a Bank Account object (A/c No. AB1532) with initial balance of $500:");

	Account1 A1 = new Account1("AB1532",500);

	System.out.println("Deposit $1000 into account AB1532:");
A1.deposit(1000);
System.out.println("CUURENT BALANCE IS " + A1.getbalance());

SavingAccount sa1 = new SavingAccount("SA1025", 1000);
sa1.withdraw(500);
System.out.println("saving account current balance :- $ " + sa1.getbalance() );
}
}
