package com.tka.basic.ex5;
import java.util.ArrayList;


public class Test {
public static void main(String[]args){
//creation of object
	Empolyee e1 = new Empolyee();
	e1.id=101; e1.name = "golu" ; e1.salary = 10000; e1.Profile="SDE"; e1.doj="12jan2020";
	
	Empolyee e2 = new Empolyee();
	e1.id=102; e2.name = "golu" ; e2.salary = 30000; e2.Profile="jr SDE"; e2.doj="12jan2020";
	
	Empolyee e3 = new Empolyee();
	e3.id=103; e3.name = "golu" ; e3.salary = 20000; e3.Profile=" jr SDE"; e3.doj="12jan2020";
	
	Empolyee e4 = new Empolyee();
	e4.id=104; e4.name = "golu" ; e4.salary = 10000; e4.Profile="sr SDE"; e4.doj="12jan2020";
	
	//creation of arraylist
	 ArrayList<Empolyee> es = new ArrayList<Empolyee>();
	  es.add(e1);  es.add(e2);  
	  es.add(e3);  es.add(e4);
	//creation object from EmpServices class file
EmpServices ee = new EmpServices();
double result= ee.avgSalary(es);
System.out.println(result);

}

}
