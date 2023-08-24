package com.tka.basic.encapsulatiuon;

public class person {
 int no;
 String name;
 int age;

 
  
  public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = this.name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>=20)
	this.age = age;
}
@Override

public String toString() {
	return "person [no=" + no + ", name=" + name + ", age=" + age + "]";
}
public person(int no, String name, int age) {
	super();
	this.no = no;
	this.name = name;
	this.age = age;
}
 
}
