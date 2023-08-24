package com.tka.basic.pract1;

public class A {
int id;
String name;
int age;


@Override
public String toString() {
	return "A [id=" + id + ", name=" + name + ", age=" + age + "]";
	
	
}


public A(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
}
