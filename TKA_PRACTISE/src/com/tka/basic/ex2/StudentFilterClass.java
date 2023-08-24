package com.tka.basic.ex2;

public class StudentFilterClass {
int countAllFirstClass(Student s1,Student s2 ,Student s3 ,Student s4 ,Student s5  ) {
int count = 0;
if (s1.marks>=60)++count;
if (s2.marks>=60)++count;
if (s3.marks>=60)++count;
if (s4.marks>=60)++count;
if (s5.marks>=60)++count;
	return count;
}
}
