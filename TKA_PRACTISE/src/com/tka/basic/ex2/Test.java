package com.tka.basic.ex2;

public class Test {
public static void main(String[]args)
{
	Student s1 = new Student(); s1.id =101 ;s1.name ="shreyash"; s1.marks = 100;
	Student s2 = new Student(); s2.id =181 ;s1.name ="aishwarya"; s1.marks = 96;
	Student s3 = new Student(); s3.id =151 ;s1.name ="sonu"; s1.marks = 100;
	Student s4 = new Student(); s4.id =131 ;s1.name ="krishna"; s1.marks = 156;
	Student s5 = new Student(); s5.id =121 ;s1.name ="apple"; s1.marks = 178;
	
	StudentFilterClass sf = new StudentFilterClass();
	int count = sf.countAllFirstClass( s1,s2,s3,s4,s5);
	System.out.println(count);
	}


}
 