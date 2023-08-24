package com.tka.basic.ex1;

public class Bill {
	 double genrateBill(Product p1,Product p2,Product p3){
		 double totalBill = p1.price+p2.price+p3.price;
		totalBill = totalBill - totalBill*0.10;
		 return totalBill;
		 
		 
	 } 

}
