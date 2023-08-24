package com.tka.basic.ex1;

public class Test {
public static void main(String[]args){
		Product p1 = new Product();
		p1.id = 101 ; p1.name = "pencil"; p1.price = 100;
		
		Product p2 = new Product();
		p2.id = 141 ; p1.name = "pen"; p1.price = 100;
		
		Product p3 = new Product();
		p3.id = 151 ; p1.name = "Book"; p1.price = 100;
		
		Bill b1 = new Bill();
		double ans = b1.genrateBill(p1,p2,p3);
		System.out.println(ans);
		
		
		
}

}
