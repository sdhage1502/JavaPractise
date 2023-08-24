package com.tka.array.practise2;

public class Bike {
int bikeno;
String bikename;
String mfdate;
int modelno;
@Override
public String toString() {
	return "Bike [bikeno=" + bikeno + ", bikename=" + bikename + ", mfdate=" + mfdate + ", modelno=" + modelno + "]";
}
public Bike(int bikeno, String bikename, String mfdate, int modelno) {
	super();
	this.bikeno = bikeno;
	this.bikename = bikename;
	this.mfdate = mfdate;
	this.modelno = modelno;
}



}
