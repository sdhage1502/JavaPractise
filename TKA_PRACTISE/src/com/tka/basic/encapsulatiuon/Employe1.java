package com.tka.basic.encapsulatiuon;
// Write a Java program to create a class called Employee with private instance variables
//employee_id, employee_name, and employee_salary.
//Provide public getter and setter methods to access and modify the id and name variables, 
//but provide a getter method for the salary variable that returns a formatted string.
public class Employe1 {
int employee_id;
String employee_name;
double employee_salary;

public int getemployee_id()
{ return employee_id;
 }
void setemployee_id(int employee_id) {
	this.employee_id = employee_id;
	
}
public String getemployee_name() {
	return employee_name;
	
}
void setemployee_name(String employee_name) {
this.employee_name = employee_name;

}
 
public double getemplyee_salary() {
	return employee_salary;
}
void setemployee_salary(double employee_salary) {
	this.employee_salary = employee_salary;
}
public String getFormattedSalary() {
    return String.format("$%.2f", employee_salary);
  }

}



