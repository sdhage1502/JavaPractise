package com.tka.basic.encapsulatiuon;

public class Test2 {
public static void main(String[] args) {
	person p1 = new person(125,"shreyash",  21);
	person p2 = new person(124,"yash",  23);
	p1.setAge(19);
	System.out.println(p1);
	p2.setAge(8);
	System.out.println(p2);
p1.setName("aishwarya");
System.out.println(p1);
}
}
