package com.tka.array.practise;

public class Arrayex4 {
public static void main(String[] args) {
	
	ProductEx4 p1 = new ProductEx4(11,"pensil",20,"staionary");
	ProductEx4 p2 = new ProductEx4(10,"book",80,"staionary");
	ProductEx4 p3 = new ProductEx4(12,"pen",50,"staionary");
	ProductEx4 p[]= new ProductEx4[3];	
p[0]=p1;
p[1]=p2;
p[2]=p3;

for (int i=0;i<p.length;i++) {
	p[i].price =(p[i].price = (float) (0.10*p[i].price));
	
	
}
for (int i=0;i<p.length;i++) {
	System.out.println(p[i]);
}
}


}
