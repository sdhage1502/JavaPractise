package com.tka.array.practise1;



public class Test {
	public static void main(String[] args) {
		
	
		Employee a1 = new Employee(11,"shreyash",20000);
		Employee a2 = new Employee(18,"pushpak",90000);
		Employee a3 = new Employee(17,"yash",50000);
		Employee a4 = new Employee(19,"mihir",80000);
	    
		
		Employee emp[]= new Employee[4];
	    emp[0]=a1; 
	    emp[1]=a2; 
	    emp[2]=a3; 
	    emp[3]=a4;
	 
	    for (int i=0;i<emp.length;++i) {
	 	emp[i].esalary =(float) (emp[i].esalary + 0.10*emp[i].esalary);
	    }
	    
	    for (int i=0;i<emp.length;i++) {
	    	System.out.println(emp[i]);
	    }
	    
	}
}
