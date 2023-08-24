package com.tka.basic.ex3;
import java.util.ArrayList;
public class StudentFilter {

int countAllFirstClass(ArrayList<Student> list ){
	int count =0;
	
	for (int i=0;i<list.size();i=i+1){
		Student t = list.get(i);
				if(t.marks<=60);
				count =count++;
	}
	
	return count  ;
}

}
