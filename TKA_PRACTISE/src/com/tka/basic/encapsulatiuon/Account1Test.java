package com.tka.basic.encapsulatiuon;

public class Account1Test  {
public static void main(String[] args) {
	//for object 1 of class account1
	Account1 ac1 = new Account1();
	ac1.setaccountNumber(3477);
	ac1.setbalance(12.00f);
    System.out.println("ACCOUNT NUMBER = " + ac1.getaccountNumber());
	System.out.println("ACCOUNT BALANCE = " +ac1.getbalance());		
	System.out.println();
	//for object 2 of class account	
	
	Account acc1 =  new Account();
	acc1.setAcno(18000);
	System.out.println("ACC NO " + acc1.getAcno());
}
}
