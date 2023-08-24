package com.tka.basic.ex4;

public class Order {
	int oid;
	String name;
	String product;
	float ordervalue;
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", name=" + name + ", product=" + product
				+ ", ordervalue=" + ordervalue + "]";
	}
	

}
