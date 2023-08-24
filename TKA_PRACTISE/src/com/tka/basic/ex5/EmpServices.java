package com.tka.basic.ex5;
import java.util.ArrayList;

public class EmpServices {
	
	
	 double avgSalary(ArrayList<Empolyee> elist){
		double sum = 0;
		for (int i=0;i<elist.size();++i){
			Empolyee e = elist.get(i);
			sum = sum + e.salary;
		}
		
		
		
		sum = sum/elist.size();
		
		return sum;
		
		
		
	}
	
	
	
	
	
	

}
