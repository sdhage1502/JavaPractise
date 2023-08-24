package com.tka.basic.ex3;

import java.util.ArrayList;



public class Test {
public static void main(String[]args){

	Student s1 = new Student(); s1.id =101 ;s1.name ="shreyash"; s1.marks = 58;
	Student s2 = new Student(); s2.id =181 ;s1.name ="aishwarya"; s1.marks = 96;
	Student s3 = new Student(); s3.id =151 ;s1.name ="sonu"; s1.marks = 65;
	Student s4 = new Student(); s4.id =131 ;s1.name ="krishna"; s1.marks = 100;
	Student s5 = new Student(); s5.id =121 ;s1.name ="apple"; s1.marks = 78;
	
	
	ArrayList<Student> studlist = new ArrayList<>();
	studlist.add(s1);
	studlist.add(s2);
	studlist.add(s3);
	studlist.add(s4);
	studlist.add(s5);

	StudentFilter Filter = new StudentFilter();
	int r = Filter.countAllFirstClass(studlist);
	System.out.println(r);
}

}
 