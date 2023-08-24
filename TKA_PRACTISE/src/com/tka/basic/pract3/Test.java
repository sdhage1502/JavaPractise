package com.tka.basic.pract3;
import java.util.ArrayList;
public class Test {
	public static void main(String[]args) {
IndianArmy i1 = new IndianArmy(120,"shreyash","Naik",122000,"15jan2002");
IndianArmy i2 = new IndianArmy(130,"shree","Genral",1222000,"22feb2002");
IndianArmy i3 = new IndianArmy(140,"ABHI","COLONEL",222000,"4dec1990");


 ArrayList<IndianArmy>a1 = new ArrayList<IndianArmy>();
 a1.add(i1);
 a1.add(i2);
 a1.add(i3);

System.out.println(i1);
System.out.println(i2);
System.out.println(i3);


	
	}
	
}