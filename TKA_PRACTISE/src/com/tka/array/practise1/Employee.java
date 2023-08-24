package com.tka.array.practise1;

public class Employee {
int eid;
String ename;

float esalary;

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}

public Employee(int eid, String ename, float esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}

}
