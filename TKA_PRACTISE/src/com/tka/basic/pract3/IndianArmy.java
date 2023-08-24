package com.tka.basic.pract3;

public class IndianArmy {
   int id;
   String name;
   String rank;
   double salary;
   String doj;
@Override
public String toString() {
	return "IndianArmy [id=" + id + ", name=" + name + ", rank=" + rank + ", salary=" + salary + ", doj=" + doj + "]";


}
public IndianArmy(int id, String name, String rank, double salary, String doj) {
	super();
	this.id = id;
	this.name = name;
	this.rank = rank;
	this.salary = salary;
	this.doj = doj;
}
}
