package com.tka.basic.pract1;
import java.util.ArrayList;
public class TEST {
  public static void main(String[]args) {
	  
	 A voter1 = new A(101,"punnet",45);
	  A  voter2 = new A(102,"Lordpunnet",35);
	  A  voter3 = new A(103,"punnetsuperstar",25);
	  
	  
	  System.out.println(voter1);
	  System.out.println(voter2);
	  System.out.println(voter3);
	   
	  
	ArrayList<A> a1 = new ArrayList<A>();
	a1.add(voter1);
	a1.add(voter2);
	a1.add(voter3);
    
	 
	for(int i=0;i<a1.size();i++) { 
		System.out.println(a1.get(i));
	
  }
  }
  }
