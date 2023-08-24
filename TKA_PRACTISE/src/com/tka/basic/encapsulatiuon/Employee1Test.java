package com.tka.basic.encapsulatiuon;

public class Employee1Test {
	
	
public static void main(String[] args) { 
	
	Employe1 emp1 = new Employe1();
	
	emp1.setemployee_id(1250);
	emp1.setemployee_name("shreyash");
    emp1.setemployee_salary(45000);
    
    
    int employee_id = emp1.getemployee_id();
   String employee_name = emp1.getemployee_name();
  
   System.out.println(  "  " + "  " + "EMPLOYEE INFORMATION");
   System.out.println( "  " + "EMPLOYEE ID = " + employee_id);
   System.out.println("  " + "EMPLOYEE NAME = " + employee_name );
   System.out.println("  " + "EMPLOYEE IN HAND SALARY = " + emp1.getFormattedSalary());
 
}

}
