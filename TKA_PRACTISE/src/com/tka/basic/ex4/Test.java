package com.tka.basic.ex4;
import java.util.ArrayList;

public class Test {
public static void main(String[]args){
 Order o1 = new Order();
 o1.oid= 101; o1.name ="shreyash" ; o1.product="pen"; o1.ordervalue = 10;
 Order o2 = new Order();
 o2.oid= 122; o2.name ="yash" ; o2.product="pendrive"; o2.ordervalue = 20;
 Order o3 = new Order();
 o3.oid= 111; o3.name ="shre" ; o3.product="pensketch"; o3.ordervalue = 30;
 Order o4 = new Order();
 o4.oid= 121; o4.name ="golu" ; o4.product="pensil"; o4.ordervalue = 40;
 Order o5 = new Order();
 o5.oid= 121; o5.name ="chotu" ; o5.product="pensil"; o5.ordervalue = 420;
//Arraylist
   ArrayList<Order> Orderlist = new ArrayList<Order>();
   Orderlist.add(o1); Orderlist.add(o2); Orderlist.add(o3);
   Orderlist.add(o4); Orderlist.add(o5);


System.out.println(Orderlist.size());

for (int i=0; i<Orderlist.size();++i){
Order t= (Order)Orderlist.get(i);
System.out.println(""+t);
}



}


}
