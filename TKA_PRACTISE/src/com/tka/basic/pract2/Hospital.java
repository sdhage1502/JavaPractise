package com.tka.basic.pract2;
//PRACTISE ARRAY_LIST 

public class Hospital {
 int id;
 String name;
 String Disease;
 int billno;
 int billamount;

 
 @Override
public String toString() {
	return "Hospital [id=" + id + ", name=" + name + ", Disease=" + Disease + ", billno=" + billno + ", billamount="
			+ billamount + "]";

 
 }


public Hospital(int id, String name, String disease, int billno, int billamount) {
	super();
	this.id = id;
	this.name = name;
	Disease = disease;
	this.billno = billno;
	this.billamount = billamount;
}
}
